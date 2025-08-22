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