# 1431. Kids With the Greatest Number of Candies

**There are `n` kids with candies.**  
사탕을 갖고 있는 `n`명의 아이들이 있다.  

**You are given an integer array `candies`, where each `candies[i]` represents the number of candies the `i`th kid has, and an integer `extraCandies`, denoting the number of extra candies that you have.**  
각 `candies[i]`가 `i`번째 아이가 갖고 있는 사탕의 개수를 나타내고 있는 정수 배열 `candies`와 당신이 갖고 있는 추가 사탕의 개수를 의미하는 정수 `extraCandies`가 주어진다.  

**Return a boolean array `result` of length `n`, where `result[i]` is `true` if, after giving the `i`th kid all the `extraCandies`, they will have the greatest number of candies among all the kids, or `false` otherwise.**  
모든 `extraCandies`를 `i`번째 아이에게 주었을 때, 그 아이가 가장 많은 사탕을 가지게 된다면 `true`를, 아니면 `false`가 `result[i]`의 값인 `n` 길이의 boolean 배열 `result`를 반환하라.  

**Note that multiple kids can have the greatest number of candies.**  
사탕을 가장 많이 가진 아이는 여러 명일 수 있음을 유의하라.  
