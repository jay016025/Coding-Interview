## Encode And Decode Strings

---

### 需求

- 原文
  
  Design an algorithm to encode **a list of strings** to **a string**. The encoded string is then sent over the network and is decoded back to the original list of strings.
  
  Machine 1 (sender) has the function:
  
  ```java
  string encode(vector<string> strs) {
    // ... your code
    return encoded_string;
  }
  ```
  
  Machine 2 (receiver) has the function:
  
  ```java
  vector<string> decode(string s) {
    //... your code
    return strs;
  }
  ```
  
  So Machine 1 does : `string encoded_string = encode(strs);`
  
  and Machine 2 does : `vector<string> strs2 = decode(encoded_string);`
  
  `strs2` in Machine 2 should be the same as `strs` in Machine 1.
  
  Implement the `encode` and `decode` methods.
  
  You are not allowed to solve the problem using any serialize methods (such as `eval`).
  
  

- 中文
  
  設計一算法編碼一個字串集合成一個字串，編碼後的字串隨後通過網路發送，並解碼回原始字串集合。
  
  機器1 (發送者) 具有以下功能 :
  
  ```java
  string encode(vector<string> strs) {
    // ... your code
    return encoded_string;
  ```
  
  機器2 (接收者) 具有以下功能 :
  
  ```java
  vector<string> decode(string s) {
    //... your code
    return strs;
  ```
  
  所以機器1處理  `string encoded_string = encode(strs);`
  
  機器2處理 `vector strs2 = decode(encoded_string);`
  
  機器2處理後的 `strs2` 應該相同於機器1傳入的 `strs` 。
  
  你不可使用任何序列化方法 (例如 `eval`) 來解決問題。



- Constraints :
  
  - 1 <= strs.length <= 200
  
  - 0 <= strs[i].length <= 200
  
  - `strs[i]` contains any possible characters out of `256` valid ASCII characters.

       

---

### 構思

- encode
  
  迭代傳入字串集合，已每個字串的 `長度` 加 `/` 加 `字串本身` 做編碼; (ex: `5/Hello`)

- decode
  
  1. 找出每個斜線的索引值。
  
  2. 將斜線前面紀錄為 `長度` 的字串切出並轉為 `int`。
  
  3. 將從斜線開始的索引加1並搭配上一步找到的 `長度` 切出字串。



---

### 算法複雜度

- 時間複雜度
  
  - encode : O(n)
  
  - decode : O(n)

- 空間複雜度
  
  - encode : O(1)
  
  - decode : O(1)



---

### 題目分類

- String



---




