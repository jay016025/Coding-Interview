## Spiral Matrix

---

### 需求

- 原文 : 
  
  Given an `m x n` `matrix`, return *all elements of the* `matrix` *in spiral order*.

- 中文 : 
  
  給訂一個 `m x n` 的矩陣數組，回傳螺旋排序後的所有元素。

- **Constraints:**
  
  - m == matrix.length
  - n == matrix[i].length
  - 1 <= m, n <= 10
  - -100 <= matrix[i][j] <= 100



---

### 構思

1. 定義矩陣邊界 (上下左右的邊界索引值)

2. 開始以順時鐘方向迭代矩陣
   
   - 需判斷只有一列的情況
   
   - 需判斷只有一行的情況



---

### 算法複雜度

- 時間複雜度 : O(m * n)

- 空間複雜度 : O(1)



---

### 題目分類

- Array
- Matrix

---




