# 1720. Decode XORed Array

**There is a hidden integer array `arr` that consists of `n` non-negative integers.**  
`n`개의 음이 아닌 정수로 구성된 숨겨진 정수 배열 `arr`가 있다.

**It was encoded into another integer array `encoded` of length `n - 1`, such that `encoded[i] = arr[i] XOR arr[i + 1]`.**  
이것은 길이 `n - 1`의 또 다른 정수 배열 `encoded`로 암호화되었으며, `encoded[i] = arr[i] XOR arr[i + 1]`이 성립된다. 

**For example, if `arr = [1,0,2,1]`, then `encoded = [1,2,3]`.**  
예를 들어, `arr = [1,0,2,1]`이면, `encoded = [1,2,3]`이다.

**You are given the `encoded` array. You are also given an integer `first`, that is the first element of `arr`, i.e. `arr[0]`.**  
`encoded`라는 배열이 주어진다. 또한 `arr`의 첫번째 요소, 즉 `arr[0]`인 정수 `first`도 주어진다.

**Return the original array `arr`. It can be proved that the answer exists and is unique.**  
원래의 배열 `arr`를 반환하라. 정답은 존재하고 유일한 것을 증명할 수 있을 것이다.
