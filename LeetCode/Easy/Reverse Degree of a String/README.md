# 3498. Reverse Degree of a String

**Given a string `s`, calculate its reverse degree.**  
문자열 `s`가 주어지면, 이것의 reverse degree를 계산하라.  

**The reverse degree is calculated as follows:**  
reverse degree는 다음을 따른다:  

**1. For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).**  
각 문자에 대해, 뒤집힌 알파벳의 위치값('a' = 26, 'b' = 25, ..., 'z' = 1)과 문자열에서의 위치(1부터 시작하는 인덱스)를 곱한다.  

**2. Sum these products for all characters in the string.**  
문자열의 모든 문자에 대해 계산된 값들을 합산하라.  

**Return the reverse degree of `s`.**  
`s`의 reverse degree를 반환하라.  
