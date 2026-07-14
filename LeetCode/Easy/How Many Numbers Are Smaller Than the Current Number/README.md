# 1365. How Many Numbers Are Smaller Than the Current Number

**Given the array `nums`, for each `nums[i]` find out how many numbers in the array are smaller than it.**  
배열 `nums`가 주어지며, 각각의 `nums[i]`에 대하여 배열에서 자신보다 작은 수가 몇 개인지 찾아낸다.

**That is, for each `nums[i]` you have to count the number of valid `j's` such that `j != i` and `nums[j] < nums[i]`.**  
즉, 각 `nums[i]`마다 `j != i`이고 `nums[j] < nums[i]`를 만족하는 유효한 `j's`의 숫자를 세어야 한다.

**Return the answer in an array.**  
정답을 반환하라.
