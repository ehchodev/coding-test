# 3264. Final Array State After K Multiplication Operations I

**You are given an integer array `nums`, an integer `k`, and an integer `multiplier`.**  
정수 배열 `nums`와 정수 `k`와 `multiplier`가 주어진다.

**You need to perform `k` operations on `nums`. In each operation:**  
당신은 `nums`에 대해 `k`번의 연산을 수행해야 한다. 각 연산마다 수행해야 한다:

- **Find the minimum value `x` in `nums`. If there are multiple occurrences of the minimum value, select the one that appears first.**  
`nums` 안의 최솟값 `x`를 찾아라. 여러 개의 최솟값이 존재할 경우 첫번째로 나타나는 것을 선택하라.

- **Replace the selected minimum value `x` with `x * multiplier`.**  
선택된 최솟값 `x`를 `x * multiplier`로 변환하라.

**Return an integer array denoting the final state of `nums` after performing all `k` operations.**  
`k`번의 연산을 수행한 후의 `nums`의 최종 상태를 나타내는 정수 배열을 반환하라.
