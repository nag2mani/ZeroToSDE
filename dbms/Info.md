# ✅ **DBMS – Complete Topic List for SDE Interviews**

## **1. Core DBMS Fundamentals**

* What is a Database?
* DBMS vs RDBMS
* ACID properties
* Schema, table, row, column
* Primary key, Foreign key, Candidate key
* Views
* Indexes
* Joins (INNER, LEFT, RIGHT, FULL)
* Normalization (1NF → 5NF)
* Denormalization
* Stored procedures
* Triggers
* Functions vs procedures
* Cursors

---

# ⚙️ **2. Query Optimization & Indexing**

### Must-know topics:

* Clustered vs non-clustered index
* Composite/Multicolumn index
* Covering index
* Index selectivity
* Query execution plan
* How indexing improves performance
* Index overhead
* B-tree, B+ tree indexes
* Hash indexes
* When NOT to use an index
* Slow query analysis

---

# 💾 **3. Transactions & Concurrency Control**

* ACID properties
* Transaction states
* Serializability
* Concurrency issues:

  * Dirty read
  * Non-repeatable read
  * Phantom read
* Locking:

  * Shared lock
  * Exclusive lock
  * Intent lock
  * Row-level vs table-level locking
* Deadlocks & detection
* Two-phase locking (2PL)
* Timestamps ordering
* MVCC (MySQL, PostgreSQL)
* Isolation levels:

  * Read Uncommitted
  * Read Committed
  * Repeatable Read
  * Serializable

---

# 📦 **4. SQL vs NoSQL**

### **SQL**

* Relational databases
* ACID consistency
* Joins
* Schema-based

### **NoSQL**

* Document stores (MongoDB)
* Key-value stores (Redis)
* Wide-column stores (Cassandra)
* Graph DBs (Neo4j)
* BASE properties
* Eventual consistency
* CAP theorem

---

# 💥 **5. Distributed Databases**

* CAP theorem
* Sharding
* Replication (sync vs async)
* Data partitioning strategies
* Consistency models
* Leader–follower architecture
* Failover & election
* Distributed transactions
* Two-phase commit (2PC)
* Saga pattern

---

# 🧪 **6. SQL Queries You MUST Know**

* Joins
* Window functions (ROW_NUMBER, RANK, LAG, LEAD)
* Aggregations (GROUP BY, HAVING)
* Subqueries
* CTE
* Case when
* Pagination queries
* Update/delete with conditions
* Self-joins
* Pivot/unpivot
* Transactions

---

# 🧠 **7. Schema Design & Data Modeling**

* E-R diagrams
* Table design
* One-to-many / many-to-many
* Junction tables
* Normalized schema vs document schema
* Star vs snowflake schema

---

# 🔥 **8. Most Asked DBMS Interview Questions (Product-Based)**

## **A. Beginner / Mid-Level SDE**

1. What are ACID properties?
2. Difference between SQL vs NoSQL?
3. What is indexing? Why is it used?
4. What are the different types of indexes?
5. Explain normalization and denormalization.
6. Difference between Primary key, Unique key, Foreign key.
7. What is a join? Explain types of joins.
8. What is a transaction?
9. What are views and why do we use them?
10. What is a trigger?
11. Differences between DELETE, TRUNCATE, DROP.
12. What is MVCC?
13. What are isolation levels?

---

## **B. Medium Difficulty**

14. Explain B-tree vs B+ tree in databases.
15. Why do we need sharding?
16. How does replication work in databases?
17. What are phantom reads?
18. What is query optimization?
19. What is read/write lock?
20. Explain deadlocks and how to prevent them.
21. What is time-stamp ordering protocol?
22. Explain Two-phase commit (2PC).

---

## **C. Advanced / Product-Based (FAANG+)**

23. Design schema for Instagram/Facebook Feed.
24. How do large systems like Amazon handle millions of writes?
25. How does Uber maintain consistency across distributed databases?
26. How do you design a database for a messaging app?
27. Compare MySQL, PostgreSQL, MongoDB, Cassandra.
28. Explain how Redis implements persistence.
29. What is eventual consistency?
30. How does a database recover after crash? (Write-ahead logging)
31. How do databases scale horizontally?
32. What is quorum-based consistency?
33. How does a database handle replication lag?

---

# 📚 **9. LLD + DBMS Questions**

1. Design schema for Zomato / Swiggy.
2. Design table for storing user followers (Twitter).
3. Table design for e-commerce orders.
4. Table design for payment system.
5. Design schema for chat application (WhatsApp).
6. Create normalized schema for a library management system.