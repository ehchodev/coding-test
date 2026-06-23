# 3838. Weighted Word Mapping

**You are given an array of strings `words`, where each string represents a word containing lowercase English letters.**  
소문자 영문자 단어로 이루어진 문자열 배열 `words`가 주어진다.

**You are also given an integer array `weights` of length 26, where `weights[i]` represents the weight of the `i`th lowercase English letter.**  
또한 `weights[i]`가 `i`번째 소문자 문자의 가중치를 나타내는 길이 26의 정수 배열 `weights`도 주어진다.

**The weight of a word is defined as the sum of the weights of its characters.**  
단어의 가중치는 해당 단어에 대한 문자의 가중치의 합으로 정의된다.

**For each word, take its weight modulo 26 and map the result to a lowercase English letter using reverse alphabetical order (`0 -> 'z', 1 -> 'y', ..., 25 -> 'a'`).**  
각 단어에 대해, 가중치를 26으로 나눈 나머지를 구하고 그 결과를 알파벳의 역순서(`0 -> 'z', 1 -> 'y', ..., 25 -> 'a'`)에 따라 소문자 문자에 매핑한다.

**Return a string formed by concatenating the mapped characters for all words in order.**  
모든 단어에 대해 매핑된 문자들을 순서대로 이어 붙인 문자열을 반환하라.
