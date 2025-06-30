# LeetCode Solutions by Category

## Array / String

### 088. Merge Sorted Array `[ Easy ]`
**Problem Statement:** Merge two sorted arrays `nums1` and `nums2` into `nums1` (which has extra space for merging).

**Naive Approach:** Append `nums2` to `nums1` and sort the combined array.  
Time: `O((m+n)`log(m+n)), Space: `O(1)`

**Expected Approach:** Three-pointer backward merge starting from ends of both arrays.  
Time: `O(m+n)`, Space: `O(1)`

### 027. Remove Element `[ Easy ]`
**Problem Statement:** Remove all instances of `val` from `nums` in-place, returning new length.

**Naive Approach:** Shift elements left when encountering `val` (`O(n^2)` worst-case).  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Two-pointer technique with slow/fast pointers.  
Time: `O(n)`, Space: `O(1)`

### 026. Remove Duplicates from Sorted Array `[ Easy ]`
**Problem Statement:** Remove duplicates in-place from sorted array, returning new length.

**Naive Approach:** Compare each element with all others (`O(n^2)`).  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Two-pointer technique with unique element counter.  
Time: `O(n)`, Space: `O(1)`

### 080. Remove Duplicates from Sorted Array II `[ Medium ]`
**Problem Statement:** Remove duplicates beyond first two occurrences in-place.

**Naive Approach:** Nested loops for duplicate checking.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Two-pointer technique with frequency counter.  
Time: `O(n)`, Space: `O(1)`

### 169. Majority Element `[ Easy ]`
**Problem Statement:** Find element appearing > ⌊n/2⌋ times in array.

**Naive Approach:** Count all elements using hashmap.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Boyer-Moore Voting Algorithm.  
Time: `O(n)`, Space: `O(1)`

### 189. Rotate Array `[ Medium ]`
**Problem Statement:** Rotate array to right by `k` steps in-place.

**Naive Approach:** Rotate one step at a time (`O(kn)`).  
Time: `O(kn)`, Space: `O(1)`

**Expected Approach:** Triple-reversal technique.  
Time: `O(n)`, Space: `O(1)`

### 121. Best Time to Buy and Sell Stock `[ Easy ]`
**Problem Statement:** Find max profit from one buy/sell transaction.

**Naive Approach:** Check all buy-sell pairs.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Track min price and max profit in one pass.  
Time: `O(n)`, Space: `O(1)`

### 122. Best Time to Buy and Sell Stock II `[ Medium ]`
**Problem Statement:** Maximize profit with unlimited transactions.

**Naive Approach:** Check all possible transaction combinations.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Sum all ascending price differences.  
Time: `O(n)`, Space: `O(1)`

### 055. Jump Game `[ Medium ]`
**Problem Statement:** Determine if you can reach last index from start.

**Naive Approach:** Backtracking with memoization.  
Time: `O(2^n)`, Space: `O(n)`

**Expected Approach:** Track maximum reachable index greedily.  
Time: `O(n)`, Space: `O(1)`

### 045. Jump Game II `[ Medium ]`
**Problem Statement:** Find minimum jumps to reach end.

**Naive Approach:** BFS-style level traversal.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Greedy BFS with jump boundaries.  
Time: `O(n)`, Space: `O(1)`

### 274. H-Index `[ Medium ]`
**Problem Statement:** Calculate researcher's h-index from citations.

**Naive Approach:** Sort and linear scan for h-index.  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:** Counting sort with prefix sums.  
Time: `O(n)`, Space: `O(n)`

### 380. Insert Delete GetRandom `O(1)` `[ Medium ]`
**Problem Statement:** Design data structure with `O(1)` insert/delete/getRandom.

**Naive Approach:** Use only array (delete `O(n)`) or only hashmap (random `O(n)`).  
Time: GetRandom `O(n)`, Space: `O(n)`

**Expected Approach:** Combine hashmap (val->index) with resizable array.  
Time: `O(1)` all ops, Space: `O(n)`

### 238. Product of Array Except Self `[ Medium ]`
**Problem Statement:** Return array where each element is product of all except itself.

**Naive Approach:** Use division or nested loops.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Left/right prefix product arrays.  
Time: `O(n)`, Space: `O(1)` (excluding output)

### 134. Gas Station `[ Medium ]`
**Problem Statement:** Find starting gas station to complete circuit.

**Naive Approach:** Check every starting point.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Single pass with total gas tracking.  
Time: `O(n)`, Space: `O(1)`

### 135. Candy `[ Hard ]`
**Problem Statement:** Distribute candy with rating constraints using min candies.

**Naive Approach:** Repeated passes until stable.  
Time: `O(n^2)`, Space: `O(n)`

**Expected Approach:** Left-to-right and right-to-left passes.  
Time: `O(n)`, Space: `O(n)`

### 042. Trapping Rain Water `[ Hard ]`
**Problem Statement:** Compute total trapped water between bars.

**Naive Approach:** For each bar, find left/right max.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Two-pointer approach with dynamic programming.  
Time: `O(n)`, Space: `O(1)`

### 013. Roman to Integer `[ Easy ]`
**Problem Statement:** Convert Roman numeral string to integer.

**Naive Approach:** Right-to-left without subtraction handling.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Right-to-left scan with subtraction rules.  
Time: `O(n)`, Space: `O(1)`

### 012. Integer to Roman `[ Medium ]`
**Problem Statement:** Convert integer to Roman numeral string.

**Naive Approach:** If-else chains for each digit.  
Time: `O(1)`, Space: `O(1)`

**Expected Approach:** Predefined value-symbol mapping with greedy selection.  
Time: `O(1)`, Space: `O(1)`

### 058. Length of Last Word `[ Easy ]`
**Problem Statement:** Return length of last word in string.

**Naive Approach:** Split string and get last element.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Traverse backward until space.  
Time: `O(n)`, Space: `O(1)`

### 014. Longest Common Prefix `[ Easy ]`
**Problem Statement:** Find longest common prefix string among array of strings.

**Naive Approach:** Compare each character of first string with all others.  
Time: `O(S)` where S=total chars, Space: `O(1)`

**Expected Approach:** Vertical scanning or divide and conquer.  
Time: `O(S)`, Space: `O(1)`

### 151. Reverse Words in a String `[ Medium ]`
**Problem Statement:** Reverse words in a string (remove extra spaces).

**Naive Approach:** Split and reverse words.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Reverse entire string then reverse each word.  
Time: `O(n)`, Space: `O(1)` (in-place for languages that allow)

### 006. Zigzag Conversion `[ Medium ]`
**Problem Statement:** Convert string to zigzag pattern on given rows.

**Naive Approach:** Simulate zigzag movement with 2D matrix.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Calculate character positions mathematically.  
Time: `O(n)`, Space: `O(n)`

### 028. Find the Index of the First Occurrence in a String `[ Easy ]`
**Problem Statement:** Find first occurrence of needle in haystack.

**Naive Approach:** Check every possible substring.  
Time: `O(n*m)`, Space: `O(1)`

**Expected Approach:** Knuth-Morris-Pratt (KMP) algorithm.  
Time: `O(n+m)`, Space: `O(m)`

### 068. Text Justification `[ Hard ]`
**Problem Statement:** Format words into lines of maxWidth with justified alignment.

**Naive Approach:** Greedy line packing with manual space insertion.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Calculate spaces per line and distribute evenly.  
Time: `O(n)`, Space: `O(n)`

## Two Pointers
### 125. Valid Palindrome `[ Easy ]`
**Problem Statement:** Check if string is palindrome (ignoring non-alphanumeric).

**Naive Approach:** Filter non-alphanumeric then check.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Two pointers with in-place character checks.  
Time: `O(n)`, Space: `O(1)`

### 392. Is Subsequence `[ Easy ]`
**Problem Statement:** Check if s is subsequence of t.

**Naive Approach:** Recursive backtracking.  
Time: `O(2^n)`, Space: `O(n)`

**Expected Approach:** Two pointers traversing t.  
Time: `O(n)`, Space: `O(1)`

### 167. Two Sum II - Input Array Is Sorted `[ Medium ]`
**Problem Statement:** Find two numbers adding to target in sorted array.

**Naive Approach:** Brute-force all pairs.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Two pointers from start and end.  
Time: `O(n)`, Space: `O(1)`

### 011. Container With Most Water `[ Medium ]`
**Problem Statement:** Find container with maximum area from vertical lines.

**Naive Approach:** Check all pairs of lines.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Two pointers converging inward.  
Time: `O(n)`, Space: `O(1)`

### 015. 3Sum `[ Medium ]`
**Problem Statement:** Find all triplets adding to zero.

**Naive Approach:** Three nested loops.  
Time: `O(n^3)`, Space: `O(1)`

**Expected Approach:** Sort + two pointers for each element.  
Time: `O(n^2)`, Space: `O(1)`

## Sliding Window
### 209. Minimum Size Subarray Sum `[ Medium ]`
**Problem Statement:** Find minimal length subarray with sum >= target.

**Naive Approach:** Check all subarrays.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Sliding window with dynamic sizing.  
Time: `O(n)`, Space: `O(1)`

### 003. Longest Substring Without Repeating Characters `[ Medium ]`
**Problem Statement:** Find longest substring with all unique characters.

**Naive Approach:** Check all substrings for uniqueness.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Sliding window with character frequency map.  
Time: `O(n)`, Space: `O(1)`

### 030. Substring with Concatenation of All Words `[ Hard ]`
**Problem Statement:** Find substrings containing all words in any order.

**Naive Approach:** Check all possible substrings.  
Time: `O(n^2)`, Space: `O(m)`

**Expected Approach:** Sliding window with word frequency map.  
Time: `O(n)`, Space: `O(m)`

### 076. Minimum Window Substring `[ Hard ]`
**Problem Statement:** Find minimum window in s containing all chars of t.

**Naive Approach:** Check all possible windows.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Sliding window with two pointers and frequency maps.  
Time: `O(n)`, Space: `O(1)`

## Matrix
### 036. Valid Sudoku `[ Medium ]`
**Problem Statement:** Validate 9x9 Sudoku board (rows/cols/subgrids).

**Naive Approach:** Check rows, cols, subgrids separately.  
Time: `O(1)`, Space: `O(1)`

**Expected Approach:** Single pass with sets for rows/cols/subgrids.  
Time: `O(1)`, Space: `O(1)`

### 054. Spiral Matrix `[ Medium ]`
**Problem Statement:** Return elements of matrix in spiral order.

**Naive Approach:** Simulate spiral with direction changes.  
Time: `O(mn)`, Space: `O(1)`

**Expected Approach:** Layer-by-layer traversal.  
Time: `O(mn)`, Space: `O(1)`

### 048. Rotate Image `[ Medium ]`
**Problem Statement:** Rotate n x n matrix 90 degrees clockwise in-place.

**Naive Approach:** Use extra matrix for rotation.  
Time: `O(n^2)`, Space: `O(n^2)`

**Expected Approach:** Transpose + reverse rows.  
Time: `O(n^2)`, Space: `O(1)`

### 073. Set Matrix Zeroes `[ Medium ]`
**Problem Statement:** Set entire row/col to 0 if element is 0.

**Naive Approach:** Use extra storage for zero positions.  
Time: `O(mn)`, Space: `O(m+n)`

**Expected Approach:** Use first row/col as markers.  
Time: `O(mn)`, Space: `O(1)`

### 289. Game of Life `[ Medium ]`
**Problem Statement:** Apply Conway's Game of Life rules in-place.

**Naive Approach:** Create copy of board for next state.  
Time: `O(mn)`, Space: `O(mn)`

**Expected Approach:** Encode next state in bits.  
Time: `O(mn)`, Space: `O(1)`

## Hashmap
### 383. Ransom Note `[ Easy ]`
**Problem Statement:** Check if ransomNote can be constructed from magazine.

**Naive Approach:** Nested loops checking characters.  
Time: `O(n*m)`, Space: `O(1)`

**Expected Approach:** Frequency count arrays.  
Time: `O(n+m)`, Space: `O(1)`

### 205. Isomorphic Strings `[ Easy ]`
**Problem Statement:** Check if two strings are isomorphic.

**Naive Approach:** Check all character mappings.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Two-way mapping dictionaries.  
Time: `O(n)`, Space: `O(1)`

### 290. Word Pattern `[ Easy ]`
**Problem Statement:** Check if pattern matches word sequence.

**Naive Approach:** Split words and compare lengths then check.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Bi-directional mapping with two dictionaries.  
Time: `O(n)`, Space: `O(n)`

### 242. Valid Anagram `[ Easy ]`
**Problem Statement:** Check if t is anagram of s.

**Naive Approach:** Sort both strings and compare.  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:** Character frequency counter.  
Time: `O(n)`, Space: `O(1)`

### 049. Group Anagrams `[ Medium ]`
**Problem Statement:** Group words that are anagrams together.

**Naive Approach:** Compare all pairs for anagrams.  
Time: `O(n^2 * k)`, Space: `O(n)`

**Expected Approach:** Use sorted word as key in dictionary.  
Time: `O(n k log k)`, Space: `O(n)`

### 001. Two Sum `[ Easy ]`
**Problem Statement:** Find two numbers adding to target.

**Naive Approach:** Check all pairs.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Dictionary to store seen values.  
Time: `O(n)`, Space: `O(n)`

### 202. Happy Number `[ Easy ]`
**Problem Statement:** Determine if number leads to 1 when summing squared digits.

**Naive Approach:** Infinite loop without cycle detection.  
Time: `O(∞)`, Space: `O(1)`

**Expected Approach:** Floyd's cycle detection or hashset.  
Time: `O(log n)`, Space: `O(log n)`

### 219. Contains Duplicate II `[ Easy ]`
**Problem Statement:** Check if duplicate exists within k indices.

**Naive Approach:** Check all pairs within k.  
Time: `O(nk)`, Space: `O(1)`

**Expected Approach:** Sliding window with hashset.  
Time: `O(n)`, Space: `O(k)`

### 128. Longest Consecutive Sequence `[ Medium ]`
**Problem Statement:** Find longest consecutive sequence length.

**Naive Approach:** Sort and scan.  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:** Hashset to detect sequence starts.  
Time: `O(n)`, Space: `O(n)`

## Intervals
### 228. Summary Ranges `[ Easy ]`
**Problem Statement:** Return smallest sorted ranges covering all numbers.

**Naive Approach:** Check each number's neighbors.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Single pass with start/end tracking.  
Time: `O(n)`, Space: `O(1)`

### 056. Merge Intervals `[ Medium ]`
**Problem Statement:** Merge overlapping intervals.

**Naive Approach:** Compare all interval pairs.  
Time: `O(n^2)`, Space: `O(n)`

**Expected Approach:** Sort and merge sequentially.  
Time: `O(n log n)`, Space: `O(n)`

### 057. Insert Interval `[ Medium ]`
**Problem Statement:** Insert new interval into sorted non-overlapping list.

**Naive Approach:** Append then merge all.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Three-phase merge (before, merge, after).  
Time: `O(n)`, Space: `O(n)`

### 452. Minimum Number of Arrows to Burst Balloons `[ Medium ]`
**Problem Statement:** Find min arrows to burst all overlapping balloons.

**Naive Approach:** Greedy selection without sorting.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Sort by end points and greedy selection.  
Time: `O(n log n)`, Space: `O(1)`

## Stack
### 020. Valid Parentheses `[ Easy ]`
**Problem Statement:** Check if parentheses are balanced.

**Naive Approach:** Recursive removal of pairs.  
Time: `O(n^2)`, Space: `O(n)`

**Expected Approach:** Stack for opening brackets.  
Time: `O(n)`, Space: `O(n)`

### 071. Simplify Path `[ Medium ]`
**Problem Statement:** Simplify Unix-style absolute path.

**Naive Approach:** Split and handle ".." with conditionals.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Stack for directory names.  
Time: `O(n)`, Space: `O(n)`

### 155. Min Stack `[ Medium ]`
**Problem Statement:** Design stack with `O(1)` push, pop, and getMin.

**Naive Approach:** Scan stack for min.  
Time: `O(n)` for getMin, Space: `O(1)`

**Expected Approach:** Store (current, current_min) pairs.  
Time: `O(1)` all ops, Space: `O(n)`

### 150. Evaluate Reverse Polish Notation `[ Medium ]`
**Problem Statement:** Evaluate arithmetic expression in postfix notation.

**Naive Approach:** Parse tokens with recursion.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Stack for operands.  
Time: `O(n)`, Space: `O(n)`

### 224. Basic Calculator `[ Hard ]`
**Problem Statement:** Evaluate expression with +, -, and parentheses.

**Naive Approach:** Recursive descent parsing.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Stack for signs and results.  
Time: `O(n)`, Space: `O(n)`

## Linked List
### 141. Linked List Cycle `[ Easy ]`
**Problem Statement:** Detect cycle in linked list.

**Naive Approach:** Store visited nodes in hashset.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Floyd's Tortoise and Hare.  
Time: `O(n)`, Space: `O(1)`

### 002. Add Two Numbers `[ Medium ]`
**Problem Statement:** Add two numbers represented as reverse linked lists.

**Naive Approach:** Convert to integers then back.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Digit-by-digit addition with carry.  
Time: `O(n)`, Space: `O(1)`

### 021. Merge Two Sorted Lists `[ Easy ]`
**Problem Statement:** Merge two sorted linked lists.

**Naive Approach:** Create new list with all nodes.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** In-place merge with pointer manipulation.  
Time: `O(n)`, Space: `O(1)`

### 138. Copy List with Random Pointer `[ Medium ]`
**Problem Statement:** Deep copy list with random pointers.

**Naive Approach:** Two passes with mapping dictionary.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Weave new nodes and separate.  
Time: `O(n)`, Space: `O(1)`

### 092. Reverse Linked List II `[ Medium ]`
**Problem Statement:** Reverse linked list from position left to right.

**Naive Approach:** Extract sublist, reverse, and reinsert.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Four-pointer in-place reversal.  
Time: `O(n)`, Space: `O(1)`

### 025. Reverse Nodes in k-Group `[ Hard ]`
**Problem Statement:** Reverse nodes k at a time.

**Naive Approach:** Recursively reverse groups.  
Time: `O(n)`, Space: `O(n/k)`

**Expected Approach:** Iterative reversal with dummy node.  
Time: `O(n)`, Space: `O(1)`

### 019. Remove Nth Node From End of List `[ Medium ]`
**Problem Statement:** Remove nth node from end of list.

**Naive Approach:** Two passes (count nodes first).  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Two pointers with n-node gap.  
Time: `O(n)`, Space: `O(1)`

### 082. Remove Duplicates from Sorted List II `[ Medium ]`
**Problem Statement:** Remove all duplicate nodes (keep distinct).

**Naive Approach:** Two loops for duplicates.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Single pass with dummy head.  
Time: `O(n)`, Space: `O(1)`

### 061. Rotate List `[ Medium ]`
**Problem Statement:** Rotate list right by k places.

**Naive Approach:** Rotate one by one.  
Time: `O(kn)`, Space: `O(1)`

**Expected Approach:** Connect tail to head and break at new tail.  
Time: `O(n)`, Space: `O(1)`

### 086. Partition List `[ Medium ]`
**Problem Statement:** Partition list around value x.

**Naive Approach:** Create two new lists.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Two dummy heads for before/after.  
Time: `O(n)`, Space: `O(1)`

### 146. LRU Cache `[ Medium ]`
**Problem Statement:** Design LRU cache with `O(1)` get/put.

**Naive Approach:** Array/list with timestamps.  
Time: `O(n)` for get/put, Space: `O(1)`

**Expected Approach:** Hashmap + doubly linked list.  
Time: `O(1)` all ops, Space: `O(capacity)`

## Binary Tree General
### 104. Maximum Depth of Binary Tree `[ Easy ]`
**Problem Statement:** Find max depth of binary tree.

**Naive Approach:** Level-order traversal.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Recursive DFS.  
Time: `O(n)`, Space: `O(h)`

### 100. Same Tree `[ Easy ]`
**Problem Statement:** Check if two trees are identical.

**Naive Approach:** Serialize both trees.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Recursive comparison.  
Time: `O(n)`, Space: `O(h)`

### 226. Invert Binary Tree `[ Easy ]`
**Problem Statement:** Mirror the binary tree.

**Naive Approach:** Store inverted tree separately.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Recursive swap of left/right subtrees.  
Time: `O(n)`, Space: `O(h)`

### 101. Symmetric Tree `[ Easy ]`
**Problem Statement:** Check if tree is mirror of itself.

**Naive Approach:** Serialize left/right subtrees.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Recursive helper (left, right).  
Time: `O(n)`, Space: `O(h)`

### 105. Construct Binary Tree from Preorder and Inorder Traversal `[ Medium ]`
**Problem Statement:** Build tree from preorder and inorder lists.

**Naive Approach:** Linear search for root in inorder.  
Time: `O(n^2)`, Space: `O(n)`

**Expected Approach:** Hashmap for inorder positions + recursion.  
Time: `O(n)`, Space: `O(n)`

### 106. Construct Binary Tree from Inorder and Postorder Traversal `[ Medium ]`
**Problem Statement:** Build tree from inorder and postorder lists.

**Naive Approach:** Linear search for root in inorder.  
Time: `O(n^2)`, Space: `O(n)`

**Expected Approach:** Hashmap for inorder positions + recursion.  
Time: `O(n)`, Space: `O(n)`

### 117. Populating Next Right Pointers in Each Node II `[ Medium ]`
**Problem Statement:** Connect each node to its next right node.

**Naive Approach:** Level-order traversal with queue.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Use existing next pointers (linked list per level).  
Time: `O(n)`, Space: `O(1)`

### 114. Flatten Binary Tree to Linked List `[ Medium ]`
**Problem Statement:** Flatten tree to right-skewed list in-place.

**Naive Approach:** Store nodes in list then reconnect.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Morris traversal with right pointer manipulation.  
Time: `O(n)`, Space: `O(1)`

### 112. Path Sum `[ Easy ]`
**Problem Statement:** Check if root-to-leaf path sums to target.

**Naive Approach:** Store all paths.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** DFS with decreasing target.  
Time: `O(n)`, Space: `O(h)`

### 129. Sum Root to Leaf Numbers `[ Medium ]`
**Problem Statement:** Sum all root-to-leaf numbers.

**Naive Approach:** Store all numbers then sum.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** DFS with current number builder.  
Time: `O(n)`, Space: `O(h)`

### 124. Binary Tree Maximum Path Sum `[ Hard ]`
**Problem Statement:** Find max path sum (any to any).

**Naive Approach:** Consider all paths.  
Time: `O(n^2)`, Space: `O(h)`

**Expected Approach:** DFS returning max single path, track global max.  
Time: `O(n)`, Space: `O(h)`

### 173. Binary Search Tree Iterator `[ Medium ]`
**Problem Statement:** Design BST iterator with next() and hasNext().

**Naive Approach:** Store inorder traversal.  
Time: `O(1)` per op, Space: `O(n)`

**Expected Approach:** Controlled iterative inorder traversal.  
Time: `O(1)` avg per op, Space: `O(h)`

### 222. Count Complete Tree Nodes `[ Easy ]`
**Problem Statement:** Count nodes in complete binary tree.

**Naive Approach:** Traverse entire tree.  
Time: `O(n)`, Space: `O(h)`

**Expected Approach:** Compare left/right subtree heights.  
Time: `O((log n)`^2), Space: `O(1)`

### 236. Lowest Common Ancestor of a Binary Tree `[ Medium ]`
**Problem Statement:** Find LCA of two nodes.

**Naive Approach:** Store paths to both nodes.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Recursive DFS returning found nodes.  
Time: `O(n)`, Space: `O(h)`

## Binary Tree BFS
### 199. Binary Tree Right Side View `[ Medium ]`
**Problem Statement:** Return rightmost node of each level.

**Naive Approach:** Full BFS then take last element.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** BFS taking last node per level.  
Time: `O(n)`, Space: `O(n)`

### 637. Average of Levels in Binary Tree `[ Easy ]`
**Problem Statement:** Return average value per tree level.

**Naive Approach:** Store all values per level.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** BFS tracking level sums and counts.  
Time: `O(n)`, Space: `O(n)`

### 102. Binary Tree Level Order Traversal `[ Medium ]`
**Problem Statement:** Return level-order traversal as nested lists.

**Naive Approach:** DFS with level parameter.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** BFS with queue.  
Time: `O(n)`, Space: `O(n)`

### 103. Binary Tree Zigzag Level Order Traversal `[ Medium ]`
**Problem Statement:** Return zigzag level-order traversal.

**Naive Approach:** BFS then reverse every other level.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** BFS with direction flag.  
Time: `O(n)`, Space: `O(n)`

## Binary Search Tree
### 530. Minimum Absolute Difference in BST `[ Easy ]`
**Problem Statement:** Find min absolute difference between BST nodes.

**Naive Approach:** Inorder traversal then pairwise diff.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Inorder traversal tracking previous.  
Time: `O(n)`, Space: `O(h)`

### 230. Kth Smallest Element in a BST `[ Medium ]`
**Problem Statement:** Find kth smallest element in BST.

**Naive Approach:** Inorder traversal to kth element.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Iterative inorder traversal.  
Time: `O(k)`, Space: `O(h)`

### 098. Validate Binary Search Tree `[ Medium ]`
**Problem Statement:** Check if tree is valid BST.

**Naive Approach:** Check min/max per node without propagation.  
Time: `O(n^2)`, Space: `O(h)`

**Expected Approach:** DFS with valid range boundaries.  
Time: `O(n)`, Space: `O(h)`

## Graph General
### 200. Number of Islands `[ Medium ]`
**Problem Statement:** Count islands in 2D grid.

**Naive Approach:** Nested loops without DFS/BFS.  
Time: `O(nm)`, Space: `O(1)`

**Expected Approach:** DFS/BFS marking visited land.  
Time: `O(nm)`, Space: `O(min(n,m)`) or `O(nm)`

### 130. Surrounded Regions `[ Medium ]`
**Problem Statement:** Flip surrounded 'O's to 'X's.

**Naive Approach:** Check each 'O' for border connection.  
Time: `O(n^2m^2)`, Space: `O(nm)`

**Expected Approach:** DFS from border 'O's then flip inner.  
Time: `O(nm)`, Space: `O(nm)`

### 133. Clone Graph `[ Medium ]`
**Problem Statement:** Deep copy undirected graph.

**Naive Approach:** Serialize nodes then build graph.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** BFS/DFS with node mapping.  
Time: `O(n)`, Space: `O(n)`

### 399. Evaluate Division `[ Medium ]`
**Problem Statement:** Compute division queries from equations.

**Naive Approach:** Repeated BFS for each query.  
Time: `O(q * (v+e)`), Space: `O(e)`

**Expected Approach:** Precompute graph and use union-find/BFS.  
Time: `O(q * (v+e)`), Space: `O(e)`

### 207. Course Schedule `[ Medium ]`
**Problem Statement:** Check if course graph has cycle.

**Naive Approach:** Check all paths for cycles.  
Time: `O(n^2)`, Space: `O(n)`

**Expected Approach:** Topological sort (Kahn's or DFS).  
Time: `O(n+e)`, Space: `O(n)`

### 210. Course Schedule II `[ Medium ]`
**Problem Statement:** Return valid course order.

**Naive Approach:** Brute-force permutations.  
Time: `O(n!)`, Space: `O(n)`

**Expected Approach:** Topological sort with queue/stack.  
Time: `O(n+e)`, Space: `O(n)`

## Graph BFS
### 909. Snakes and Ladders `[ Medium ]`
**Problem Statement:** Find min moves on snakes/ladders board.

**Naive Approach:** Backtracking.  
Time: `O(6^n)`, Space: `O(n)`

**Expected Approach:** BFS with visited tracking.  
Time: `O(n)`, Space: `O(n)`

### 433. Minimum Genetic Mutation `[ Medium ]`
**Problem Statement:** Find min mutations from start to end gene.

**Naive Approach:** Check all mutation paths.  
Time: `O(4^n)`, Space: `O(n)`

**Expected Approach:** BFS with gene mutation steps.  
Time: `O(n * 4^8)`, Space: `O(n)`

### 127. Word Ladder `[ Hard ]`
**Problem Statement:** Find shortest word chain from begin to end.

**Naive Approach:** Backtracking with dictionary.  
Time: `O(n! * m)`, Space: `O(n)`

**Expected Approach:** Bidirectional BFS.  
Time: `O(n * m^2)`, Space: `O(n)`

## Trie
### 208. Implement Trie (Prefix Tree) `[ Medium ]`
**Problem Statement:** Implement trie with insert, search, startsWith.

**Naive Approach:** Store all words in list.  
Time: `O(n)` per search, Space: `O(1)`

**Expected Approach:** Trie node with children array/map.  
Time: `O(L)` per op, Space: `O(n*L)`

### 211. Design Add and Search Words Data Structure `[ Medium ]`
**Problem Statement:** Add/search words (with '.' wildcard).

**Naive Approach:** Linear search with regex.  
Time: `O(n*L)`, Space: `O(1)`

**Expected Approach:** Trie with DFS for wildcards.  
Time: `O(L)` for add, `O(min(26^d, n)`) for search, Space: `O(n*L)`

### 212. Word Search II `[ Hard ]`
**Problem Statement:** Find all words from dictionary in grid.

**Naive Approach:** DFS for each word.  
Time: `O(w * n * m * 4^L)`, Space: `O(w*L)`

**Expected Approach:** Trie + DFS (backtracking with pruning).  
Time: `O(n * m * 4^L)`, Space: `O(w*L)`

## Backtracking
### 017. Letter Combinations of a Phone Number `[ Medium ]`
**Problem Statement:** Generate all letter combos for digit string.

**Naive Approach:** Nested loops for each digit.  
Time: `O(4^n)`, Space: `O(4^n)`

**Expected Approach:** Backtracking with path builder.  
Time: `O(4^n)`, Space: `O(n)`

### 077. Combinations `[ Medium ]`
**Problem Statement:** Generate all combinations of size k from 1 to n.

**Naive Approach:** Generate all subsets then filter.  
Time: `O(2^n)`, Space: `O(C(n,k)`)

**Expected Approach:** Backtracking with start index.  
Time: `O(C(n,k)`), Space: `O(k)`

### 046. Permutations `[ Medium ]`
**Problem Statement:** Generate all permutations of distinct nums.

**Naive Approach:** Heap's algorithm.  
Time: `O(n!)`, Space: `O(n!)`

**Expected Approach:** Backtracking with swapping.  
Time: `O(n!)`, Space: `O(n)`

### 039. Combination Sum `[ Medium ]`
**Problem Statement:** Find combos that sum to target (reuse allowed).

**Naive Approach:** Generate all subsets then filter.  
Time: `O(2^n)`, Space: `O(target)`

**Expected Approach:** Backtracking with sorting and index reuse.  
Time: `O(2^n)`, Space: `O(target)`

### 052. N-Queens II `[ Hard ]`
**Problem Statement:** Count solutions to n-queens.

**Naive Approach:** Generate all permutations then check.  
Time: `O(n!)`, Space: `O(n)`

**Expected Approach:** Backtracking with diagonal checks.  
Time: `O(n!)`, Space: `O(n)`

### 022. Generate Parentheses `[ Medium ]`
**Problem Statement:** Generate all valid n-pair parentheses.

**Naive Approach:** Generate all then validate.  
Time: `O(2^(2n)`), Space: `O(2^(2n)`)

**Expected Approach:** Backtracking with open/close counters.  
Time: `O(4^n/√n)`, Space: `O(n)`

### 079. Word Search `[ Medium ]`
**Problem Statement:** Check if word exists in grid.

**Naive Approach:** Check all paths for word.  
Time: `O(n * m * 4^L)`, Space: `O(L)`

**Expected Approach:** DFS backtracking with pruning.  
Time: `O(n * m * 4^L)`, Space: `O(L)`

## Divide & Conquer
### 108. Convert Sorted Array to Binary Search Tree `[ Easy ]`
**Problem Statement:** Build height-balanced BST from sorted array.

**Naive Approach:** Insert middle recursively.  
Time: `O(n)`, Space: `O(log n)`

**Expected Approach:** Find middle as root, recurse left/right.  
Time: `O(n)`, Space: `O(log n)`

### 148. Sort List `[ Medium ]`
**Problem Statement:** Sort linked list in `O(n log n)`.

**Naive Approach:** Convert to array, sort, rebuild.  
Time: `O(n log n)`, Space: `O(n)`

**Expected Approach:** Merge sort (find mid, sort halves, merge).  
Time: `O(n log n)`, Space: `O(log n)`

### 427. Construct Quad Tree `[ Medium ]`
**Problem Statement:** Build quad tree from grid.

**Naive Approach:** Check entire grid uniformity.  
Time: `O(n^2)`, Space: `O(log n)`

**Expected Approach:** Recursive partitioning.  
Time: `O(n^2)`, Space: `O(log n)`

### 023. Merge k Sorted Lists `[ Hard ]`
**Problem Statement:** Merge k sorted lists.

**Naive Approach:** Merge lists one by one.  
Time: `O(kn)`, Space: `O(1)`

**Expected Approach:** Min-heap or divide and conquer merge.  
Time: `O(n log k)`, Space: `O(1)` for DC, `O(k)` for heap

## Kadane's Algorithm
### 053. Maximum Subarray `[ Medium ]`
**Problem Statement:** Find contiguous subarray with max sum.

**Naive Approach:** Check all subarrays.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Kadane's algorithm.  
Time: `O(n)`, Space: `O(1)`

### 918. Maximum Sum Circular Subarray `[ Medium ]`
**Problem Statement:** Find max sum subarray in circular array.

**Naive Approach:** Consider all rotations.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** Kadane's for circular case (max subarray or total - min subarray).  
Time: `O(n)`, Space: `O(1)`

## Binary Search
### 035. Search Insert Position `[ Easy ]`
**Problem Statement:** Find insert position in sorted array.

**Naive Approach:** Linear scan.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Binary search.  
Time: `O(log n)`, Space: `O(1)`

### 074. Search a 2D Matrix `[ Medium ]`
**Problem Statement:** Search sorted matrix (each row sorted, first of row > last of prev).

**Naive Approach:** Linear scan.  
Time: `O(nm)`, Space: `O(1)`

**Expected Approach:** Treat as 1D array with binary search.  
Time: `O(log(nm)`), Space: `O(1)`

### 162. Find Peak Element `[ Medium ]`
**Problem Statement:** Find peak element in array (nums[i] > nums[i±1]).

**Naive Approach:** Linear scan.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Binary search comparing mid and mid+1.  
Time: `O(log n)`, Space: `O(1)`

### 033. Search in Rotated Sorted Array `[ Medium ]`
**Problem Statement:** Search in rotated sorted array.

**Naive Approach:** Linear scan.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Binary search with rotation check.  
Time: `O(log n)`, Space: `O(1)`

### 034. Find First and Last Position of Element in Sorted Array `[ Medium ]`
**Problem Statement:** Find start/end index of target in sorted array.

**Naive Approach:** Linear scan.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Two binary searches (first and last occurrence).  
Time: `O(log n)`, Space: `O(1)`

### 153. Find Minimum in Rotated Sorted Array `[ Medium ]`
**Problem Statement:** Find min element in rotated sorted array.

**Naive Approach:** Linear scan.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Binary search comparing mid and right.  
Time: `O(log n)`, Space: `O(1)`

### 004. Median of Two Sorted Arrays `[ Hard ]`
**Problem Statement:** Find median of two sorted arrays.

**Naive Approach:** Merge arrays then find median.  
Time: `O(n+m)`, Space: `O(n+m)`

**Expected Approach:** Partitioning with binary search.  
Time: `O(log(min(n,m)`)), Space: `O(1)`

## Heap
### 215. Kth Largest Element in an Array `[ Medium ]`
**Problem Statement:** Find kth largest element.

**Naive Approach:** Sort then index.  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:** Min-heap of size k.  
Time: `O(n log k)`, Space: `O(k)`

### 502. IPO `[ Hard ]`
**Problem Statement:** Select projects for max capital with k investments.

**Naive Approach:** Sort projects by capital each time.  
Time: `O(k n log n)`, Space: `O(n)`

**Expected Approach:** Two heaps (min-heap by capital, max-heap by profit).  
Time: `O(n log n)`, Space: `O(n)`

### 373. Find K Pairs with Smallest Sums `[ Medium ]`
**Problem Statement:** Find k pairs with smallest sums from two arrays.

**Naive Approach:** Generate all pairs then sort.  
Time: `O(nm log(nm)`), Space: `O(nm)`

**Expected Approach:** Min-heap with (i,j) and incremental addition.  
Time: `O(k log k)`, Space: `O(k)`

### 295. Find Median from Data Stream `[ Hard ]`
**Problem Statement:** Design median finder for streaming data.

**Naive Approach:** Sort on every insertion.  
Time: `O(n log n)` per insertion, Space: `O(n)`

**Expected Approach:** Two heaps (max-heap for left, min-heap for right).  
Time: `O(log n)` per insertion, Space: `O(n)`

## Bit Manipulation
### 067. Add Binary `[ Easy ]`
**Problem Statement:** Add two binary strings.

**Naive Approach:** Convert to integers, add, convert back.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Bit-by-bit addition with carry.  
Time: `O(n)`, Space: `O(1)`

### 190. Reverse Bits `[ Easy ]`
**Problem Statement:** Reverse bits of 32-bit unsigned integer.

**Naive Approach:** Store bits in array then reverse.  
Time: `O(32)`, Space: `O(32)`

**Expected Approach:** Bit shifting with mask.  
Time: `O(32)`, Space: `O(1)`

### 191. Number of 1 Bits `[ Easy ]`
**Problem Statement:** Count set bits in integer.

**Naive Approach:** Check each bit.  
Time: `O(32)`, Space: `O(1)`

**Expected Approach:** Brian Kernighan's algorithm (n & (n-1)).  
Time: `O(k)` where k=set bits, Space: `O(1)`

### 136. Single Number `[ Easy ]`
**Problem Statement:** Find non-duplicate in array (others twice).

**Naive Approach:** Hashmap for frequency count.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** XOR all elements.  
Time: `O(n)`, Space: `O(1)`

### 137. Single Number II `[ Medium ]`
**Problem Statement:** Find non-duplicate in array (others thrice).

**Naive Approach:** Hashmap for frequency count.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Bitwise counters for set bits.  
Time: `O(n)`, Space: `O(1)`

### 201. Bitwise AND of Numbers Range `[ Medium ]`
**Problem Statement:** Find AND of all numbers in range [left, right].

**Naive Approach:** Iterate through range.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Find common prefix of bits.  
Time: `O(32)`, Space: `O(1)`

## Math
### 009. Palindrome Number `[ Easy ]`
**Problem Statement:** Check if integer is palindrome.

**Naive Approach:** Convert to string then check.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Reverse half of number.  
Time: `O(log n)`, Space: `O(1)`

### 066. Plus One `[ Easy ]`
**Problem Statement:** Increment large integer represented as array.

**Naive Approach:** Convert to number, increment, convert back.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:** Digit-by-digit addition with carry.  
Time: `O(n)`, Space: `O(1)`

### 172. Factorial Trailing Zeroes `[ Medium ]`
**Problem Statement:** Count trailing zeroes in n factorial.

**Naive Approach:** Calculate n! then count zeroes.  
Time: `O(n)`, Space: `O(log n!)`

**Expected Approach:** Count factors of 5.  
Time: `O(log n)`, Space: `O(1)`

### 069. Sqrt(x) `[ Easy ]`
**Problem Statement:** Compute integer square root.

**Naive Approach:** Linear search.  
Time: `O(sqrt(x)`), Space: `O(1)`

**Expected Approach:** Binary search.  
Time: `O(log x)`, Space: `O(1)`

### 050. Pow(x, n) `[ Medium ]`
**Problem Statement:** Compute x raised to n.

**Naive Approach:** Multiply x n times.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:** Exponentiation by squaring.  
Time: `O(log n)`, Space: `O(1)`

### 149. Max Points on a Line `[ Hard ]`
**Problem Statement:** Find max points on single straight line.

**Naive Approach:** Check all point triplets.  
Time: `O(n^3)`, Space: `O(1)`

**Expected Approach:** Count slopes with GCD normalization.  
Time: `O(n^2)`, Space: `O(n)`

## 1D DP
### 070. Climbing Stairs `[ Easy ]`
**Problem Statement:** Count ways to climb n stairs (1 or 2 steps).

**Naive Approach:** Recursion without memoization.  
Time: `O(2^n)`, Space: `O(n)`

**Expected Approach:** Fibonacci-like DP.  
Time: `O(n)`, Space: `O(1)`

### 198. House Robber `[ Medium ]`
**Problem Statement:** Max sum of non-adjacent numbers.

**Naive Approach:** Recursive with all combinations.  
Time: `O(2^n)`, Space: `O(n)`

**Expected Approach:** DP with two variables (rob/not rob).  
Time: `O(n)`, Space: `O(1)`

### 139. Word Break `[ Medium ]`
**Problem Statement:** Check if string can be segmented into dictionary words.

**Naive Approach:** Recursive backtracking.  
Time: `O(2^n)`, Space: `O(n)`

**Expected Approach:** DP where dp[i] = segmentable up to i.  
Time: `O(n^2)`, Space: `O(n)`

### 322. Coin Change `[ Medium ]`
**Problem Statement:** Min coins to make amount.

**Naive Approach:** Recursive without memoization.  
Time: `O(amount^coins)`, Space: `O(amount)`

**Expected Approach:** DP array with min coins for each amount.  
Time: `O(amount * coins)`, Space: `O(amount)`

### 300. Longest Increasing Subsequence `[ Medium ]`
**Problem Statement:** Find longest increasing subsequence.

**Naive Approach:** Check all subsequences.  
Time: `O(2^n)`, Space: `O(n)`

**Expected Approach:** DP with binary search (patience sorting).  
Time: `O(n log n)`, Space: `O(n)`

## Multidimensional DP
### 120. Triangle `[ Medium ]`
**Problem Statement:** Min path sum from top to bottom of triangle.

**Naive Approach:** Recursive top-down.  
Time: `O(2^n)`, Space: `O(n)`

**Expected Approach:** Bottom-up DP in-place.  
Time: `O(n^2)`, Space: `O(1)`

### 064. Minimum Path Sum `[ Medium ]`
**Problem Statement:** Min path sum from top-left to bottom-right of grid.

**Naive Approach:** Recursive DFS.  
Time: `O(2^(m+n)`), Space: `O(mn)`

**Expected Approach:** 2D DP with cumulative sums.  
Time: `O(mn)`, Space: `O(mn)`

### 063. Unique Paths II `[ Medium ]`
**Problem Statement:** Count paths from top-left to bottom-right with obstacles.

**Naive Approach:** Recursive with obstacle checks.  
Time: `O(2^(m+n)`), Space: `O(mn)`

**Expected Approach:** 2D DP with obstacle handling.  
Time: `O(mn)`, Space: `O(mn)`

### 005. Longest Palindromic Substring `[ Medium ]`
**Problem Statement:** Find longest palindromic substring.

**Naive Approach:** Check all substrings.  
Time: `O(n^3)`, Space: `O(1)`

**Expected Approach:** Expand around center or 2D DP.  
Time: `O(n^2)`, Space: `O(n^2)` or `O(1)` for center

### 097. Interleaving String `[ Medium ]`
**Problem Statement:** Check if s3 is interleave of s1 and s2.

**Naive Approach:** Recursive with three pointers.  
Time: `O(2^(m+n)`), Space: `O(m+n)`

**Expected Approach:** 2D DP with string matching.  
Time: `O(mn)`, Space: `O(mn)`

### 072. Edit Distance `[ Medium ]`
**Problem Statement:** Min operations (insert/delete/replace) to convert word1 to word2.

**Naive Approach:** Recursive with three choices.  
Time: `O(3^(m+n)`), Space: `O(m+n)`

**Expected Approach:** 2D DP with operation costs.  
Time: `O(mn)`, Space: `O(mn)`

### 123. Best Time to Buy and Sell Stock III `[ Hard ]`
**Problem Statement:** Max profit with at most two transactions.

**Naive Approach:** Divide array and run solution for 121 twice.  
Time: `O(n^2)`, Space: `O(1)`

**Expected Approach:** DP with states for transactions.  
Time: `O(n)`, Space: `O(1)`

### 188. Best Time to Buy and Sell Stock IV `[ Hard ]`
**Problem Statement:** Max profit with at most k transactions.

**Naive Approach:** Check all transaction combinations.  
Time: `O(n^k)`, Space: `O(k)`

**Expected Approach:** DP with buy/sell states for each k.  
Time: `O(kn)`, Space: `O(k)`

### 221. Maximal Square `[ Medium ]`
**Problem Statement:** Find largest square of 1's in binary matrix.

**Naive Approach:** Check all squares.  
Time: `O(n^3)`, Space: `O(1)`

**Expected Approach:** DP with dp[i][j] = min(neighbors) + 1.  
Time: `O(mn)`, Space: `O(mn)`
