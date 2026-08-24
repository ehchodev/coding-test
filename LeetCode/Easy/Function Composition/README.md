# 2629. Function Composition

**Given an array of functions `[f1, f2, f3, ..., fn]`, return a new function `fn` that is the function composition of the array of functions.**  
함수 배열 `[f1, f2, f3, ..., fn]`이 주어지면, 이 함수 배열의 합성 함수인 새 함수 `fn`을 반환하라.

**The function composition of `[f(x), g(x), h(x)]` is `fn(x) = f(g(h(x)))`.**  
`[f(x), g(x), h(x)]`의 합성 함수는 `fn(x) = f(g(h(x)))`이다.

**The function composition of an empty list of functions is the identity function `f(x) = x`.**  
빈 함수 목록의 합성 함수는 항등 함수 `f(x) = x`이다.

**You may assume each function in the array accepts one integer as input and returns one integer as output.**  
배열 안의 각 함수는 한 정수를 입력 받고 한 정수를 반환한다고 가정할 수 있다.
