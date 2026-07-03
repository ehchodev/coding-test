# 2373. Largest Local Values in a Matrix

**You are given an `n x n` integer matrix `grid`.**  
`n x n` 크기의 정수 행렬 `grid`가 주어진다.

**Generate an integer matrix `maxLocal` of size `(n - 2) x (n - 2)` such that:**  
다음 조건에 맞는 `(n - 2) x (n - 2)` 크기의 정수 행렬 `maxLocal`을 생성하라.

- **`maxLocal[i][j]` is equal to the largest value of the `3 x 3` matrix in `grid` centered around row `i + 1` and column `j + 1`.**  
- `maxLocal[i][j]`는 `grid`에서 `i + 1`과 `j + 1` 주위의 `3 x 3` 행렬의 가장 큰 값과 같다.

**In other words, we want to find the largest value in every contiguous `3 x 3` matrix in `grid`.**  
다시 말해서, `grid`에서 모든 연속적인 `3 x 3` 크기의 행렬의 가장 큰 값을 찾길 원한다.

**Return the generated matrix.**  
생성된 행렬을 반환하라.
