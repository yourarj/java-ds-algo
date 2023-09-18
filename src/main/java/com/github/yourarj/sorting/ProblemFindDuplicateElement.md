# 287. Find the Duplicate Number

Given an array of integers `numbers` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is **only one repeated number** in numbers, return *this repeated number*.

You must solve the problem **without** modifying the array `numbers` and uses only constant extra space.

### Example 1:

```
Input: numbers = [1,3,4,2,2]
Output: 2
```

### Example 2:

```
Input: numbers = [3,1,3,4,2]
Output: 3
```

### Constraints:

```
1 <= n <= 105
nums.length == n + 1
1 <= numbers[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
```

### Follow up:

- How can we prove that at least one duplicate number must exist in `numbers`?
- Can you solve the problem in linear runtime complexity?