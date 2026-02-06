### Problems

1. Rope cut problem.
2. String subset. (Concept: Pick and Dont Pick)
3. Josephus problem.
4. [Revise]Permutation of string. [Hint: Need recursion within loop] [Needs more revision - 07/01]
5. Tower of hanoi.
6. Integer Array subset. [Hint: Need backtracking too]
7. Permutation of Int array. [Hint: Need recursion within loop]
8. Letter combination of phone number. [Hint: Its straightforward, recursion within loop and think of recursive call as a nested loop getting executed, also keep in mind of backtracking]
9. Merge sort.
10. Quick Sort. [Hint: Pivot, Partition and swap recursive]
11. [Revise]Combination Sum I - [Hint: Take/Not take approach with backtracking, keep in mind that new ref of collection to create while adding in solution collection]
12. [Revise]Combination Sum II - [Hint: For loop pattern of recursion, keep in mind to skip same element for same position case]
13. Subset - II - [https://leetcode.com/problems/subsets-ii/description/][Hint: For loop pattern like above, for loop itself is base case here]
14. N-Queen. [Leetcode: https://leetcode.com/problems/n-queens/description/]

## Patterns

Subset - Pick and dont pick pattern. Start with empty
Permutation - Use recursion under loop and backtracking


## Cheat Sheet CS1 vs CS2
#CS1
pick arr[i]     → recurse(i)
don't pick     → recurse(i+1)

#CS2
for i in index..n:
    skip same-level duplicates
    pick arr[i]
    recurse(i+1)