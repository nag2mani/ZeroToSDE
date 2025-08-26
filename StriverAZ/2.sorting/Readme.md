## 🔹 Sorting Algorithms Time Complexity Summary

| Algorithm                 | Best Case             | Average Case | Worst Case            | Space Complexity | Stable? |
| ------------------------- | --------------------- | ------------ | --------------------- | ---------------- | ------- |
| **Selection Sort**        | O(n²)                 | O(n²)        | O(n²)                 | O(1)             | ❌ No    |
| **Bubble Sort**           | O(n) (with swap flag) | O(n²)        | O(n²)                 | O(1)             | ✅ Yes   |
| **Insertion Sort**        | O(n)                  | O(n²)        | O(n²)                 | O(1)             | ✅ Yes   |
| **Merge Sort**            | O(n log n)            | O(n log n)   | O(n log n)            | O(n)             | ✅ Yes   |
| **Quick Sort**            | O(n log n)            | O(n log n)   | O(n²)                 | O(log n)         | ❌ No    |
| **Randomized Quick Sort** | O(n log n)            | O(n log n)   | O(n²) (very unlikely) | O(log n)         | ❌ No    |

---

## 🔹 Quick Insights

* **Selection Sort** → Always O(n²), not efficient but simple.
* **Bubble Sort** → Can be O(n) if array is already sorted.
* **Insertion Sort** → Very good for *small or nearly sorted* arrays.
* **Merge Sort** → Always reliable O(n log n), but needs extra memory.
* **Quick Sort** → Fast in practice, but bad pivot gives O(n²).
* **Randomized Quick Sort** → Removes predictable worst-case, expected O(n log n).

---

## 🔹 Mnemonics for Sorting Algorithms

### 1. **Selection Sort**

📝 *Mnemonic:* **“Select the Smallest, Swap it.”**

* Think: Each step you **select** the smallest element and put it at the front.
* Complexity: Always O(n²).
* Not stable.

---

### 2. **Bubble Sort**

📝 *Mnemonic:* **“Big Bubbles Rise.”**

* Think: Largest elements **bubble up** to the end with each pass.
* Complexity: Best O(n) (already sorted), usually O(n²).
* Stable.

---

### 3. **Insertion Sort**

📝 *Mnemonic:* **“Insert like Cards.”**

* Think: Like sorting cards in your hand — take the next card and **insert** it in its place.
* Complexity: Best O(n), worst O(n²).
* Stable.

---

### 4. **Merge Sort**

📝 *Mnemonic:* **“Merge Pieces Together.”**

* Think: Break into halves → sort → **merge** them back in order.
* Complexity: Always O(n log n).
* Stable, but uses extra memory.

---

### 5. **Quick Sort**

📝 *Mnemonic:* **“Quick Pivot Partition.”**

* Think: Pick a pivot → **partition** left smaller, right bigger → recurse.
* Complexity: Best/Avg O(n log n), Worst O(n²).
* Not stable, but very fast in practice.

---

### 6. **Randomized Quick Sort**

📝 *Mnemonic:* **“Random Pivot Prevents Pain.”**

* Think: Choosing a random pivot avoids **worst-case pain** (O(n²)).
* Expected O(n log n).
* Not stable.

---

## 🔹 Super-Mnemonic (One-liner to Remember All)

👉 **“Small Bubbles Inserted Merge Quickly, Randomly.”**

* **Selection → Bubble → Insertion → Merge → Quick → Random Quick**

This one-liner contains all names in order.

* *Small* = Selection
* *Bubbles* = Bubble Sort
* *Inserted* = Insertion Sort
* *Merge* = Merge Sort
* *Quickly* = Quick Sort
* *Randomly* = Randomized Quick Sort
