# Java Packages, Imports, and Function Reuse Guide

## Table of Contents
1. [Understanding Packages](#understanding-packages)
2. [Package Structure and Folder Organization](#package-structure-and-folder-organization)
3. [Import Statements](#import-statements)
4. [Access Modifiers](#access-modifiers)
5. [Static vs Instance Methods](#static-vs-instance-methods)
6. [When You Can and Cannot Reuse Functions](#when-you-can-and-cannot-reuse-functions)
7. [Compilation and Classpath](#compilation-and-classpath)
8. [Best Practices](#best-practices)
9. [Common Examples from This Codebase](#common-examples-from-this-codebase)

---

## Understanding Packages

### What is a Package?
A package in Java is a namespace that organizes classes and interfaces. It helps:
- **Avoid naming conflicts**: Two classes can have the same name if they're in different packages
- **Organize code**: Group related classes together
- **Control access**: Package-private access allows classes in the same package to access each other

### Package Declaration Syntax
```java
package package.name.here;
```

**Rules:**
- Must be the first non-comment statement in a Java file
- Only one package declaration per file
- Package name should match the directory structure

---

## Package Structure and Folder Organization

### How to Decide Which Folder to Make a Package?

#### 1. **Follow Directory Structure**
The package name **MUST** match the directory structure from the root directory.

**Example from this codebase:**
```
Directory Structure:
/Users/nagmani/nag2mani/dsa/problemsolving/striver/
  └── striver_az/
      ├── sorting/
      │   └── QuickSort.java
      └── array/
          └── medium/
              └── NextPermutation.java
```

**Package Declarations:**
- `QuickSort.java` → `package striver.striver_az.sorting;`
- `NextPermutation.java` → `package striver.striver_az.array.medium;`

**Root Directory:** `/Users/nagmani/nag2mani/dsa/problemsolving/` (parent of `striver`)

#### 2. **Naming Conventions**
- Use **lowercase** letters
- Use **reverse domain notation** for uniqueness (e.g., `com.company.project`)
- Separate words with dots (`.`)
- No spaces or special characters

**Good Examples:**
- `striver.striver_az.sorting`
- `com.example.utils`
- `org.apache.commons`

**Bad Examples:**
- `Striver.Striver_AZ.Sorting` (uppercase)
- `striver striver_az sorting` (spaces)
- `striver/striver_az/sorting` (slashes)

#### 3. **Organizational Principles**

**By Feature/Module:**
```
com.company/
  ├── user/
  │   ├── User.java
  │   └── UserService.java
  ├── product/
  │   ├── Product.java
  │   └── ProductService.java
```

**By Layer:**
```
com.company/
  ├── model/
  ├── service/
  ├── controller/
  └── util/
```

**By Difficulty/Type (like this codebase):**
```
striver.striver_az/
  ├── array/
  │   ├── easy/
  │   ├── medium/
  │   └── hard/
  ├── sorting/
  └── basic/
```

---

## Import Statements

### Types of Imports

#### 1. **Single Class Import**
```java
import package.name.ClassName;
```

**Example:**
```java
import striver.striver_az.sorting.QuickSort;
```

#### 2. **Wildcard Import (All Classes from Package)**
```java
import package.name.*;
```

**Example:**
```java
import striver.striver_az.sorting.*;
```

**Note:** Wildcard imports import classes, **NOT** subpackages.

#### 3. **Static Import (For Static Methods/Fields)**
```java
import static package.name.ClassName.methodName;
import static package.name.ClassName.*;
```

**Example:**
```java
import static striver.striver_az.sorting.QuickSort.quick_sort;

// Now you can call directly:
quick_sort(arr, 0, arr.length - 1);
// Instead of:
QuickSort.quick_sort(arr, 0, arr.length - 1);
```

#### 4. **Fully Qualified Name (No Import Needed)**
```java
// Instead of importing, use full name:
striver.striver_az.sorting.QuickSort.quick_sort(arr, 0, arr.length - 1);
```

### Import Rules

1. **Import statements** come after `package` declaration
2. **Order:** package → imports → class declaration
3. **Multiple imports** are allowed
4. **java.lang** package is automatically imported (no need to import `String`, `System`, etc.)

**Example Structure:**
```java
package striver.striver_az.array.medium;

import java.util.Arrays;
import striver.striver_az.sorting.QuickSort;

public class NextPermutation {
    // class code
}
```

---

## Access Modifiers

Access modifiers control **who can access** your methods and classes:

### 1. **public**
- **Accessible from:** Anywhere
- **Use when:** Method/class should be accessible from any package

```java
public class QuickSort {
    public static void quick_sort(int arr[], int start, int end) {
        // Can be called from any class in any package
    }
}
```

### 2. **private**
- **Accessible from:** Only within the same class
- **Use when:** Internal implementation details

```java
public class QuickSort {
    private static void helperMethod() {
        // Can only be called from within QuickSort class
    }
}
```

### 3. **protected**
- **Accessible from:** Same package + subclasses (even in different packages)
- **Use when:** You want inheritance-based access

```java
public class QuickSort {
    protected static void methodForSubclasses() {
        // Accessible in same package and subclasses
    }
}
```

### 4. **Package-Private (Default - No Modifier)**
- **Accessible from:** Only within the same package
- **Use when:** Internal package utilities

```java
class QuickSort {  // No public modifier
    static void packagePrivateMethod() {
        // Only accessible from striver.striver_az.sorting package
    }
}
```

### Access Modifier Summary Table

| Modifier | Same Class | Same Package | Subclass (Different Package) | Different Package |
|----------|------------|--------------|------------------------------|-------------------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `package-private` | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

---

## Static vs Instance Methods

### Static Methods

**Characteristics:**
- Belong to the **class**, not an instance
- Called using **class name**: `ClassName.methodName()`
- **Cannot access** instance variables or instance methods directly
- **Can be called** without creating an object

**Example:**
```java
public class QuickSort {
    public static void quick_sort(int arr[], int start, int end) {
        // Static method
    }
}

// Usage:
QuickSort.quick_sort(arr, 0, arr.length - 1);
// No need to create: QuickSort obj = new QuickSort();
```

**When to Use Static:**
- Utility functions (like `swap`, `sort`, `max`, `min`)
- Methods that don't need object state
- Helper methods that operate on parameters only

### Instance Methods

**Characteristics:**
- Belong to an **instance** of the class
- Called using **object reference**: `object.methodName()`
- **Can access** both instance and static variables
- **Must create** an object first

**Example:**
```java
public class Calculator {
    private int value;  // Instance variable
    
    public void add(int num) {  // Instance method
        this.value += num;
    }
    
    public int getValue() {
        return this.value;
    }
}

// Usage:
Calculator calc = new Calculator();
calc.add(5);
System.out.println(calc.getValue());
```

### Key Differences

| Aspect | Static Method | Instance Method |
|--------|---------------|-----------------|
| **Belongs to** | Class | Object instance |
| **Called with** | `ClassName.method()` | `object.method()` |
| **Access to instance variables** | ❌ No | ✅ Yes |
| **Access to static variables** | ✅ Yes | ✅ Yes |
| **Memory** | One copy (shared) | One per object |
| **Object creation needed** | ❌ No | ✅ Yes |

---

## When You Can and Cannot Reuse Functions

### ✅ When You CAN Reuse Functions

#### 1. **Public Static Methods**
```java
// In QuickSort.java
public class QuickSort {
    public static void quick_sort(int arr[], int start, int end) {
        // Can be used anywhere
    }
}

// In NextPermutation.java
import striver.striver_az.sorting.QuickSort;

public class NextPermutation {
    public static void method() {
        QuickSort.quick_sort(arr, 0, arr.length - 1);  // ✅ Works!
    }
}
```

#### 2. **Public Instance Methods** (with object creation)
```java
// In SomeClass.java
public class SomeClass {
    public void instanceMethod() {
        // Can be used if you create an object
    }
}

// In AnotherClass.java
import package.SomeClass;

public class AnotherClass {
    public static void method() {
        SomeClass obj = new SomeClass();
        obj.instanceMethod();  // ✅ Works!
    }
}
```

#### 3. **Package-Private Methods** (same package)
```java
// In QuickSort.java (package: striver.striver_az.sorting)
class QuickSort {
    static void packageMethod() {
        // No public modifier
    }
}

// In AnotherSort.java (same package: striver.striver_az.sorting)
public class AnotherSort {
    public static void method() {
        QuickSort.packageMethod();  // ✅ Works! (same package)
    }
}
```

#### 4. **Protected Methods** (same package or subclass)
```java
// In ParentClass.java
public class ParentClass {
    protected static void protectedMethod() {
        // Accessible in same package or subclasses
    }
}

// In ChildClass.java (same package)
public class ChildClass {
    public static void method() {
        ParentClass.protectedMethod();  // ✅ Works!
    }
}
```

### ❌ When You CANNOT Reuse Functions

#### 1. **Private Methods**
```java
// In QuickSort.java
public class QuickSort {
    private static void privateMethod() {
        // Cannot be accessed outside QuickSort class
    }
}

// In NextPermutation.java
import striver.striver_az.sorting.QuickSort;

public class NextPermutation {
    public static void method() {
        QuickSort.privateMethod();  // ❌ COMPILATION ERROR!
        // Error: privateMethod() has private access in QuickSort
    }
}
```

#### 2. **Package-Private Methods** (different package)
```java
// In QuickSort.java (package: striver.striver_az.sorting)
class QuickSort {
    static void packageMethod() {
        // No public modifier
    }
}

// In NextPermutation.java (package: striver.striver_az.array.medium)
import striver.striver_az.sorting.QuickSort;

public class NextPermutation {
    public static void method() {
        QuickSort.packageMethod();  // ❌ COMPILATION ERROR!
        // Error: packageMethod() is not public, cannot be accessed from outside package
    }
}
```

#### 3. **Non-Static Methods** (without object)
```java
// In QuickSort.java
public class QuickSort {
    public void instanceMethod() {
        // Not static!
    }
}

// In NextPermutation.java
import striver.striver_az.sorting.QuickSort;

public class NextPermutation {
    public static void method() {
        QuickSort.instanceMethod();  // ❌ COMPILATION ERROR!
        // Error: non-static method cannot be referenced from static context
        
        // ✅ Correct way:
        QuickSort obj = new QuickSort();
        obj.instanceMethod();  // Works!
    }
}
```

#### 4. **Missing Import**
```java
// In NextPermutation.java
// Missing: import striver.striver_az.sorting.QuickSort;

public class NextPermutation {
    public static void method() {
        QuickSort.quick_sort(arr, 0, arr.length - 1);  // ❌ COMPILATION ERROR!
        // Error: cannot find symbol QuickSort
    }
}
```

### Summary: Function Reusability Matrix

| Method Type | Same Class | Same Package | Different Package |
|-------------|------------|--------------|-------------------|
| `private static` | ✅ | ❌ | ❌ |
| `package-private static` | ✅ | ✅ | ❌ |
| `protected static` | ✅ | ✅ | ✅ (if subclass) |
| `public static` | ✅ | ✅ | ✅ |
| `private instance` | ✅ | ❌ | ❌ |
| `package-private instance` | ✅ | ✅ | ❌ |
| `protected instance` | ✅ | ✅ | ✅ (if subclass) |
| `public instance` | ✅ | ✅ | ✅ (with object) |

---

## Compilation and Classpath

### Understanding the Root Directory

The **root directory** for compilation is the directory that contains the **first package name** in your package declaration.

**Example:**
```java
package striver.striver_az.sorting;
```

**Root Directory:** The directory containing the `striver` folder
- In this codebase: `/Users/nagmani/nag2mani/dsa/problemsolving/`
- NOT: `/Users/nagmani/nag2mani/dsa/problemsolving/striver/`

### Compilation Commands

#### 1. **Compile Single File** (with dependencies)
```bash
# From root directory
cd /Users/nagmani/nag2mani/dsa/problemsolving
javac striver/striver_az/sorting/QuickSort.java striver/striver_az/array/medium/NextPermutation.java
```

#### 2. **Compile All Files in Package**
```bash
javac striver/striver_az/sorting/*.java
```

#### 3. **Compile with Classpath**
```bash
javac -cp . striver/striver_az/array/medium/NextPermutation.java
```

### Running Java Programs

#### 1. **Run from Root Directory**
```bash
cd /Users/nagmani/nag2mani/dsa/problemsolving
java -cp . striver.striver_az.array.medium.NextPermutation
```

#### 2. **Run with Classpath**
```bash
java -cp /path/to/root striver.striver_az.array.medium.NextPermutation
```

### Common Compilation Errors

#### Error 1: Wrong Directory
```bash
# ❌ Wrong: Compiling from striver directory
cd /Users/nagmani/nag2mani/dsa/problemsolving/striver
javac striver_az/array/medium/NextPermutation.java
# Error: package striver.striver_az.sorting does not exist
```

**Solution:** Compile from the root directory (parent of `striver`)

#### Error 2: Missing Classpath
```bash
# ❌ Wrong: Running without classpath
java striver.striver_az.array.medium.NextPermutation
# Error: Could not find or load main class
```

**Solution:** Use `-cp .` to set classpath to current directory

#### Error 3: Missing Dependencies
```bash
# ❌ Wrong: Compiling only one file when it depends on another
javac striver/striver_az/array/medium/NextPermutation.java
# Error: cannot find symbol QuickSort
```

**Solution:** Compile all dependent files together

---

## Best Practices

### 1. **Package Naming**
- ✅ Use reverse domain notation: `com.company.project.module`
- ✅ Use lowercase letters
- ✅ Keep package names short but descriptive
- ❌ Don't use single-word packages (except for very small projects)

### 2. **Import Organization**
```java
// ✅ Good: Organized imports
package com.example;

// Standard library imports
import java.util.ArrayList;
import java.util.List;

// Third-party library imports
import org.apache.commons.lang3.StringUtils;

// Your own package imports
import com.example.utils.StringHelper;
```

### 3. **Access Modifiers**
- ✅ Use `private` for internal implementation
- ✅ Use `public` for API that others should use
- ✅ Use `package-private` for internal package utilities
- ✅ Use `protected` sparingly (prefer composition over inheritance)

### 4. **Static vs Instance**
- ✅ Use `static` for utility methods that don't need object state
- ✅ Use instance methods when you need object-specific behavior
- ❌ Don't make everything static (defeats OOP purpose)

### 5. **Function Reuse**
- ✅ Create utility classes with `public static` methods for common operations
- ✅ Group related functions in the same package
- ✅ Document your public API clearly
- ❌ Don't expose internal implementation details (`private` methods)

---

## Common Examples from This Codebase

### Example 1: Reusing QuickSort in NextPermutation

**File Structure:**
```
striver/
  └── striver_az/
      ├── sorting/
      │   └── QuickSort.java (package: striver.striver_az.sorting)
      └── array/
          └── medium/
              └── NextPermutation.java (package: striver.striver_az.array.medium)
```

**QuickSort.java:**
```java
package striver.striver_az.sorting;

public class QuickSort {
    public static void quick_sort(int arr[], int start, int end) {
        // Implementation
    }
}
```

**NextPermutation.java:**
```java
package striver.striver_az.array.medium;
import striver.striver_az.sorting.QuickSort;  // Import statement

public class NextPermutation {
    public static void NextPermutations(int[] arr) {
        // ... code ...
        QuickSort.quick_sort(arr, rmost_peak, n-1);  // Using the function
    }
}
```

**Compilation:**
```bash
cd /Users/nagmani/nag2mani/dsa/problemsolving
javac striver/striver_az/sorting/QuickSort.java striver/striver_az/array/medium/NextPermutation.java
```

**Execution:**
```bash
java -cp . striver.striver_az.array.medium.NextPermutation
```

### Example 2: Using Static Import

**Instead of:**
```java
import striver.striver_az.sorting.QuickSort;
QuickSort.quick_sort(arr, 0, arr.length - 1);
```

**You can use:**
```java
import static striver.striver_az.sorting.QuickSort.quick_sort;
quick_sort(arr, 0, arr.length - 1);  // Direct call without class name
```

### Example 3: Same Package Access

If `QuickSort` and `MergeSort` are in the same package:

**QuickSort.java:**
```java
package striver.striver_az.sorting;

public class QuickSort {
    static void helperMethod() {  // Package-private
        // Can be accessed by MergeSort
    }
}
```

**MergeSort.java:**
```java
package striver.striver_az.sorting;  // Same package

public class MergeSort {
    public static void method() {
        QuickSort.helperMethod();  // ✅ Works! Same package
    }
}
```

---

## Quick Reference Checklist

### ✅ Before Reusing a Function, Check:

1. **Is the method `public`?**
   - ✅ Yes → Can be accessed from any package
   - ❌ No → Check if same package

2. **Is the method `static`?**
   - ✅ Yes → Call with `ClassName.methodName()`
   - ❌ No → Create object first: `new ClassName().methodName()`

3. **Is the import statement correct?**
   - ✅ Check: `import package.name.ClassName;`
   - ✅ Or use fully qualified name

4. **Are you compiling from the correct directory?**
   - ✅ Root directory = parent of first package name
   - ✅ Use `-cp .` when running

5. **Are all dependencies compiled?**
   - ✅ Compile all dependent classes together

---

## Troubleshooting Guide

### Problem: "package does not exist"
**Solution:** 
- Check package declaration matches directory structure
- Compile from the root directory (parent of first package name)

### Problem: "cannot find symbol"
**Solution:**
- Check import statement is correct
- Ensure the class is compiled
- Verify access modifier allows access

### Problem: "non-static method cannot be referenced"
**Solution:**
- Create an object: `ClassName obj = new ClassName();`
- Or make the method `static` if it doesn't need instance state

### Problem: "has private access"
**Solution:**
- Method is `private` and cannot be accessed
- Change to `public` or `protected` if you need to reuse it

### Problem: "is not public, cannot be accessed from outside package"
**Solution:**
- Method is package-private
- Either move to same package or make it `public`

---

## Additional Resources

- [Oracle Java Packages Tutorial](https://docs.oracle.com/javase/tutorial/java/package/index.html)
- [Java Access Modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Static vs Instance Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

---

**Last Updated:** Based on this codebase structure
**Author:** Java Package and Import Guide
