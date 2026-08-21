# DSA Coding Problems — Topic Wise

> Problems are grouped by their primary DSA topic. Names, timestamps, and unrelated message details have been removed.

---

# 1. Stack

## 1.1 Delete the Minimum Number of Elements to Make Stack Increasing

**Topic:** Stack, Greedy

Given a stack of integers, remove the minimum number of elements so that, from top to bottom, the remaining elements are strictly increasing.

You may only remove elements from the top during the process, but removed elements cannot be restored.

### Example

**Stack (top → bottom):**

```text
5
3
4
2
1
```

**Output:**

```text
3
4
```

**Number of removals:**

```text
3
```

Determine the minimum removals and print the resulting stack.

---

## 1.2 Sort a Stack Using Only Stack Operations

**Topic:** Stack, Sorting

Given an unsorted stack, sort it in descending order from top to bottom.

You may use only one additional stack.

### Allowed Operations

```text
push
pop
peek
isEmpty
```

You cannot use:

- Arrays
- Lists
- Sorting functions
- Recursion

### Example

**Input stack (top → bottom):**

```text
3
1
4
2
5
```

**Output:**

```text
5
4
3
2
1
```

---

# 2. Arrays

## 2.1 Maximum Subarray Sum — Kadane's Algorithm

**Topic:** Array, Kadane's Algorithm

Given an array of integers, find the contiguous subarray with the largest sum.

---

## 2.2 Rotate Array by K Positions

**Topic:** Array, Rotation

Given an array of `n` elements, rotate the array to the right by `k` positions.

---

## 2.3 Trapping Rain Water

**Topic:** Array, Two Pointers / Prefix-Suffix

Given an elevation map represented by an array of heights, calculate how much rainwater can be trapped after raining.

---

# 3. Monotonic Stack

## 3.1 Next Greater Element

**Topic:** Monotonic Stack, Next Greater Element

Given an array, for each element, find the first greater element to its right.

If no greater element exists, return `-1`.

---

# 4. Dynamic Programming

## 4.1 Longest Common Subsequence

**Topic:** Dynamic Programming, Strings

Given two strings, find the length of their longest common subsequence.

---

## 4.2 Coin Change Problem — Minimum Coins

**Topic:** Dynamic Programming

Given a set of coin denominations and a target amount, find the minimum number of coins required to make that amount.

If the amount cannot be formed using the given coins, return `-1`.

---

## 4.3 Maximize Total Value by Packing Gifts into K Boxes

**Topic:** Dynamic Programming, Partitioning, Arrays

You have `N` gifts of different types.

Pack them into exactly `K` boxes, where each box contains a consecutive subarray of gifts.

The value of each box is equal to the number of distinct gift types present in that box.

Find the maximum possible total value of all `K` boxes.

---

## 4.4 Longest Increasing Path in a Matrix

**Topic:** Dynamic Programming, Matrix, DFS

Given an `m × n` integer matrix, find the length of the longest increasing path.

From a cell, you can move horizontally or vertically to an adjacent cell only if its value is strictly greater than the current cell.

---

# 5. Graph / Matrix Traversal

## 5.1 Number of Islands

**Topic:** Graph Traversal, DFS / BFS, Matrix

Given a 2D grid containing `'1'` representing land and `'0'` representing water, count the number of islands.

An island is formed by connecting adjacent land cells horizontally or vertically.

---

# 6. Greedy / Optimization

## 6.1 Maximum XOR Subset

**Topic:** Bit Manipulation, XOR, Greedy / Linear Basis

Khaled has an array `A` of `N` elements.

It is guaranteed that `N` is even.

He wants to choose at most `N/2` elements from the array.

The selected elements do not need to be consecutive.

Khaled is interested in the XOR of all the elements he chooses.

Find the maximum XOR that can be obtained by choosing at most `N/2` elements from the array.

---

## 6.2 Minimize the Ugliness of a Binary String

**Topic:** Greedy, Strings, Bit Manipulation

You are given a binary string `S` of length `N`.

The ugliness of the string is defined as the decimal number represented by the binary string.

Two operations can be performed:

- Swap any two characters by paying `A` coins.
- Flip any character by paying `B` coins.

Initially, you have `CASH` coins.

Your task is to perform operations such that the ugliness of the string is minimized.

An operation can only be performed if sufficient coins are available, and the corresponding cost is deducted after each operation.

Return the minimum possible ugliness modulo `10^9 + 7`.

---

## 6.3 Minimum Exercises to Become Tired

**Topic:** Greedy, Counting

You decide to go to the gym with `E` units of energy.

There are `N` exercises, and the `i`-th exercise drains `Ai` units of energy.

You become tired when your energy reaches `0` or below.

Each unique exercise can be performed at most twice, because others also need to use the machines.

Find the minimum number of exercises you need to perform to become tired.

If performing all the exercises does not make you tired, return `-1`.

---

## 6.4 Heroes vs Villains

**Topic:** Greedy, Simulation

There are `M` heroes, each having the same health `H`, and `N` villains.

The health of the `i`-th villain is `Vi`.

When a hero with health `H` battles a villain with health `Vi`:

- If `H > Vi`, the villain is defeated and the hero's health decreases by `Vi`.
- If `H < Vi`, the villain wins, its health remains unchanged, and the hero can no longer fight.
- If `H = Vi`, both the hero and villain are defeated.

Heroes fight the villains one by one in their given order.

It may be possible that all heroes are defeated before all villains are defeated.

You are allowed to remove some villains from the front.

Find the minimum number of villains that must be removed from the front so that victory of the heroes is guaranteed.

---

## 6.5 Minimum Days to Create a Downward-Sloping Road

**Topic:** Greedy, Optimization

You are given the sea level `Li` of each segment of a rugged terrain.

You need to transform the terrain into a strictly downward-sloping terrain, meaning:

```text
L[i-1] > L[i]
```

for every segment after the first.

A digging team can reduce the sea level of selected segments.

On day `D`, the team can reduce the sea level of every segment scheduled that day by:

```text
2D - 1
```

meters.

The team can be assigned to multiple segments and can also work on the same segment on multiple days.

Find the minimum number of days required to transform the terrain into the required strictly downward-sloping form.

---

# 7. Strings

## 7.1 Maximum Number of Equal Pieces

**Topic:** Strings, Frequency / Divisors

You are given a string `S` of length `N`.

You can rearrange the characters of the string in any order.

You need to cut the string into contiguous pieces such that all the resulting pieces are equal to one another.

You cannot rearrange the characters inside the pieces or join pieces together.

Find the maximum number of pieces that can be obtained.

You may choose not to cut the string, so the answer is always at least `1`.

---

## 7.2 Minimum Base with Equal Digits

**Topic:** Number Systems, Strings, Mathematics

Given a natural number `M` in decimal representation, convert it into different number bases.

Find the minimum base `B` such that the representation of `M` in base `B` contains only identical digits.

For example:

```text
63 in base 4 = 333
```

where all digits are the same.

Return the minimum possible base.

---

# 8. Arrays + Transformation

## 8.1 Convert an Array into a Mountain

**Topic:** Array, Dynamic Programming / Greedy

You are given an array of size `N`.

You need to change it into a mountain.

A mountain is an array where:

- The elements at both ends are equal.
- Moving from either end toward the middle, each next element is exactly one greater than the previous element.
- The array therefore increases toward the middle and decreases toward both ends.

### Examples of Valid Mountains

```text
[1, 2, 3, 2, 1]

[6, 7, 8, 8, 7, 6]
```

Find the minimum number of elements that need to be changed to make the given array a mountain.

The resulting elements may be negative or zero.

---

# 9. Sliding Window

## 9.1 Maximum Vacation Days

**Topic:** Sliding Window, Two Pointers

Andy wants to take a vacation on an island.

There are `N` consecutive days, numbered from `1` to `N`.

Andy has `M` obligations scheduled on specific days.

He is willing to cancel at most `K` obligations.

He can take only one continuous vacation period.

Find the maximum number of consecutive vacation days Andy can take by cancelling at most `K` obligations.

---

# 10. Bit Manipulation

## 10.1 Maximum XOR Subset

**Topic:** XOR, Bit Manipulation

Khaled has an array `A` of `N` elements.

It is guaranteed that `N` is even.

He wants to choose at most `N/2` elements from the array.

The selected elements do not need to be consecutive.

Khaled is interested in the XOR of all the elements he chooses.

Find the maximum XOR that can be obtained by choosing at most `N/2` elements from the array.

---

## 10.2 Maximum XOR-Sum

**Topic:** Bit Manipulation, XOR, Greedy

You are given an array `A` of length `N` and an integer `K`.

Define:

```text
Xor-sum(x) = (x XOR A[1]) + (x XOR A[2]) + ... + (x XOR A[N])
```

Find the integer `x` in the range `[0, K]` that produces the maximum Xor-sum.

Print only the maximum value of the Xor-sum.

---

# 11. Summary by Topic

| DSA Topic | Problems |
|---|---|
| Stack | Delete the Minimum Number of Elements to Make Stack Increasing |
| Stack + Sorting | Sort a Stack Using Only Stack Operations |
| Array | Maximum Subarray Sum — Kadane's Algorithm |
| Array | Rotate Array by K Positions |
| Array | Trapping Rain Water |
| Monotonic Stack | Next Greater Element |
| Dynamic Programming | Longest Common Subsequence |
| Dynamic Programming | Coin Change Problem — Minimum Coins |
| Dynamic Programming + Partitioning | Maximize Total Value by Packing Gifts into K Boxes |
| Dynamic Programming + Matrix | Longest Increasing Path in a Matrix |
| Graph / Matrix Traversal | Number of Islands |
| Bit Manipulation + XOR | Maximum XOR Subset |
| Greedy + String | Minimize the Ugliness of a Binary String |
| String | Maximum Number of Equal Pieces |
| Greedy + Counting | Minimum Exercises to Become Tired |
| Greedy + Simulation | Heroes vs Villains |
| Array + Transformation | Convert an Array into a Mountain |
| Greedy + Optimization | Minimum Days to Create a Downward-Sloping Road |
| Sliding Window | Maximum Vacation Days |
| Number Systems | Minimum Base with Equal Digits |
| Bit Manipulation + XOR | Maximum XOR-Sum |

---

# 12. Core DSA Patterns Covered

- Stack
- Stack Sorting
- Monotonic Stack
- Next Greater Element
- Arrays
- Kadane's Algorithm
- Array Rotation
- Two Pointers
- Dynamic Programming
- Longest Common Subsequence
- Coin Change
- DP Partitioning
- Graph Traversal
- DFS / BFS
- Matrix Traversal
- Bit Manipulation
- XOR
- Greedy
- Simulation
- String Processing
- Frequency Counting
- Sliding Window
- Number Systems
- Optimization