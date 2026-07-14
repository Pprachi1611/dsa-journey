# Contains Duplicate

## Problem

Given an integer array, return true if any value appears more than once.

Otherwise return false.

---

# Difficulty

⭐ Easy

---

# Topic

- Arrays
- HashSet

---

# Pattern

Remember previously seen elements.

---

# Brute Force

Compare every element with every other element.

Time Complexity

O(n²)

Space Complexity

O(1)

---

# Optimized Approach

Traverse the array.

For every element,

Check whether it already exists in HashSet.

If YES

Duplicate Found.

If NO

Insert the element into HashSet.

Continue.

---

# Why HashSet?

We only care whether the element exists.

No need to store indices.

HashSet stores only unique values.

---

# HashSet Operations

add()

Adds element.

contains()

Checks whether element exists.

---

# Flow

Read Element

↓

Already in HashSet?

YES

↓

Duplicate Found

↓

Return true

NO

↓

Insert Element

↓

Continue

---

# Time Complexity

O(n)

---

# Space Complexity

O(n)

---

# Common Mistakes

❌ Using HashMap when indices are not required.

❌ Using an unnecessary boolean flag.

❌ Continuing after finding the first duplicate.

---

# What I Learned

HashSet is used when only uniqueness matters.

HashMap is used when both key and value are required.

---

# Similar Problems

- Happy Number
- Longest Consecutive Sequence
- Missing Number
- Single Number