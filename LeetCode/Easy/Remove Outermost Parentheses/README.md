# 1021. Remove Outermost Parentheses

**A valid parentheses string is either empty `""`, `"(" + A + ")"`, or `A + B`, where `A` and `B` are valid parentheses strings, and `+` represents string concatenation.**  
유효한 괄호 문자열이란 빈 문자열 `""`, `"(" + A + ")"`, 또는 `A + B` 중 어느 한가지이며, `A`와 `B`는 유효한 괄호 문자열이고, `+`는 이어져 있다는 것을 나타낸다.

- **For example, `""`, `"()"`, `"(())()"`, and `"(()(()))"` are all valid parentheses strings.**  
- 예를 들어, `""`, `"()"`, `"(())()"`, 그리고 `"(()(()))"`은 모두 유효한 괄호 문자열이다.

**A valid parentheses string `s` is primitive if it is nonempty, and there does not exist a way to split it into `s = A + B`, with `A` and `B` nonempty valid parentheses strings.**  
유효한 괄호 문자열 `s`가 비어있지 않고, 비어있지 않은 유효한 괄호 문자열 `A`와 `B`를 `s = A + B`로 쪼갤 수 있는 방법이 존재하지 않을 경우, 이것을 원시 형태라고 한다.

**Given a valid parentheses string `s`, consider its primitive decomposition: `s = P1 + P2 + ... + Pk`, where `Pi` are primitive valid parentheses strings.**  
유효한 괄호 문자열 `s`가 주어질 때, `s = P1 + P2 + ... + Pk`(`Pi`는 더 이상 쪼갤 수 없는 유효한 괄호 문자열)와 같이 더 이상 쪼갤 수 없는 원시 형태로 분해하는 것을 고려하라.

**Return `s` after removing the outermost parentheses of every primitive string in the primitive decomposition of `s`.**  
`s`를 분해한 모든 원시 문자열에서 가장 바깥쪽 괄호를 제거한 후 `s`를 반환하라.
