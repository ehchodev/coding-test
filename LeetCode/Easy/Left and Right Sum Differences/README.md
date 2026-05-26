# 2574. Left and Right Sum Differences

**You are given a 0-indexed integer array `nums` of size `n`.**  
`n` 크기의 0부터 시작하는 정수 배열 `nums`가 주어진다.  

**Define two arrays `leftSum` and `rightSum` where:**  
두 배열 `leftSum`과 `rightSum`을 다음 조건에 따라 정의하라.  

**`leftSum[i]` is the sum of elements to the left of the index `i` in the array `nums`.**  
`leftSum[i]`는 배열 `nums`에서 `i`번째 인덱스의 왼쪽 요소의 합이다.  

**If there is no such element, `leftSum[i] = 0`.**  
해당 요소가 없다면 `leftSum[i] = 0`이다.  

**`rightSum[i]` is the sum of elements to the right of the index `i` in the array `nums`.**  
`rightSum[i]`는 배열 `nums`에서 `i`번째 인덱스의 오른쪽 요소의 합이다.  

**If there is no such element, `rightSum[i] = 0`.**  
해당 요소가 없다면 `rightSum[i] = 0`이다.  

**Return an integer array `answer` of size `n` where `answer[i] = |leftSum[i] - rightSum[i]|`.**  
`answer[i] = |leftSum[i] - rightSum[i]|`인 `n` 크기의 정수 배열 `answer`를 반환하라.  
