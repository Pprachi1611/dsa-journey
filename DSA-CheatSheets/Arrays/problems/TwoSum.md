# Two Sum

## Problem
Given an integer array `nums` and an integer `target`, return the indices of the two numbers whose sum equals the target.

---

# Difficulty

⭐ Easy

---

# Topic

- Arrays
- HashMap

---

# Pattern

Remember previously seen elements.

---

# Brute Force Approach

Compare every pair of elements.

Example:

2 + 7

2 + 11

2 + 15

7 + 11

...

If the sum equals the target, return the indices.

Time Complexity: O(n²)

Space Complexity: O(1)

---

# Optimized Approach

Instead of searching the array again and again,

For every element,

Need = Target - Current Number

Check whether the required number already exists in the HashMap.

If YES

Return the stored index and current index.

Otherwise

Store the current number and its index.

---

# Why HashMap?

HashMap allows O(1) lookup.

Instead of searching the array repeatedly,

we directly check whether the required number has already been seen.

---

# HashMap Structure

Key → Number

Value → Index

Example

2 → 0

7 → 1

11 → 2

15 → 3

---

# Flow

Current Number

↓

Need = Target - Current

↓

Need in HashMap?

YES

↓

Answer Found

NO

↓

Store Current Number → Index

↓

Move Ahead

---

# Time Complexity

O(n)

---

# Space Complexity

O(n)

---

# Common Mistakes

❌ Forgetting to insert elements into HashMap.

❌ Inserting before checking (may use the same element twice).

❌ Returning numbers instead of indices.

❌ Using fixed array length instead of arr.length.

---

# What I Learned

Always think:

"What number do I need?"

instead of checking every possible pair.

HashMap is useful when fast lookup is required.

---

# Similar Problems

- Two Sum II
- Four Sum
- Subarray Sum Equals K
- Intersection of Two Arrays