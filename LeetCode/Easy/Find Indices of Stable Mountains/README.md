# 3285. Find Indices of Stable Mountains

**There are `n` mountains in a row, and each mountain has a height. You are given an integer array `height` where `height[i]` represents the height of mountain `i`, and an integer `threshold`.**  
연속으로 있는 `n`개의 산이 있고, 각 산은 높이를 가진다. 정수 배열 `height`가 주어질 때 `height[i]`는 i번째 산의 높이를 나타내며, `threshold`는 정수이다.

**A mountain is called stable if the mountain just before it (if it exists) has a height strictly greater than `threshold`. Note that mountain 0 is not stable.**  
산은 이전 산의 높이가 'threshold`보다 클 때 안정적이라고 부른다. 0번째 산은 안정적이지 않음을 유의하라.

**Return an array containing the indices of all stable mountains in any order.**  
순서와 상관없이 모든 안정적인 산의 인덱스를 포함한 배열을 반환하라.
