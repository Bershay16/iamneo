# DSA Practice Questions

---

# 1. LeetCode Easy Problems

The following problems are from the Easy-problem list shared by the user.

**LeetCode Easy Problem List:**  
https://leetcode.com/problem-list/wcf6vlwi/

## Problems from the Shared List

1. **LC 1 — Two Sum**
2. **LC 408 — Valid Word Abbreviation**
3. **LC 121 — Best Time to Buy and Sell Stock**
4. **LC 1768 — Merge Strings Alternately**
5. **LC 680 — Valid Palindrome II**
6. **LC 20 — Valid Parentheses**
7. **LC 9 — Palindrome Number**
8. **LC 88 — Merge Sorted Array**
9. **LC 2235 — Add Two Integers**
10. **LC 346 — Moving Average from Data Stream**
11. **LC 14 — Longest Common Prefix**
12. **LC 3105 — Longest Strictly Increasing or Strictly Decreasing Subarray**
13. **LC 13 — Roman to Integer**

---

# 2. Sliding Window Questions

## 1. Employee Access Badge Monitoring

**Topic:** Sliding Window — Longest Substring Without Repeating Characters

A company tracks employee badge swipes as a string of uppercase letters representing employee IDs.

The security team wants to find the longest continuous period during which no employee swiped more than once.

### Input

```text
ABCADEAF
```

### Output

```text
5
```

### Explanation

One longest valid substring is:

```text
BCADE
```

---

## 2. Data Packet Verification

**Topic:** Sliding Window — Permutation in String

A network monitoring system receives a stream of packet codes.

The administrator wants to know whether any continuous segment contains a rearrangement of a critical pattern.

### Input

```text
Pattern : ABC
Stream  : XYCBADZZ
```

### Output

```text
true
```

### Explanation

The stream contains:

```text
CBA
```

`CBA` is a permutation of `ABC`.

---

## 3. Intrusion Detection System

**Topic:** Sliding Window — Find All Anagrams

A cybersecurity team receives a log stream.

They need all positions where an anagram of a suspicious keyword appears.

### Input

```text
Log     : BACDGABCDA
Keyword : ABCD
```

### Output

```text
[0,5,6]
```

---

## 4. Text Compression Analyzer

**Topic:** Sliding Window — Character Replacement

A text compressor may replace at most `K` characters.

Find the longest block that can become a single repeated character after at most `K` replacements.

### Input

```text
String : AABABBA
K      : 1
```

### Output

```text
4
```

---

## 5. Customer Preference Analysis

**Topic:** Sliding Window — At Most K Distinct Characters

A shopping platform stores customer actions as characters.

Find the longest continuous segment containing at most `K` different action types.

### Input

```text
String : AABACBE
K      : 2
```

### Output

```text
4
```

### Explanation

One valid longest segment is:

```text
AABA
```

---

## 6. Password Strength Checker

**Topic:** Sliding Window — Exactly K Distinct Characters

A password is considered balanced if it contains exactly `K` distinct characters.

Count all balanced substrings.

### Input

```text
String : ABCBA
K      : 2
```

### Output

```text
5
```

---

## 7. Chat Moderation System

**Topic:** Sliding Window — Minimum Window Substring

A messaging platform wants the smallest message segment containing all required moderation keywords.

### Input

```text
Message  : ADOBECODEBANC
Required : ABC
```

### Output

```text
BANC
```

---

## 8. DNA Sequence Analysis

**Topic:** Sliding Window — At Least K Repeating Characters

Researchers need the longest DNA segment where every nucleotide appears at least `K` times.

### Input

```text
String : AAABB
K      : 3
```

### Output

```text
3
```

---

## 9. Advertisement Analytics

**Topic:** Sliding Window — Minimum Window Containing All Distinct Characters

A company tracks user clicks represented by letters.

Find the shortest continuous segment containing all distinct click types present in the entire string.

### Input

```text
aabcbcdbca
```

### Output

```text
4
```

### Explanation

The shortest segment is:

```text
dbca
```

---

## 10. Secure Communication Scanner

**Topic:** Minimum Window Subsequence

A communication channel contains encoded messages.

Find the smallest substring that contains another pattern as a subsequence.

### Input

```text
abcdebdde
bde
```

### Output

```text
bcde
```

---

# 3. Monotonic Stack Question

## Greater on Right Side

**Topic:** Monotonic Stack — Next Greater Element

You are given an array `Arr` of size `N`.

Replace every element with the next greatest element on its right.

### Input

```text
N = 6
Arr[] = {16, 17, 4, 3, 5, 2}
```

### Output

```text
17 5 5 5 2 -1
```

### Explanation

For `16`, the greatest element on its right is `17`.

For `17`, the next greater element according to the given example is `5`.

For `4`, it is `5`.

For `3`, it is `5`.

For `5`, it is `2` according to the provided expected output.

For `2`, there is no element on its right, so the result is `-1`.

---

# 4. Question Topics Summary

| Question | Main Topic |
|---|---|
| Employee Access Badge Monitoring | Sliding Window |
| Data Packet Verification | Sliding Window, Permutation |
| Intrusion Detection System | Sliding Window, Anagram |
| Text Compression Analyzer | Sliding Window, Character Replacement |
| Customer Preference Analysis | Sliding Window, At Most K Distinct |
| Password Strength Checker | Sliding Window, Exactly K Distinct |
| Chat Moderation System | Sliding Window, Minimum Window |
| DNA Sequence Analysis | Sliding Window, At Least K Repeating |
| Advertisement Analytics | Sliding Window, Minimum Distinct Window |
| Secure Communication Scanner | Minimum Window Subsequence |
| Greater on Right Side | Monotonic Stack, Next Greater Element |

---

# 5. Main Concepts Covered

## Sliding Window

- Longest valid substring
- Shortest valid substring
- Fixed-size windows
- Variable-size windows
- Character frequency
- Anagram matching
- Permutation matching
- At most `K` distinct characters
- Exactly `K` distinct characters
- At least `K` repeating characters
- Character replacement
- Minimum window

## Monotonic Stack

- Next Greater Element
- Maintaining a stack of useful candidates
- Removing elements that cannot be the answer
- Finding the next greater element efficiently

## Substring vs Subsequence

### Substring

Characters must be continuous.

Example:

```text
abcde
```

`bcd` is a substring.

### Subsequence

Characters must maintain their order but do not need to be continuous.

Example:

```text
abcde
```

`ace` is a subsequence.

The **Secure Communication Scanner** question specifically uses a subsequence.

---

# 6. Practice Order

## Sliding Window

1. Employee Access Badge Monitoring
2. Data Packet Verification
3. Intrusion Detection System
4. Text Compression Analyzer
5. Customer Preference Analysis
6. Password Strength Checker
7. Chat Moderation System
8. DNA Sequence Analysis
9. Advertisement Analytics
10. Secure Communication Scanner

## Monotonic Stack

11. Greater on Right Side

## LeetCode Easy List

Practice the problems from the provided LeetCode Easy list:

**https://leetcode.com/problem-list/wcf6vlwi/**