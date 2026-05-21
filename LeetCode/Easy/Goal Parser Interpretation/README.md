# 1678. Goal Parser Interpretation

**You own a Goal Parser that can interpret a string `command`.**  
당신은 문자열 `command`를 해석할 수 있는 Goal Parser를 소유하고 있다.  

**The `command` consists of an alphabet of `"G"`, `"()"` and/or `"(al)"` in some order.**  
`command`는 정렬되지 않은 `"G"`, `"()"`, `"(al)"` 의 알파벳으로 구성된다.  

**The Goal Parser will interpret `"G"` as the string `"G"`, `"()"` as the string `"o"`, and `"(al)"` as the string `"al"`.**  
Goal Parser는 문자열 `"G"`는 `"G"`로, `"()"`는 `"o"`로, `"al"`은 `"al"`로 해석될 것이다.  

**The interpreted strings are then concatenated in the original order.**  
해석된 문자열들은 원래 순서대로 연결된다.  

**Given the string `command`, return the Goal Parser's interpretation of `command`.**  
`command`가 주어지면, Goal parser의 `command` 해석을 반환하라.  
