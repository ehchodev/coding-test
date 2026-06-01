# 2220. Minimum Bit Flips to Convert Number

**A bit flip of a number `x` is choosing a bit in the binary representation of `x` and flipping it from either `0` to `1` or `1` to `0`.**  
숫자 `x`의 비트 반전은 `x`를 이진수로 표현했을 때 한 비트를 선택하여 `0`은 `1`로, `1`은 `0`으로 뒤집는 것이다.  

**For example, for `x = 7`, the binary representation is `111` and we may choose any bit (including any leading zeros not shown) and flip it.**  
예를 들어 `x = 7`일 경우, 이진수 표현은 `111`이며 아무 비트(표시되지 않은 맨 앞의 0을 포함하여)를 선택하여 뒤집을 수 있다.  

**We can flip the first bit from the right to get `110`, flip the second bit from the right to get `101`, flip the fifth bit from the right (a leading zero) to get `10111`, etc.**  
오른쪽부터 첫 번째 비트를 뒤집으면 `110`을 얻을 수 있고, 그 다음 두 번째 비트를 뒤집으면 `101`을 얻을 수 있고, 다섯 번째 비트(맨 앞의 0)를 뒤집으면 `10111`을 얻을 수 있고, 이런식으로 할 수 있다.  

**Given two integers `start` and `goal`, return the minimum number of bit flips to convert `start` to `goal`.**  
두 정수 `start`와 `goal`이 주어지면, `start`를 `goal`로 바꾸기 위한 비트 반전의 최소 수를 반환하라.  
