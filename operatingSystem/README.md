# **OPERATING SYSTEM – TOPICS FOR SDE INTERVIEWS**

## **1. OS Basics**

* What is an Operating System?
* Types of OS (Batch, Multitasking, Distributed, Real-time)
* Kernel vs User Space
* Monolithic kernel vs Microkernel
* System calls
* Interrupts & traps
* Mode switching (User mode → Kernel mode)

---

## **2. Processes**

* Process vs Program
* Process Control Block (PCB)
* Process states (new, ready, running, waiting, terminated)
* Context switching
* Process scheduling (FCFS, SJF, Priority, Round Robin)
* Dispatch latency

---

## **3. Threads**

* Thread vs Process
* Multi-threading
* User-level vs Kernel-level threads
* Thread scheduling
* Thread lifecycle
* Issues with multithreading (race conditions, deadlocks)

---

## **4. CPU Scheduling**

* Scheduling criteria
* Preemptive vs Non-preemptive scheduling
* FCFS
* SJF
* SRTF
* Round Robin
* Priority scheduling
* Multilevel queue scheduling
* Multilevel feedback queue

---

## **5. Synchronization**

* Critical section problem
* Race conditions
* Locks (Mutex, Spinlock)
* Semaphores (binary/counting)
* Monitors
* Condition variables
* Producer-consumer problem
* Reader-writer problem
* Dining philosopher problem
* Peterson’s algorithm

---

## **6. Deadlocks**

* Deadlock conditions
* Deadlock prevention
* Deadlock avoidance
* Banker's algorithm
* Detection & recovery

---

## **7. Memory Management**

* Logical vs physical address space
* Paging
* Segmentation
* Paging vs segmentation
* Page table
* TLB (Translation Lookaside Buffer)
* Thrashing
* Page fault
* Demand paging
* Multi-level paging
* Virtual memory

---

## **8. Page Replacement Algorithms**

* FIFO
* LRU
* Optimal replacement
* LFU
* Belady’s anomaly

---

## **9. Storage & File Systems**

* File allocation methods (contiguous, linked, indexed)
* Directory structure
* FAT, NTFS, ext4 basics
* Journaling
* File permissions
* Disk scheduling (FCFS, SSTF, SCAN, C-SCAN, LOOK, C-LOOK)

---

## **10. I/O and Device Management**

* DMA (Direct Memory Access)
* Buffering
* Spooling
* I/O scheduling
* Interrupt handling

---

## **11. Linux & System-Level Concepts (Very Important!)**

* Fork(), exec(), wait()
* Pipes
* Signals
* Shell
* Threads in Linux
* Memory layout of a process (stack, heap, text, data)

---

# 🔥 **OS INTERVIEW QUESTIONS ASKED IN PRODUCT-BASED COMPANIES**

## **Basic-Level Questions**

1. What is a process? How is it different from a program?
2. What is a thread? What is the benefit of multithreading?
3. What is a kernel?
4. What are system calls?
5. What is context switching?
6. What is virtual memory?
7. What is a page fault?
8. What is caching?
9. What is demand paging?

---

## **Mid-Level Questions**

10. Difference between process and thread?
11. How does Round Robin scheduling work?
12. What are semaphores?
13. Explain mutex vs semaphore.
14. Explain deadlock. What are its necessary conditions?
15. What is a race condition?
16. What is the purpose of TLB?
17. What is thrashing?
18. Explain LRU page replacement.
19. Explain Banker's algorithm.
20. Explain producer-consumer using semaphores.

---

## **Advance / Product-Based Company Questions**

21. How does fork() work internally?
22. How does exec() replace a process?
23. Explain how a CPU handles interrupts.
24. How does Linux schedule processes?
25. Explain multi-level page tables.
26. Explain the difference between paging and segmentation.
27. How does the OS manage the heap and stack?
28. How do threads share memory?
29. Explain how virtual memory is implemented in Linux.
30. Describe how copy-on-write works after fork().
31. Why does thrashing occur? How can you prevent it?
32. How does OS handle system calls from user mode?
33. How are deadlocks detected in real systems?
34. Explain memory fragmentation and how to reduce it.
35. Explain how context switching impacts performance.

---

## **Linux-Specific (Highly Asked in Amazon, Meta, Uber)**

36. What happens when you run a program in Linux?
37. Difference between fork() and vfork()
38. What are zombie processes?
39. What are orphan processes?
40. Explain pipe() and dup2()
41. What is the difference between pthread and fork()?
42. How does the OS handle signals?

---

# **OS + SDE Practical Scenarios (High-Value Questions)**

43. Design a thread-safe counter.
44. Solve dining philosopher problem.
45. Implement producer-consumer with semaphores.
46. Design a scheduler for a ride-sharing app.
47. How would you implement LRU cache? (very common)
48. How does OS protect memory between processes?
49. How would you debug high CPU usage on a server?
50. Why might a database process go into a deadlock?
