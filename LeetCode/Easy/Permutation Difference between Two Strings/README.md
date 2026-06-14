# 3146. Permutation Difference between Two Strings

**You are given two strings `s` and `t` such that every character occurs at most once in `s` and `t` is a permutation of `s`.**  
두 개의 문자열 `s`와 `t`가 주어지는데, `s` 안의 모든 문자는 각각 최대 한 번씩만 등장하고 `t`는 `s`의 문자를 뒤섞은 순열이다.  

**The permutation difference between `s` and `t` is defined as the sum of the absolute difference between the index of the occurrence of each character in `s` and the index of the occurrence of the same character in `t`.**  
`s`와 `t` 사이의 순열 차이(Permutation difference)는 각 문자가 `s`에서 나타나는 인덱스와 `t`에서 나타나는 같은 문자의 인덱스와의 절대값의 합이다.  

**Return the permutation difference between `s` and `t`.**  
`s`와 `t` 사이의 순열 차이를 반환하라.  
