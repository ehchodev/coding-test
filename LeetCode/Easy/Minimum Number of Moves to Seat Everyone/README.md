# 2037. Minimum Number of Moves to Seat Everyone

**There are `n` availabe seats and `n` students standing in a room.**  
어떤 방에 `n` 개의 앉을 수 있는 의자와 `n` 명의 서 있는 학생이 있다.

**You are given an array `seats` of length `n`, where `seats[i]` is the position of the `ith` seat.**  
길이 `n`의 배열 `seats`가 주어지며, `seats[i]`는 `i`번째 의자의 위치를 가리킨다.

**You are also given the array `students` of length `n`, where `students[j]` is the position of the `jth` student.**  
또한 `n` 길이의 배열 `students`도 주어지며, `students[j]`는 `j`번째 학생의 위치를 가리킨다.

**You may perform the following move any number of times:**  
다음의 이동을 어떤 횟수든 수행할 수 있다.

- **Increase or decrease the position of the `ith` student by `1` (i.e., moving the `ith` student from position `x` to `x + 1` or `x - 1`)**  
`i`번째 학생의 위치를 `1`씩 증가하거나 감소한다. (즉, `i`번째 학생은 `x`의 위치에서 `x + 1` 또는 `x - 1`로 움직인다.)

**Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.**  
어떤 두 학생도 같은 의자에 앉지 않도록 각 학생을 의자로 이동시키는 최소 이동 횟수를 반환하라.

**Note that there may be multiple seats or students in the same position at the beginning.**  
여러 개의 의자 또는 학생들이 동일한 위치에서 시작할 수 있음을 유의하라.
