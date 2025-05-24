## Common Patterns in Leetcode

### 1. PrefixSum

- This pattern is used for problems where you need to query the sum of elements in a subarray.
- Relevant Leetcode problems
  - _Leetcode_ : 303. Range Sum Query - Immutable
  - _Leetcode_ : 525. Contiguous Array
  - _Leetcode_ : 560. Subarray Sum Equals K

### 2. Two Pointer Patterns

- We initialize two pointer and move them towards or away from each other depending on condition
- Relevant Leetcode problems
  - _Leetcode_ : 167. Two Sum II - Input Array Is Sorted
  - _Leetcode_ : 015. 3Sum
  - _Leetcode_ : 011. Cointainer With Most Water

### 3. Sliding Window

- This pattern helps us find subarrays or substrings that meet specific criteria
- Relevant Leetcode problems
  - _Leetcode_ : 643. Maximum Average Subarray I
  - _Leetcode_ : 003. Longest Substring Without Repeating Characters
  - _Leetcode_ : 076. Minimum Window Substing

### 4. Fast and Slow Pointers

- Used for Finding cycles
- Relevant Leetcode problems
  - _Leetcode_ : 141. Linked List Cycle I
  - _Leetcode_ : 202. Happy Number
  - _Leetcode_ : 287. Find the Duplicate Number

### 5. Linked List in-place Reversal

- Three pointers (prev, current,next) are used
- This approach can be used in any problem that ask to rearrange the links between nodes of linked list.
- Relevant Leetcode problems
  - _Leetcode_ : 206. Reverse Linked List
  - _Leetcode_ : 092. Reverse Linked List II
  - _Leetcode_ : 024. Swap Nodes in Pairs

### 6. Monotonic Stack

- This pattern uses stack to find the next greater or next smaller element in an array.
- In this pattern we use stack to track indices for which the specified condition is not met.
- Relevant Leetcode problems
  - _Leetcode_ : 496. Next Greater Element I
  - _Leetcode_ : 739. Daily Temperatures
  - _Leetcode_ : 084. Largest Rectangle in Histogram

### 7. Top 'K' Elements

- This pattern helps to find 'K' largest, 'K' Smallest, 'K' Most Frequent Elements
- Min Heap is used in this pattern
- Relevant Leetcode problems
  - _Leetcode_ : 215. Kth Largest Element in an Array I
  - _Leetcode_ : 347. Top K Frequent Elements
  - _Leetcode_ : 373. Find K Pairs with Smallest Sums

### 8. Overlapping Intervals

- In this pattern we sort intervals by start time.
- This pattern can be used to solve following problems
  - merging intervals
  - Interval Intersection
  - Insert Interval
- Relevant Leetcode problems
  - _Leetcode_ : 056. Merge Intervals
  - _Leetcode_ : 057. Insert Intervals
  - _Leetcode_ : 373. Non-overlapping Intervals

### 9. Modified Binary Search

- This pattern can be used to solve following problems
  - Searching in a nearly sorted array
  - Searching in a rotated sorted array
  - Searching in a list with unknown length
  - Searching in an array with duplicates
  - Finding the first or last occurrence of an element
  - Finding the Square root of a number
  - Finding a Peak Element
- Relevant Leetcode problems
  - _Leetcode_ : 033. Search in Rotated Sorted Array
  - _Leetcode_ : 153. Find Minimum in Rotated Sorted Array
  - _Leetcode_ : 240. Search in 2D Matrix II

### 10. Binary Tree Traversal

- Important traversal methods are
  - PreOrder: Creating copy of tree
  - InOrder : sorted order
  - PostOrder: process children before the parent
  - LevelOrder: explore all nodes at current level
- Relevant Leetcode problems
  - _Leetcode_ : 257. Binary Tree Paths
  - _Leetcode_ : 230. Kth Smallest Element in a BST
  - _Leetcode_ : 124. Binary Tree Maximum Path Sum
  - _Leetcode_ : 107. Binary Tree Level Order Traversal II

### 11. Depth-First Search [DFS]

- DFS is usually used in following problems
  - finding a path between two nodes
  - checking if a graph contains a cycle
  - finding topological order in DAG
  - counting number of connected components in graph
- Relevant Leetcode problems
  - _Leetcode_ : 133. Clone Graph
  - _Leetcode_ : 113. Path Sum II
  - _Leetcode_ : 210. Course Schedule II

### 12. Breadth-First Search [BFS]

- BFS is usually used in following problems
  - finding the shortest path between two nodes
  - printing all nodes of a tree level by level
  - finding all connected components in a graph
  - finding the shortest transformation sequence from on word to other
- Relevant Leetcode problems
  - _Leetcode_ : 102. Binary Tree Level Order Traversal
  - _Leetcode_ : 994. Rotting Oranges
  - _Leetcode_ : 127. Word Ladder

### 13. Matrix Traversal

- We can treat Matrix as Graphs, hence all algo on graph are applicable here also
- Relevant Leetcode problems
  - _Leetcode_ : 733. Flood Fill
  - _Leetcode_ : 200. Number of Islands
  - _Leetcode_ : 130. Surrounding Regions

### 14. Backtracking

- Used to solve problem that need exploring all potential solution paths and backtracking the paths that don't lead to
  valid solution
- Usually used in following problems
  - generate all possible permutations OR combinations of a given set of elements
  - solving puzzles like sudoku or n-queens
  - find all possible paths from start to end in a graph or maze
  - Generate all valid parenthesis of a given length
- Relevant Leetcode problems
  - _Leetcode_ : 046. Permutations
  - _Leetcode_ : 078. Subsets
  - _Leetcode_ : 051. N-Queens

### 15. Dynamic Programming [DP]

- Solving Optimization Problems by breaking them down into smaller sub-problems and storing their solution to avoid
  repetitive work
- Useful for problems with overlapping sub-problems and optimal substructure properties like maximize, minimize or count
  number of ways to achieve a certain goal.
- Usually used in following problems
  - Fibonnacci numbers
  - 0/1 knapsack
  - Longest common subsequence (LCS)
  - Longest increasing subsequence (LIS)
  - Subset Sum
  - Matrix Chain Multiplication
- Relevant Leetcode problems
  - _Leetcode_ : 070. Climbing stairs
  - _Leetcode_ : 322. Coin change
  - _Leetcode_ : 1143. Longest Common Subsequence
  - _Leetcode_ : 300. Longest Increasing Subsequence
  - _Leetcode_ : 416. Partition Equal Subset Sum
  - _Leetcode_ : 312. Burst Ballons

