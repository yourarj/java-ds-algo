# LeetCode Solutions by Category

## Array / String

### 088. Merge Sorted Array`[ Easy ]`
**Problem Statement:**  
Given two sorted integer arrays nums1 and nums2, merge them into a single sorted array stored in nums1.  
nums1 has sufficient space (size m+n) to hold additional elements from nums2.  
The merging should be done without returning a new array.

**Naive Approach:**  
Append nums2 to nums1 and sort the combined array.  
This ignores the pre-sorted property of both arrays.  
Time: `O((m+n)`log(m+n)), Space: `O(1)`

**Expected Approach:**  
Use three pointers starting from the ends of both arrays and the merged array end.  
Compare elements backwards to avoid overwriting nums1 values prematurely.  
Time: `O(m+n)`, Space: `O(1)`

### 027. Remove Element`[ Easy ]`
**Problem Statement:**  
Remove all instances of a given value from an integer array in-place.  
Return the new length after removal with original order maintained.  
The solution should use `O(1)` extra memory.

**Naive Approach:**  
Shift elements left repeatedly when encountering target value.  
This causes `O(n)` operations per removal in worst-case.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Use two pointers: one for current position and one for next valid position.  
Overwrite target values while traversing the array once.  
Time: `O(n)`, Space: `O(1)`

### 026. Remove Duplicates from Sorted Array`[ Easy ]`
**Problem Statement:**  
Remove duplicate elements from a sorted array in-place.  
Each unique element should appear only once with relative order preserved.  
Return the count of unique elements.

**Naive Approach:**  
Use nested loops to detect duplicates and shift elements.  
Inefficient for large arrays due to repeated shifting.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Two-pointer technique: slow pointer tracks last unique element.  
Fast pointer scans ahead to find next unique element.  
Time: `O(n)`, Space: `O(1)`

### 080. Remove Duplicates from Sorted Array II`[ Medium ]`
**Problem Statement:**  
Remove duplicates allowing at most two occurrences of each element.  
Maintain relative order and perform operations in-place.  
Return new length of modified array.

**Naive Approach:**  
Count occurrences and shift elements manually for each duplicate.  
Results in quadratic time complexity for worst-case scenarios.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Track current position and occurrence count while traversing.  
Reset count for new elements, overwrite when within allowance.  
Time: `O(n)`, Space: `O(1)`

### 169. Majority Element`[ Easy ]`
**Problem Statement:**  
Find the element appearing more than ⌊n/2⌋ times in an array.  
Assume majority element always exists for simplicity.  
Solution should run in linear time with `O(1)` space.

**Naive Approach:**  
Use hashmap to count frequency of each element.  
Requires proportional space for element storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Boyer-Moore Voting Algorithm: track candidate and counter.  
Counter increments for candidate matches, decrements otherwise.  
Time: `O(n)`, Space: `O(1)`

### 189. Rotate Array`[ Medium ]`
**Problem Statement:**  
Rotate array to the right by k steps in-place.  
Modify the input array without returning new array.  
Solution should handle wrap-around cases.

**Naive Approach:**  
Perform k separate rotations by shifting elements one-by-one.  
Inefficient for large k values (k approaches n).  
Time: `O(kn)`, Space: `O(1)`

**Expected Approach:**  
Reverse entire array, then reverse first k and remaining elements.  
Uses mathematical properties of array reversal.  
Time: `O(n)`, Space: `O(1)`

### 121. Best Time to Buy and Sell Stock`[ Easy ]`
**Problem Statement:**  
Given stock prices array, find maximum profit from one transaction.  
Must buy before selling with no multiple transactions allowed.  
Return 0 if no profit possible.

**Naive Approach:**  
Check all possible buy-sell pairs with nested loops.  
Computationally expensive for large price histories.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Track minimum price and maximum profit in single pass.  
Update min when lower price found, calculate potential profit.  
Time: `O(n)`, Space: `O(1)`

### 122. Best Time to Buy and Sell Stock II`[ Medium ]`
**Problem Statement:**  
Maximize profit with unlimited transactions allowed.  
Can buy/sell multiple times but must sell before buying again.  
Each transaction incurs no simultaneous holding.

**Naive Approach:**  
Use recursion to explore all possible transaction sequences.  
Leads to exponential time complexity for decision tree.  
Time: `O(2ⁿ)`, Space: `O(n)`

**Expected Approach:**  
Sum all positive price differences between consecutive days.  
Captures all profitable upswings in the price curve.  
Time: `O(n)`, Space: `O(1)`

### 055. Jump Game`[ Medium ]`
**Problem Statement:**  
Given array of jump lengths, determine if reachable from first to last index.  
Can jump up to current value from each position.  
Return boolean indicating possibility.

**Naive Approach:**  
Backtracking with memoization to test all paths.  
Suffers from exponential time in worst-case scenarios.  
Time: `O(2ⁿ)`, Space: `O(n)`

**Expected Approach:**  
Track maximum reachable index while traversing array.  
Update max reach at each step, fail if current index exceeds max.  
Time: `O(n)`, Space: `O(1)`

### 045. Jump Game II`[ Medium ]`
**Problem Statement:**  
Find minimum jumps to reach last index from first.  
Assume always possible to reach end.  
Each jump uses maximum length available.

**Naive Approach:**  
Breadth-first search treating positions as graph nodes.  
Explores all possible jump paths level by level.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
Track current jump boundary and farthest reach in one pass.  
Increment jump count when reaching current boundary.  
Time: `O(n)`, Space: `O(1)`

### 274. H-Index`[ Medium ]`
**Problem Statement:**  
Compute researcher's h-index based on citations array.  
h-index: maximum h where h papers have ≥ h citations.  
Non-integer h not allowed.

**Naive Approach:**  
Sort citations and linear scan for h-index condition.  
Relies on comparison-based sorting algorithm.  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:**  
Counting sort with prefix sums to accumulate paper counts.  
Finds h-index in linear time without sorting.  
Time: `O(n)`, Space: `O(n)`

### 380. Insert Delete GetRandom `O(1)``[ Medium ]`
**Problem Statement:**  
Design data structure supporting `O(1)` insert, delete, getRandom.  
getRandom returns uniform random element from current set.  
Duplicates not allowed.

**Naive Approach:**  
Use array alone (delete `O(n)`) or hashmap alone (random `O(n)`).  
Fails to meet all `O(1)` requirements simultaneously.  
Time: GetRandom `O(n)`, Space: `O(n)`

**Expected Approach:**  
Combine hashmap (value→index) with resizable array.  
On delete, swap target with last element and update map.  
Time: `O(1)` all ops, Space: `O(n)`

### 238. Product of Array Except Self`[ Medium ]`
**Problem Statement:**  
Return array where each element is product of all except itself.  
Must run in `O(n)` without division operator.  
Solution should use constant space besides output.

**Naive Approach:**  
Use nested loops to calculate products repeatedly.  
Results in quadratic time for large arrays.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Compute left prefix products then right prefix products.  
Combine results in output array without extra space.  
Time: `O(n)`, Space: `O(1)` (excluding output)

### 134. Gas Station`[ Medium ]`
**Problem Statement:**  
Given gas and cost arrays, find starting station to complete circuit.  
Return -1 if impossible to travel around circuit.  
Only clockwise direction allowed.

**Naive Approach:**  
Check every possible starting point with simulation.  
Terminates early if run out of gas during circuit.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Track total gas deficit and current tank status in one pass.  
Identify start point where cumulative deficit is covered.  
Time: `O(n)`, Space: `O(1)`

### 135. Candy`[ Hard ]`
**Problem Statement:**  
Distribute candy to children with higher rating neighbors getting more.  
Each child must have at least one candy.  
Minimize total candy used.

**Naive Approach:**  
Multiple passes until no changes in distribution.  
Inefficient for large rating arrays.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
Left-to-right pass satisfying left neighbors, then right-to-left.  
Combine both passes to satisfy bidirectional constraints.  
Time: `O(n)`, Space: `O(n)`

### 042. Trapping Rain Water`[ Hard ]`
**Problem Statement:**  
Compute total water trapped between bars of given heights.  
Water trapped if bars form bounded container.  
Bars have unit width.

**Naive Approach:**  
For each bar, find max left and right bar heights.  
Water trapped is min(left_max, right_max) - current height.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Two pointers converging from ends with dynamic max tracking.  
Calculate water incrementally while moving pointers.  
Time: `O(n)`, Space: `O(1)`

### 013. Roman to Integer`[ Easy ]`
**Problem Statement:**  
Convert valid Roman numeral string to integer.  
Input guaranteed within 1-3999 range.  
Subtraction notation used (IV=4, IX=9, etc).

**Naive Approach:**  
Right-to-left scan without special subtraction handling.  
Fails to correctly interpret subtraction cases.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Right-to-left scan comparing current and previous values.  
Subtract if current symbol smaller than previous symbol.  
Time: `O(n)`, Space: `O(1)`

### 012. Integer to Roman`[ Medium ]`
**Problem Statement:**  
Convert integer to Roman numeral string.  
Input range 1-3999 with standard subtraction notation.  
Use largest possible symbols at each step.

**Naive Approach:**  
Conditional statements for each possible digit combination.  
Becomes unwieldy with many special cases.  
Time: `O(1)`, Space: `O(1)`

**Expected Approach:**  
Predefined arrays for values and corresponding symbols.  
Greedily append largest possible symbol at each step.  
Time: `O(1)`, Space: `O(1)`

### 058. Length of Last Word`[ Easy ]`
**Problem Statement:**  
Return length of last word in string (words separated by spaces).  
Trailing/leading spaces possible with at least one word.  
Word defined as maximal substring without spaces.

**Naive Approach:**  
Split string by spaces and return last element's length.  
Creates unnecessary temporary array storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Traverse backward until non-space found, then count word.  
Handle trailing spaces by skipping before counting.  
Time: `O(n)`, Space: `O(1)`

### 014. Longest Common Prefix`[ Easy ]`
**Problem Statement:**  
Find longest common prefix string among array of strings.  
If no common prefix, return empty string.  
All strings contain only lowercase English letters.

**Naive Approach:**  
Compare each character of first string with others.  
Early termination when mismatch found in any string.  
Time: `O(S)` where S=total chars, Space: `O(1)`

**Expected Approach:**  
Vertical scanning: compare i-th character of all strings.  
Terminate when any string ends or character mismatch.  
Time: `O(S)`, Space: `O(1)`

### 151. Reverse Words in a String`[ Medium ]`
**Problem Statement:**  
Reverse words in string while removing extra spaces.  
Words separated by single space, no leading/trailing spaces.  
In-place modification preferred.

**Naive Approach:**  
Split by spaces, reverse list, join with single space.  
Uses `O(n)` space for temporary list storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Reverse entire string then reverse individual words.  
Handle space removal during word reversal process.  
Time: `O(n)`, Space: `O(1)` (in-place for mutable strings)

### 006. Zigzag Conversion`[ Medium ]`
**Problem Statement:**  
Convert string to zigzag pattern on given rows.  
Read line-by-line to form result string.  
Example: "PAYPALISHIRING" rows=3 → "PAHNAPLSIIGYIR"

**Naive Approach:**  
Simulate zigzag movement with 2D matrix storage.  
Fills matrix following zigzag path pattern.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Calculate character positions using mathematical indexing.  
Directly map input index to output row position.  
Time: `O(n)`, Space: `O(n)`

### 028. Find the Index of the First Occurrence in a String`[ Easy ]`
**Problem Statement:**  
Return index of first occurrence of needle in haystack.  
Return -1 if needle not in haystack.  
Return 0 when needle empty.

**Naive Approach:**  
Check every possible substring of haystack.  
Worst-case when many partial matches exist.  
Time: `O(n×m)`, Space: `O(1)`

**Expected Approach:**  
Knuth-Morris-Pratt (KMP) with prefix function (LPS array).  
Skip unnecessary comparisons using failure function.  
Time: `O(n+m)`, Space: `O(m)`

### 068. Text Justification`[ Hard ]`
**Problem Statement:**  
Format words into lines of maxWidth with justified alignment.  
Pack maximum words per line with spaces distributed evenly.  
Last line left-justified with no extra spaces.

**Naive Approach:**  
Greedy line packing with manual space insertion.  
Complex space distribution logic per line.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Calculate spaces needed per line after word selection.  
Distribute spaces evenly between words using division.  
Time: `O(n)`, Space: `O(n)`

## Two Pointers
### 125. Valid Palindrome`[ Easy ]`
**Problem Statement:**  
Check if string is palindrome after converting cases and removing non-alphanumeric.  
Consider only alphanumeric characters in comparison.  
Empty string considered palindrome.

**Naive Approach:**  
Filter non-alphanumeric characters to new string.  
Check palindromicity of cleaned string.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Two pointers at ends moving inward skipping non-alphanumeric.  
Compare characters case-insensitively during convergence.  
Time: `O(n)`, Space: `O(1)`

### 392. Is Subsequence`[ Easy ]`
**Problem Statement:**  
Check if string s is subsequence of string t.  
Subsequence: characters appear in order but not necessarily contiguous.  
s and t consist of lowercase English letters.

**Naive Approach:**  
Recursive DFS checking match possibilities.  
Exponential time worst-case for long strings.  
Time: `O(2ⁿ)`, Space: `O(n)`

**Expected Approach:**  
Two pointers: traverse t and match characters of s.  
Advance s-pointer only when character match found.  
Time: `O(n)`, Space: `O(1)`

### 167. Two Sum II - Input Array Is Sorted`[ Medium ]`
**Problem Statement:**  
Find two numbers adding to target in sorted array (1-indexed).  
Exactly one solution exists with distinct indices.  
Constant extra space solution required.

**Naive Approach:**  
Check all possible pairs with nested loops.  
Fails to utilize sorted array property.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Two pointers: one at start, one at end.  
Adjust pointers based on sum comparison to target.  
Time: `O(n)`, Space: `O(1)`

### 011. Container With Most Water`[ Medium ]`
**Problem Statement:**  
Find container with maximum area from vertical lines.  
Container formed by two lines and x-axis.  
Cannot slant container.

**Naive Approach:**  
Calculate area for all possible line pairs.  
Inefficient for large input arrays.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Two pointers at ends moving inward.  
Always move pointer at shorter height to maximize area.  
Time: `O(n)`, Space: `O(1)`

### 015. 3Sum`[ Medium ]`
**Problem Statement:**  
Find all unique triplets adding to zero in array.  
Solution must avoid duplicate triplets.  
Return list of triplet lists.

**Naive Approach:**  
Three nested loops checking all combinations.  
Requires additional work to avoid duplicates.  
Time: `O(n³)`, Space: `O(1)`

**Expected Approach:**  
Sort array, then for each element use two-pointer technique.  
Skip duplicates during iteration and pointer movement.  
Time: `O(n²)`, Space: `O(1)`

## Sliding Window
### 209. Minimum Size Subarray Sum`[ Medium ]`
**Problem Statement:**  
Find minimal length subarray with sum ≥ target.  
Return 0 if no such subarray exists.  
Solution must run in `O(n)` time.

**Naive Approach:**  
Check all possible subarrays with prefix sums.  
Uses nested loops for start and end positions.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Expand window until sum ≥ target, then shrink from left.  
Track minimal length during window adjustments.  
Time: `O(n)`, Space: `O(1)`

### 003. Longest Substring Without Repeating Characters`[ Medium ]`
**Problem Statement:**  
Find longest substring with all distinct characters.  
Return length of longest unique-character substring.  
String consists of English letters, digits, symbols.

**Naive Approach:**  
Check all substrings for uniqueness with nested loops.  
Uses hashset to check character uniqueness.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Sliding window with character frequency map.  
Adjust window start when duplicate character found.  
Time: `O(n)`, Space: `O(1)`

### 030. Substring with Concatenation of All Words`[ Hard ]`
**Problem Statement:**  
Find substrings containing all words from list in any order.  
Words are same length and may have duplicates.  
Return starting indices of valid substrings.

**Naive Approach:**  
Check all possible substrings of fixed length.  
Verify word frequency match for each candidate.  
Time: `O(n²)`, Space: `O(m)`

**Expected Approach:**  
Sliding window with word frequency map and fixed word-length steps.  
Handle multiple starting positions with word-length modulo.  
Time: `O(n×k)` k=word length, Space: `O(m)`

### 076. Minimum Window Substring`[ Hard ]`
**Problem Statement:**  
Find smallest substring in s containing all characters of t.  
Characters include duplicates with frequency matters.  
Return empty string if no valid window.

**Naive Approach:**  
Check all possible windows with nested loops.  
Verify character coverage for each window.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Expand window until all characters covered, then shrink from left.  
Track character frequencies with two hash maps.  
Time: `O(n)`, Space: `O(1)`

## Matrix
### 036. Valid Sudoku`[ Medium ]`
**Problem Statement:**  
Validate 9x9 Sudoku board without solving.  
Check rows, columns, and 3x3 sub-boxes for duplicates.  
Empty cells marked '.'.

**Naive Approach:**  
Check rows, columns, subgrids in separate passes.  
Uses sets to detect duplicates per section.  
Time: `O(1)`, Space: `O(1)`

**Expected Approach:**  
Single pass with sets for rows, columns, subgrids.  
Compute subgrid index as (row//3, col//3).  
Time: `O(1)`, Space: `O(1)`

### 054. Spiral Matrix`[ Medium ]`
**Problem Statement:**  
Return elements of matrix in spiral order.  
Traverse right, down, left, up in concentric layers.  
Matrix can be rectangular.

**Naive Approach:**  
Simulate spiral with direction changes at boundaries.  
Mark visited cells to avoid revisiting.  
Time: `O(mn)`, Space: `O(1)`

**Expected Approach:**  
Layer-by-layer traversal with four boundaries.  
Adjust boundaries after completing each direction.  
Time: `O(mn)`, Space: `O(1)`

### 048. Rotate Image`[ Medium ]`
**Problem Statement:**  
Rotate n x n matrix 90 degrees clockwise in-place.  
Modify matrix directly without allocating new matrix.  
Rotation performed in layers.

**Naive Approach:**  
Create new matrix with rotated positions.  
Copy back to original matrix after rotation.  
Time: `O(n²)`, Space: `O(n²)`

**Expected Approach:**  
Transpose matrix then reverse each row.  
Performs rotation in two distinct operations.  
Time: `O(n²)`, Space: `O(1)`

### 073. Set Matrix Zeroes`[ Medium ]`
**Problem Statement:**  
If element is 0, set entire row and column to 0.  
Solution must be in-place with constant space.  
Matrix dimensions can be large.

**Naive Approach:**  
Use additional arrays to mark zero rows/columns.  
Requires linear space for markers.  
Time: `O(mn)`, Space: `O(m+n)`

**Expected Approach:**  
Use first row/column as markers for zero status.  
Handle first row/column separately with flags.  
Time: `O(mn)`, Space: `O(1)`

### 289. Game of Life`[ Medium ]`
**Problem Statement:**  
Apply Conway's Game of Life rules simultaneously to all cells.  
Use 0=dead, 1=live with 4 rules for next state.  
Solution must be in-place.

**Naive Approach:**  
Create copy of board for next state calculations.  
Compute next state using original board values.  
Time: `O(mn)`, Space: `O(mn)`

**Expected Approach:**  
Encode next state in second bit while preserving current state.  
Update board in second pass using bit shifting.  
Time: `O(mn)`, Space: `O(1)`

## Hashmap
### 383. Ransom Note`[ Easy ]`
**Problem Statement:**  
Check if ransomNote can be constructed from magazine characters.  
Each character in magazine can be used only once.  
Strings contain lowercase English letters.

**Naive Approach:**  
Nested loops counting character occurrences manually.  
Inefficient for large input strings.  
Time: `O(n×m)`, Space: `O(1)`

**Expected Approach:**  
Frequency count arrays for both strings.  
Compare counts to ensure magazine covers ransomNote.  
Time: `O(n+m)`, Space: `O(1)`

### 205. Isomorphic Strings`[ Easy ]`
**Problem Statement:**  
Check if two strings are isomorphic (character mapping preserved).  
No two characters map to same character unless same character.  
Strings have same length.

**Naive Approach:**  
Check all character mappings with nested loops.  
Verifies bidirectional mapping consistency.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Two dictionaries for s→t and t→s mappings.  
Verify consistent mapping during traversal.  
Time: `O(n)`, Space: `O(1)`

### 290. Word Pattern`[ Easy ]`
**Problem Statement:**  
Check if pattern matches space-separated words in string.  
Bijective mapping between pattern chars and words.  
Pattern and string may have different lengths.

**Naive Approach:**  
Split words and compare lengths then check mappings.  
Requires separate validation for mapping consistency.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Two dictionaries for char→word and word→char mappings.  
Handle case where pattern length ≠ word count.  
Time: `O(n)`, Space: `O(n)`

### 242. Valid Anagram`[ Easy ]`
**Problem Statement:**  
Check if t is anagram of s (same characters, different order).  
Strings consist of lowercase English letters.  
Handle empty string cases.

**Naive Approach:**  
Sort both strings and compare results.  
Sorting dominates time complexity.  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:**  
Character frequency counter with single array.  
Increment counts for s, decrement for t, check zeros.  
Time: `O(n)`, Space: `O(1)`

### 049. Group Anagrams`[ Medium ]`
**Problem Statement:**  
Group words that are anagrams together.  
Return list of grouped anagram lists.  
Input may contain duplicate words.

**Naive Approach:**  
Compare all word pairs for anagram relationship.  
Quadratic time for large input lists.  
Time: `O(n²×k)`, Space: `O(n)`

**Expected Approach:**  
Use sorted word or character count as dictionary key.  
Group words with identical keys together.  
Time: `O(n×k log k)`, Space: `O(n×k)`

### 001. Two Sum`[ Easy ]`
**Problem Statement:**  
Find two distinct indices where numbers add to target.  
Exactly one solution exists per input.  
Cannot use same element twice.

**Naive Approach:**  
Check all possible number pairs with nested loops.  
Fails to leverage fast lookup possibilities.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Dictionary to store number→index for seen numbers.  
Check if complement (target - current) exists in dictionary.  
Time: `O(n)`, Space: `O(n)`

### 202. Happy Number`[ Easy ]`
**Problem Statement:**  
Determine if number leads to 1 when summing squared digits.  
Loop endlessly if enters cycle not including 1.  
Use constant space.

**Naive Approach:**  
Run indefinitely without cycle detection.  
Fails to terminate for non-happy numbers.  
Time: `O(∞)`, Space: `O(1)`

**Expected Approach:**  
Floyd's cycle detection with slow/fast digit sums.  
Terminate when fast pointer reaches 1 or equals slow.  
Time: `O(log n)`, Space: `O(1)`

### 219. Contains Duplicate II`[ Easy ]`
**Problem Statement:**  
Check if distinct indices i,j exist with nums[i]==nums[j] and |i-j|≤k.  
Solution must handle large input arrays efficiently.

**Naive Approach:**  
Check all pairs within k distance with nested loops.  
Performs redundant checks for each element.  
Time: `O(nk)`, Space: `O(1)`

**Expected Approach:**  
Sliding window hashset storing last k elements.  
Remove elements outside current window range.  
Time: `O(n)`, Space: `O(k)`

### 128. Longest Consecutive Sequence`[ Medium ]`
**Problem Statement:**  
Find longest consecutive elements sequence length.  
Must run in `O(n)` time.  
Sequence elements may be unsorted.

**Naive Approach:**  
Sort array and scan for consecutive runs.  
Violates `O(n)` time requirement.  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:**  
Convert to hashset and check sequence starts only.  
Sequence start identified by absence of num-1.  
Time: `O(n)`, Space: `O(n)`

## Intervals
### 228. Summary Ranges`[ Easy ]`
**Problem Statement:**  
Return smallest sorted ranges covering all numbers in sorted array.  
Ranges should be disjoint and cover all array elements.  
Output as list of "a->b" or "a" strings.

**Naive Approach:**  
Track current range start and extend while consecutive.  
Reset range start when gap detected during traversal.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Single pass with two pointers marking range boundaries.  
Convert boundaries to string representation after range ends.  
Time: `O(n)`, Space: `O(1)`

### 056. Merge Intervals`[ Medium ]`
**Problem Statement:**  
Merge overlapping intervals in collection.  
Return non-overlapping intervals covering all inputs.  
Intervals defined as [start, end].

**Naive Approach:**  
Compare all interval pairs and merge when overlapping.  
Requires multiple passes until no merges occur.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
Sort intervals by start, then merge sequentially.  
Extend current interval if overlaps with next.  
Time: `O(n log n)`, Space: `O(n)`

### 057. Insert Interval`[ Medium ]`
**Problem Statement:**  
Insert new interval into sorted non-overlapping interval list.  
Merge if necessary to maintain non-overlapping property.  
Return updated interval list.

**Naive Approach:**  
Append new interval then merge all intervals.  
Inefficient for large interval lists.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Three-phase: add before new interval, merge overlapping, add after.  
Track start/end during merging phase.  
Time: `O(n)`, Space: `O(n)`

### 452. Minimum Number of Arrows to Burst Balloons`[ Medium ]`
**Problem Statement:**  
Find min arrows to burst all overlapping balloons.  
Arrow shot vertically bursts balloons with horizontal positions.  
Balloons represented as [xstart, xend].

**Naive Approach:**  
Greedily select arrows without sorting by end points.  
May result in suboptimal arrow placements.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Sort balloons by end coordinate.  
Shoot arrow at current end and skip overlapping balloons.  
Time: `O(n log n)`, Space: `O(1)`

## Stack
### 020. Valid Parentheses`[ Easy ]`
**Problem Statement:**  
Check if string has valid parentheses nesting.  
String contains '()', '[]', '{}'.  
Empty string considered valid.

**Naive Approach:**  
Recursively remove innermost parentheses pairs.  
Degrades to quadratic time for large strings.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
Stack to track opening brackets; pop when matching close found.  
Invalid if stack not empty at end or mismatch.  
Time: `O(n)`, Space: `O(n)`

### 071. Simplify Path`[ Medium ]`
**Problem Statement:**  
Simplify Unix-style absolute path to canonical path.  
Handle multiple slashes, '.', '..' and trailing slash.  
Return simplified path starting with single slash.

**Naive Approach:**  
Split path and handle '..' with conditional list operations.  
Requires manual edge case handling for root.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Stack for directory names; pop on '..', ignore '.' and empty.  
Join stack elements with slashes for final path.  
Time: `O(n)`, Space: `O(n)`

### 155. Min Stack`[ Medium ]`
**Problem Statement:**  
Design stack with push, pop, top, and getMin in `O(1)` time.  
getMin retrieves minimum element in constant time.  
Elements can be negative.

**Naive Approach:**  
Scan stack for min on each getMin call.  
Violates `O(1)` time requirement for getMin.  
Time: `O(n)` for getMin, Space: `O(1)`

**Expected Approach:**  
Store (value, current_min) pairs in stack.  
Update current_min during push operations.  
Time: `O(1)` all ops, Space: `O(n)`

### 150. Evaluate Reverse Polish Notation`[ Medium ]`
**Problem Statement:**  
Evaluate arithmetic expression in postfix notation.  
Valid operators: '+', '-', '*', '/'.  
Division truncates toward zero.

**Naive Approach:**  
Parse tokens recursively with operator precedence.  
Overly complex for postfix notation evaluation.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Stack for operands; push numbers, pop and apply operators.  
Handle division and negative number cases.  
Time: `O(n)`, Space: `O(n)`

### 224. Basic Calculator`[ Hard ]`
**Problem Statement:**  
Evaluate expression with '+', '-', '(', ')' and non-negative integers.  
Expression may contain spaces.  
Handle nested parentheses correctly.

**Naive Approach:**  
Recursive descent parsing with expression tree.  
Complex implementation for simple calculator.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Stack for signs and intermediate results.  
Handle parentheses by pushing result and sign before '('  
Time: `O(n)`, Space: `O(n)`

## Linked List
### 141. Linked List Cycle`[ Easy ]`
**Problem Statement:**  
Detect cycle in linked list using `O(1)` space.  
Return true if cycle exists, false otherwise.  
Cycle defined by node reachable through continuous next.

**Naive Approach:**  
Store visited nodes in hash set during traversal.  
Uses linear space for node storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Floyd's Tortoise and Hare: slow/fast pointers.  
If fast meets slow, cycle exists; else fast reaches end.  
Time: `O(n)`, Space: `O(1)`

### 002. Add Two Numbers`[ Medium ]`
**Problem Statement:**  
Add two non-empty linked lists representing reverse digits.  
Digits stored in reverse order (1's digit at head).  
Return sum as reverse linked list.

**Naive Approach:**  
Convert lists to integers, add, convert back to list.  
Fails for very large numbers beyond integer range.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Digit-by-digit addition with carry tracking.  
Create new nodes for result and handle final carry.  
Time: `O(n)`, Space: `O(1)`

### 021. Merge Two Sorted Lists`[ Easy ]`
**Problem Statement:**  
Merge two sorted linked lists into one sorted list.  
Return new list by splicing nodes together.  
New list should be made by changing node pointers.

**Naive Approach:**  
Create new list head and append nodes in sorted order.  
Uses extra space for new list nodes.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Dummy head with pointer manipulation for in-place merge.  
Compare nodes and adjust next pointers iteratively.  
Time: `O(n)`, Space: `O(1)`

### 138. Copy List with Random Pointer`[ Medium ]`
**Problem Statement:**  
Deep copy linked list with additional random pointer.  
Random pointer may point to any node or null.  
Return head of copied list.

**Naive Approach:**  
Two-pass: first copy nodes, second set random pointers.  
Use dictionary to map original→copy nodes.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Weave new nodes between originals then separate lists.  
Handle random pointers through original->next->random.  
Time: `O(n)`, Space: `O(1)`

### 092. Reverse Linked List II`[ Medium ]`
**Problem Statement:**  
Reverse nodes from position left to right in one-pass.  
Position indexing starts at 1.  
Do not change values, only node pointers.

**Naive Approach:**  
Extract sublist, reverse, and reconnect to main list.  
Requires multiple passes for position tracking.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Four pointers: pre, start, then, and current.  
Reverse in-place by updating next pointers incrementally.  
Time: `O(n)`, Space: `O(1)`

### 025. Reverse Nodes in k-Group`[ Hard ]`
**Problem Statement:**  
Reverse nodes k at a time in linked list.  
If nodes < k, leave remaining as is.  
Modify list in-place.

**Naive Approach:**  
Recursively reverse groups and connect results.  
Uses `O(n/k)` recursion stack space.  
Time: `O(n)`, Space: `O(n/k)`

**Expected Approach:**  
Iterative reversal with dummy head and group tracking.  
Count k nodes, reverse group, and reconnect.  
Time: `O(n)`, Space: `O(1)`

### 019. Remove Nth Node From End of List`[ Medium ]`
**Problem Statement:**  
Remove nth node from end of list in one-pass.  
Use dummy node to handle head removal case.  
n guaranteed valid.

**Naive Approach:**  
Two passes: count nodes then remove (L-n)th node.  
Violates one-pass requirement.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Two pointers with n-node gap; when fast reaches end, remove slow.next.  
Handle edge case when removing head node.  
Time: `O(n)`, Space: `O(1)`

### 082. Remove Duplicates from Sorted List II`[ Medium ]`
**Problem Statement:**  
Remove all duplicate nodes (keep distinct values only).  
List sorted in non-decreasing order.  
Return modified sorted list.

**Naive Approach:**  
Two loops: outer loop value, inner loop remove duplicates.  
Results in quadratic time complexity.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Dummy head with prev and curr pointers; jump duplicates.  
Adjust prev->next when duplicates detected.  
Time: `O(n)`, Space: `O(1)`

### 061. Rotate List`[ Medium ]`
**Problem Statement:**  
Rotate list right by k places.  
Connect tail to head and break at new tail position.  
Handle k larger than list length.

**Naive Approach:**  
Rotate one place at a time for k iterations.  
Inefficient when k is large.  
Time: `O(kn)`, Space: `O(1)`

**Expected Approach:**  
Find tail and length; compute effective k with modulo.  
Break list at (length - k % length)th node.  
Time: `O(n)`, Space: `O(1)`

### 086. Partition List`[ Medium ]`
**Problem Statement:**  
Partition list around value x preserving original order.  
Nodes < x come before nodes >= x.  
Partition should preserve relative node order.

**Naive Approach:**  
Create two new lists for before and after partitions.  
Merge lists after processing all nodes.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Two dummy heads for before and after lists.  
Traverse list, appending to before/after lists.  
Time: `O(n)`, Space: `O(1)`

### 146. LRU Cache`[ Medium ]`
**Problem Statement:**  
Design LRU cache with `O(1)` get and put operations.  
get(key) returns value or -1; updates usage recency.  
put(key, value) adds or updates; evicts least recent if full.

**Naive Approach:**  
Array/list with timestamp for each access.  
Finding least recent requires `O(n)` scan.  
Time: `O(n)` for get/put, Space: `O(1)`

**Expected Approach:**  
Hashmap + doubly linked list for `O(1)` access and removal.  
HashMap stores key→node; list maintains recency order.  
Time: `O(1)` all ops, Space: `O(capacity)`

## Binary Tree General
### 104. Maximum Depth of Binary Tree`[ Easy ]`
**Problem Statement:**  
Compute maximum depth (longest root-leaf path).  
Depth defined as number of nodes along path.  
Empty tree depth 0.

**Naive Approach:**  
Level-order traversal with queue and depth counter.  
Uses `O(n)` space for queue storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Recursive DFS: max(left_depth, right_depth) + 1.  
Base case: null node returns depth 0.  
Time: `O(n)`, Space: `O(h)`

### 100. Same Tree`[ Easy ]`
**Problem Statement:**  
Check if two binary trees are structurally identical with same values.  
Both trees have same node structure and values at each position.  
Handle null trees.

**Naive Approach:**  
Serialize both trees and compare string representations.  
Requires `O(n)` space for serialization.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Recursive comparison: current node values equal, left subtrees same, right subtrees same.  
Handle null cases first during traversal.  
Time: `O(n)`, Space: `O(h)`

### 226. Invert Binary Tree`[ Easy ]`
**Problem Statement:**  
Mirror binary tree: swap left and right subtrees recursively.  
Modify tree in-place without creating new tree.  
Handle leaf nodes.

**Naive Approach:**  
Create new mirrored tree with copied nodes.  
Wastes space for duplicate tree.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Post-order traversal: invert left and right subtrees first.  
Swap left/right pointers after subtree inversion.  
Time: `O(n)`, Space: `O(h)`

### 101. Symmetric Tree`[ Easy ]`
**Problem Statement:**  
Check if tree is mirror of itself around center.  
Left subtree mirrors right subtree recursively.  
Empty tree considered symmetric.

**Naive Approach:**  
Serialize left and right subtrees as mirror representations.  
Compare serialized strings for equality.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Recursive helper(left, right): compare left.left with right.right and left.right with right.left.  
Base case: both null → symmetric.  
Time: `O(n)`, Space: `O(h)`

### 105. Construct Binary Tree from Preorder and Inorder Traversal`[ Medium ]`
**Problem Statement:**  
Build binary tree from preorder and inorder traversal arrays.  
Arrays consist of distinct values.  
Assume valid inputs that form tree.

**Naive Approach:**  
Linear search for root in inorder array during each recursion.  
Causes `O(n)` search per node → quadratic time.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
HashMap for inorder value→index; recursion with array ranges.  
Preorder first element is root; split inorder accordingly.  
Time: `O(n)`, Space: `O(n)`

### 106. Construct Binary Tree from Inorder and Postorder Traversal`[ Medium ]`
**Problem Statement:**  
Build binary tree from inorder and postorder traversal arrays.  
Arrays have distinct values and valid for tree construction.  
Handle empty arrays.

**Naive Approach:**  
Linear scan for root in inorder during each recursion.  
Inefficient for large unbalanced trees.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
HashMap for inorder positions; postorder last element is root.  
Recursively build right subtree then left subtree.  
Time: `O(n)`, Space: `O(n)`

### 117. Populating Next Right Pointers in Each Node II`[ Medium ]`
**Problem Statement:**  
Connect each node to its next right node at same level.  
Last node in level points to null.  
Initially all next pointers null.

**Naive Approach:**  
Level-order traversal with queue to set next pointers.  
Uses `O(n)` space for queue storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Use existing next pointers: track current level head and next level dummy.  
Traverse current level via next pointers to connect children.  
Time: `O(n)`, Space: `O(1)`

### 114. Flatten Binary Tree to Linked List`[ Medium ]`
**Problem Statement:**  
Flatten tree to linked list in-place using right pointers.  
Linked list order should be pre-order traversal.  
Left pointers should be null after flattening.

**Naive Approach:**  
Store nodes in list during pre-order traversal.  
Rebuild tree with right pointers and null left pointers.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Morris traversal: while current exists, if left exists, find rightmost in left subtree.  
Set rightmost->right = current->right, current->right = current->left.  
Time: `O(n)`, Space: `O(1)`

### 112. Path Sum`[ Easy ]`
**Problem Statement:**  
Check if root-to-leaf path sums to target sum.  
Path must end at leaf (no partial paths).  
Handle negative values.

**Naive Approach:**  
Store all paths and check sums.  
Wastes space for path storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
DFS: subtract node value from target sum at each node.  
At leaf, check if remaining sum equals leaf value.  
Time: `O(n)`, Space: `O(h)`

### 129. Sum Root to Leaf Numbers`[ Medium ]`
**Problem Statement:**  
Sum all root-to-leaf numbers formed by path digits.  
Each node value is single digit (0-9).  
Path number formed by concatenation.

**Naive Approach:**  
Store all path numbers then sum.  
Uses `O(n)` space for path storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
DFS: pass current number to children (current*10 + value).  
At leaf, add current number to total sum.  
Time: `O(n)`, Space: `O(h)`

### 124. Binary Tree Maximum Path Sum`[ Hard ]`
**Problem Statement:**  
Find max path sum (any node to any node).  
Path may not pass through root.  
Path can include at most one turn.

**Naive Approach:**  
Consider all node pairs and paths between them.  
Leads to `O(n²)` time for large trees.  
Time: `O(n²)`, Space: `O(h)`

**Expected Approach:**  
DFS: return max single path sum from node, update global max with node+left+right.  
Global max tracks best path with turn at current node.  
Time: `O(n)`, Space: `O(h)`

### 173. Binary Search Tree Iterator`[ Medium ]`
**Problem Statement:**  
Design iterator with next() and hasNext() for BST.  
next() returns next smallest number in BST.  
hasNext() returns boolean.

**Naive Approach:**  
Store inorder traversal in list during initialization.  
Use pointer to track current position in list.  
Time: `O(1)` per op, Space: `O(n)`

**Expected Approach:**  
Controlled iterative inorder traversal using stack.  
Push left nodes during initialization; pop on next.  
Time: `O(1)` avg, Space: `O(h)`

### 222. Count Complete Tree Nodes`[ Easy ]`
**Problem Statement:**  
Count nodes in complete binary tree efficiently.  
Complete tree: all levels full except last, filled left to right.  
Solution must be better than `O(n)`.

**Naive Approach:**  
Traverse entire tree counting nodes.  
Worst-case `O(n)` time for full trees.  
Time: `O(n)`, Space: `O(h)`

**Expected Approach:**  
Compare left and right subtree heights; if equal, left is full.  
If heights differ, recurse on left and right subtrees.  
Time: `O((log n)`²), Space: `O(1)`

### 236. Lowest Common Ancestor of a Binary Tree`[ Medium ]`
**Problem Statement:**  
Find lowest common ancestor of two nodes in binary tree.  
LCA: deepest node with both nodes as descendants.  
Node can be descendant of itself.

**Naive Approach:**  
Store paths to both nodes then find last common node.  
Requires `O(n)` space for path storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Recursive DFS: return node if found in subtree, else null.  
If both subtrees return non-null, current node is LCA.  
Time: `O(n)`, Space: `O(h)`

## Binary Tree BFS
### 199. Binary Tree Right Side View`[ Medium ]`
**Problem Statement:**  
Return rightmost node values at each tree level.  
Ordered from top level to bottom level.  
If multiple nodes at level, return rightmost.

**Naive Approach:**  
Full BFS storing all nodes per level.  
Return last element of each level array.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
BFS: for each level, track last node value.  
Add last node value to result after level traversal.  
Time: `O(n)`, Space: `O(n)`

### 637. Average of Levels in Binary Tree`[ Easy ]`
**Problem Statement:**  
Return list of average values for each tree level.  
Averages as doubles with tolerance for large numbers.  
Ordered from root level to leaf level.

**Naive Approach:**  
Store all values per level then calculate averages.  
Uses `O(n)` space for level storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
BFS: track level sum and count during traversal.  
Compute average after each level completion.  
Time: `O(n)`, Space: `O(n)`

### 102. Binary Tree Level Order Traversal`[ Medium ]`
**Problem Statement:**  
Return level-order traversal as list of lists.  
Each sublist contains nodes at same level.  
Sublists in top-down order.

**Naive Approach:**  
DFS with level parameter to store nodes.  
Requires `O(n)` recursion stack space.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
BFS with queue: process nodes by level.  
Track level size to separate levels.  
Time: `O(n)`, Space: `O(n)`

### 103. Binary Tree Zigzag Level Order Traversal`[ Medium ]`
**Problem Statement:**  
Return level-order traversal with alternating direction.  
Odd levels left-right, even levels right-left.  
Level 0 is root (left-right).

**Naive Approach:**  
Regular BFS then reverse even-level lists.  
Uses `O(n)` time for reversing lists.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
BFS with direction flag; use deque for alternating append order.  
Or reverse list during even-level result storage.  
Time: `O(n)`, Space: `O(n)`

## Binary Search Tree
### 530. Minimum Absolute Difference in BST`[ Easy ]`
**Problem Statement:**  
Find minimum absolute difference between any two BST nodes.  
Difference always non-negative.  
BST has at least two nodes.

**Naive Approach:**  
Inorder traversal to array then pairwise difference check.  
Uses `O(n)` space for array storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Inorder traversal tracking previous node value.  
Update min_diff when current - previous < current min.  
Time: `O(n)`, Space: `O(h)`

### 230. Kth Smallest Element in a BST`[ Medium ]`
**Problem Statement:**  
Find kth smallest element in BST (1-indexed).  
BST modified frequently with insert/delete.  
k always valid (1 ≤ k ≤ nodes).

**Naive Approach:**  
Full inorder traversal to array then return arr[k-1].  
Wastes space for complete traversal storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Iterative inorder traversal: stop at kth element.  
Use stack to simulate recursion; pop k times.  
Time: `O(k)`, Space: `O(h)`

### 098. Validate Binary Search Tree`[ Medium ]`
**Problem Statement:**  
Check if binary tree is valid BST (left < root < right).  
Subtree values must be within valid ranges.  
Handle duplicate values? (No duplicates in BST).

**Naive Approach:**  
Check min/max per node without propagating parent constraints.  
May accept invalid BST with out-of-range subtrees.  
Time: `O(n²)`, Space: `O(h)`

**Expected Approach:**  
DFS with range (min, max); update range for children.  
Root range (-∞, +∞); left child (min, root.val), right (root.val, max).  
Time: `O(n)`, Space: `O(h)`

## Graph General
### 200. Number of Islands`[ Medium ]`
**Problem Statement:**  
Count islands in 2D grid ('1' land, '0' water).  
Islands surrounded by water and connected horizontally/vertically.  
Assume all four edges surrounded by water.

**Naive Approach:**  
Nested loops without DFS/BFS (inefficient detection).  
Fails to count connected components properly.  
Time: `O(nm)`, Space: `O(1)`

**Expected Approach:**  
DFS/BFS: when finding '1', mark connected land as visited.  
Increment island count for each unvisited land start.  
Time: `O(nm)`, Space: `O(min(n,m)`) or `O(nm)`

### 130. Surrounded Regions`[ Medium ]`
**Problem Statement:**  
Flip surrounded 'O's to 'X's (not bordering edges).  
Regions connected horizontally/vertically.  
Edge 'O's not flipped.

**Naive Approach:**  
Check each 'O' for border connection with BFS/DFS.  
Leads to `O((nm)`²) worst-case time.  
Time: `O(n²m²)`, Space: `O(nm)`

**Expected Approach:**  
Mark edge-connected 'O's with temporary marker via BFS/DFS.  
Flip inner 'O's to 'X', restore temporary markers to 'O'.  
Time: `O(nm)`, Space: `O(nm)`

### 133. Clone Graph`[ Medium ]`
**Problem Statement:**  
Deep copy undirected connected graph (each node has neighbors).  
Node values unique? No, use node reference as key.  
Handle null input.

**Naive Approach:**  
Serialize nodes then build graph from serialization.  
Complex serialization for graph structure.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
BFS/DFS with hashmap storing original→copy nodes.  
Copy neighbors using map to avoid duplicates.  
Time: `O(n)`, Space: `O(n)`

### 399. Evaluate Division`[ Medium ]`
**Problem Statement:**  
Compute division results from equations and queries.  
Equations: [a,b] = value → a/b = value.  
Queries: [c,d] → c/d value or -1.0 if unknown.

**Naive Approach:**  
BFS/DFS for each query to find connection path.  
Recompute paths for every query.  
Time: `O(q×(v+e)`), Space: `O(e)`

**Expected Approach:**  
Build graph then BFS/DFS with path product calculation.  
Use union-find with path compression and weights.  
Time: `O(q×(v+e)`), Space: `O(e)`

### 207. Course Schedule`[ Medium ]`
**Problem Statement:**  
Check if possible to finish courses given prerequisites.  
prerequisites[i] = [a,b] → must take b before a.  
Return true if no cycle, false otherwise.

**Naive Approach:**  
Check all paths for cycles with DFS.  
No cycle detection optimization leads to inefficiency.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
Topological sort: Kahn's algorithm (BFS with indegree).  
Or DFS with three states (unvisited, visiting, visited).  
Time: `O(n+e)`, Space: `O(n)`

### 210. Course Schedule II`[ Medium ]`
**Problem Statement:**  
Return valid course order if possible; else empty array.  
prerequisites[i] = [a,b] → b before a.  
Multiple valid orders accepted.

**Naive Approach:**  
Generate all permutations and check validity.  
Factorial time complexity impractical.  
Time: `O(n!)`, Space: `O(n)`

**Expected Approach:**  
Kahn's algorithm: track indegree, enqueue zero-indegree nodes.  
Pop from queue, reduce neighbor indegree, enqueue if zero.  
Time: `O(n+e)`, Space: `O(n)`

## Graph BFS
### 909. Snakes and Ladders`[ Medium ]`
**Problem Statement:**  
Find min dice rolls to reach n² on snakes and ladders board.  
Board represented as 2D grid with boustrophedon numbering.  
Squares with -1 are normal; others are snakes/ladders.

**Naive Approach:**  
Backtracking with dice roll choices.  
Exponential time worst-case.  
Time: `O(6ⁿ)`, Space: `O(n)`

**Expected Approach:**  
BFS: each square is node, dice rolls (1-6) are edges.  
Track visited squares to avoid reprocessing.  
Time: `O(n²)`, Space: `O(n²)`

### 433. Minimum Genetic Mutation`[ Medium ]`
**Problem Statement:**  
Find min mutations to transform start gene to end gene.  
Valid mutations: change one char to valid gene bank char.  
If not possible, return -1.

**Naive Approach:**  
Check all mutation paths with backtracking.  
Worst-case exponential in gene length.  
Time: `O(4ᴸ)`, Space: `O(L)`

**Expected Approach:**  
BFS: each gene is node, one-char mutations are edges.  
Use bank as visited set; queue for mutation steps.  
Time: `O(L×4ᴸ)`, Space: `O(4ᴸ)`

### 127. Word Ladder`[ Hard ]`
**Problem Statement:**  
Find shortest transformation from beginWord to endWord.  
Each step change one char; new word must be in wordList.  
If not possible, return 0.

**Naive Approach:**  
Backtracking exploring all transformation paths.  
Exponential time in word length.  
Time: `O(26ᴸ×n)`, Space: `O(n)`

**Expected Approach:**  
Bidirectional BFS: search from both start and end.  
Meet when common word found in both frontiers.  
Time: `O(n×L²)`, Space: `O(n)`

## Trie
### 208. Implement Trie (Prefix Tree)`[ Medium ]`
**Problem Statement:**  
Implement trie with insert, search, startsWith methods.  
Assume inputs lowercase English letters.  
Handle empty string.

**Naive Approach:**  
Store all words in list; scan for prefix/word.  
Search `O(n)` per operation.  
Time: `O(n)` per search, Space: `O(1)`

**Expected Approach:**  
TrieNode with children[26] and isEnd flag.  
Traverse tree for each character in word.  
Time: `O(L)` per op, Space: `O(n×L)`

### 211. Design Add and Search Words Data Structure`[ Medium ]`
**Problem Statement:**  
Add words and search with '.' wildcard matching any letter.  
search: exact match or regex with '.'  
word contains lowercase letters or '.'.

**Naive Approach:**  
Linear scan with regex match for each word.  
Slow for large word databases.  
Time: `O(n×L)`, Space: `O(1)`

**Expected Approach:**  
Trie with DFS for wildcard: at '.', try all possible children.  
Recursive search with backtracking on wildcards.  
Time: `O(min(26ᴰ, n)`) for search, Space: `O(n×L)`

### 212. Word Search II`[ Hard ]`
**Problem Statement:**  
Find all words from dictionary in 2D character grid.  
Words can be constructed from adjacent (horiz/vert) letters.  
Same cell cannot be used more than once per word.

**Naive Approach:**  
For each word, perform DFS on grid.  
Worst-case `O(w×n×m×4ᴸ)` time.  
Time: `O(w×n×m×4ᴸ)`, Space: `O(w×L)`

**Expected Approach:**  
Trie from dictionary + DFS on grid with pruning.  
Use trie to terminate early when prefix not found.  
Time: `O(n×m×4ᴸ)`, Space: `O(w×L)`

## Backtracking
### 017. Letter Combinations of a Phone Number`[ Medium ]`
**Problem Statement:**  
Generate all letter combos for digit string (2-9).  
Mapping: 2=abc, 3=def, ..., 9=wxyz.  
Return empty list for empty string.

**Naive Approach:**  
Nested loops for each digit's letters.  
Depth of nesting equals digit string length.  
Time: `O(4ⁿ)`, Space: `O(4ⁿ)`

**Expected Approach:**  
Backtracking: for each digit, append possible letters recursively.  
Base case: path length equals digit string length.  
Time: `O(4ⁿ)`, Space: `O(n)`

### 077. Combinations`[ Medium ]`
**Problem Statement:**  
Generate all combinations of size k from numbers 1 to n.  
Return list of combinations in any order.  
Combination: distinct numbers in ascending order.

**Naive Approach:**  
Generate all subsets then filter by size k.  
Wasteful for large n and small k.  
Time: `O(2ⁿ)`, Space: `O(C(n,k)`)

**Expected Approach:**  
Backtracking with start index to avoid duplicates and maintain order.  
Recurse from current+1 to avoid reusing numbers.  
Time: `O(C(n,k)`), Space: `O(k)`

### 046. Permutations`[ Medium ]`
**Problem Statement:**  
Generate all permutations of distinct integers.  
Permutation: all possible orderings of elements.  
Return list in any order.

**Naive Approach:**  
Heap's algorithm for iterative permutation generation.  
Requires `O(n!)` space for result storage.  
Time: `O(n!)`, Space: `O(n!)`

**Expected Approach:**  
Backtracking: swap index with current position and recurse.  
Undo swap after recursion to reset state.  
Time: `O(n!)`, Space: `O(n)`

### 039. Combination Sum`[ Medium ]`
**Problem Statement:**  
Find combos that sum to target (candidates unlimited use).  
Combinations unique (frequency matters, not order).  
candidates have distinct positive integers.

**Naive Approach:**  
Generate all subsets and check sums.  
Wasteful for large candidates and small target.  
Time: `O(2ᵗ)`, Space: `O(t)`

**Expected Approach:**  
Backtracking with sorting and index reuse.  
Skip duplicates candidates; recurse from current index to allow reuse.  
Time: `O(2ᵗ)`, Space: `O(t)`

### 052. N-Queens II`[ Hard ]`
**Problem Statement:**  
Count distinct solutions to n-queens puzzle.  
Queens cannot attack each other (no same row/col/diagonal).  
Return number of distinct board configurations.

**Naive Approach:**  
Generate all permutations of rows and check diagonals.  
`O(n!)` time impractical for large n.  
Time: `O(n!)`, Space: `O(n)`

**Expected Approach:**  
Backtracking with column, diagonal and anti-diagonal sets.  
Place queen row-by-row; track attacked columns/diagonals.  
Time: `O(n!)`, Space: `O(n)`

### 022. Generate Parentheses`[ Medium ]`
**Problem Statement:**  
Generate all valid n-pair parentheses combinations.  
Valid: properly opened and closed parentheses.  
Example: n=3 → ["((()))","(()())","(())()","()(())","()()()"]

**Naive Approach:**  
Generate all 2²ⁿ strings and validate.  
Wasteful for large n.  
Time: `O(2²ⁿ)`, Space: `O(2²ⁿ)`

**Expected Approach:**  
Backtracking with open/close counters.  
Add '(' if open<n; add ')' if close<open.  
Time: `O(4ⁿ/√n)`, Space: `O(n)`

### 079. Word Search`[ Medium ]`
**Problem Statement:**  
Check if word exists in adjacent (horiz/vert) letters in grid.  
Same cell cannot be used more than once.  
Return true if found, false otherwise.

**Naive Approach:**  
Check all paths without backtracking optimization.  
Leads to excessive computations.  
Time: `O(n×m×4ᴸ)`, Space: `O(L)`

**Expected Approach:**  
Backtracking: mark visited cell, DFS, unmark after recursion.  
Prune when current character doesn't match word path.  
Time: `O(n×m×4ᴸ)`, Space: `O(L)`

## Divide & Conquer
### 108. Convert Sorted Array to Binary Search Tree`[ Easy ]`
**Problem Statement:**  
Build height-balanced BST from sorted integer array.  
Height-balanced: depth of subtrees differ by at most 1.  
Return root of BST.

**Naive Approach:**  
Insert elements in order to form skewed tree.  
Does not produce height-balanced tree.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Recursive: middle element as root, left/right subtrees from subarrays.  
Ensures minimal height by balancing nodes.  
Time: `O(n)`, Space: `O(log n)`

### 148. Sort List`[ Medium ]`
**Problem Statement:**  
Sort linked list in `O(n log n)` time with constant space.  
Cannot copy values; modify node pointers.  
Handle empty list.

**Naive Approach:**  
Convert to array, sort, rebuild list.  
Violates constant space requirement.  
Time: `O(n log n)`, Space: `O(n)`

**Expected Approach:**  
Merge sort: find mid with slow/fast pointers, sort halves, merge.  
Bottom-up merge sort for `O(1)` space.  
Time: `O(n log n)`, Space: `O(1)`

### 427. Construct Quad Tree`[ Medium ]`
**Problem Statement:**  
Build quad tree from n x n grid (n=2ᵏ).  
Quad tree: leaf if all values same; otherwise internal node with four children.  
Each internal node represents subdivided grid.

**Naive Approach:**  
Check entire grid uniformity for each node.  
Leads to repeated grid checks.  
Time: `O(n²)`, Space: `O(log n)`

**Expected Approach:**  
Recursive partitioning: if grid not uniform, divide into four subgrids.  
Build children from subgrids; leaf if uniform value.  
Time: `O(n²)`, Space: `O(log n)`

### 023. Merge k Sorted Lists`[ Hard ]`
**Problem Statement:**  
Merge k sorted linked lists into one sorted list.  
Optimize time complexity for large k.  
Return head of merged list.

**Naive Approach:**  
Merge lists one by one using two-list merge.  
Results in `O(kn)` time worst-case.  
Time: `O(kn)`, Space: `O(1)`

**Expected Approach:**  
Divide and conquer: merge pairs of lists recursively.  
Or min-heap to always get smallest node from all lists.  
Time: `O(n log k)`, Space: `O(1)` for DC, `O(k)` for heap

## Kadane's Algorithm
### 053. Maximum Subarray`[ Medium ]`
**Problem Statement:**  
Find contiguous subarray with largest sum.  
At least one number exists in array.  
Return sum only, not the subarray.

**Naive Approach:**  
Check all possible subarrays with nested loops.  
Inefficient for large arrays.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Kadane's: track current subarray sum and global max.  
Reset current sum if negative (hurting total).  
Time: `O(n)`, Space: `O(1)`

### 918. Maximum Sum Circular Subarray`[ Medium ]`
**Problem Statement:**  
Find maximum possible sum in circular array (next of last is first).  
Subarray can wrap around end to beginning.  
Handle negative numbers.

**Naive Approach:**  
Check all subarrays including wrap-around cases.  
Leads to `O(n²)` time complexity.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
Compute max non-circular (Kadane's) and circular sum (total - min subarray).  
Result is max(non-circular, circular) unless all negative.  
Time: `O(n)`, Space: `O(1)`

## Binary Search
### 035. Search Insert Position`[ Easy ]`
**Problem Statement:**  
Find index where target should be inserted in sorted array.  
If target exists, return its index.  
Array sorted in ascending order.

**Naive Approach:**  
Linear scan to find first element ≥ target.  
Fails to leverage sorted property for efficiency.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Binary search: maintain low/high pointers; mid comparison.  
Return left pointer if target not found.  
Time: `O(log n)`, Space: `O(1)`

### 074. Search a 2D Matrix`[ Medium ]`
**Problem Statement:**  
Search sorted matrix (each row sorted, first of row > last of previous).  
Return true if target exists, false otherwise.  
Matrix dimensions m x n.

**Naive Approach:**  
Scan entire matrix linearly.  
Doesn't use row/column sorted properties.  
Time: `O(mn)`, Space: `O(1)`

**Expected Approach:**  
Treat as 1D array: row = idx//n, col = idx%n.  
Standard binary search on virtual 1D array.  
Time: `O(log(mn)`), Space: `O(1)`

### 162. Find Peak Element`[ Medium ]`
**Problem Statement:**  
Find peak element (greater than neighbors) in array.  
Assume nums[-1] = nums[n] = -∞.  
Return any peak index.

**Naive Approach:**  
Linear scan checking neighbors.  
Violates `O(log n)` requirement.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Binary search: compare mid with mid+1 to determine peak side.  
If mid < mid+1, peak in right half; else left half.  
Time: `O(log n)`, Space: `O(1)`

### 033. Search in Rotated Sorted Array`[ Medium ]`
**Problem Statement:**  
Search target in rotated sorted array (distinct values).  
Array sorted in ascending order then rotated at unknown pivot.  
Return index or -1.

**Naive Approach:**  
Find pivot then binary search in appropriate half.  
Requires two binary searches.  
Time: `O(log n)`, Space: `O(1)`

**Expected Approach:**  
Single binary search: check if [left, mid] or [mid, right] sorted.  
Adjust search range based on target within sorted portion.  
Time: `O(log n)`, Space: `O(1)`

### 034. Find First and Last Position of Element in Sorted Array`[ Medium ]`
**Problem Statement:**  
Find start and end indices of target in sorted array.  
Return [-1,-1] if target not found.  
Must run in `O(log n)` time.

**Naive Approach:**  
Find one occurrence then linear scan left/right.  
Degrades to `O(n)` if many duplicates.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Two binary searches: one for first occurrence (leftmost target).  
Second for last occurrence (rightmost target).  
Time: `O(log n)`, Space: `O(1)`

### 153. Find Minimum in Rotated Sorted Array`[ Medium ]`
**Problem Statement:**  
Find min element in rotated sorted array (distinct values).  
Array sorted in ascending order then rotated.  
Assume rotation exists.

**Naive Approach:**  
Linear scan for min element.  
Violates `O(log n)` requirement.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Binary search: compare mid with right to determine min side.  
If mid > right, min in right half; else left half.  
Time: `O(log n)`, Space: `O(1)`

### 004. Median of Two Sorted Arrays`[ Hard ]`
**Problem Statement:**  
Find median of two sorted arrays in `O(log (m+n)`) time.  
Arrays not necessarily equal size.  
Median for even length: (left_mid + right_mid)/2.

**Naive Approach:**  
Merge arrays then find median.  
Violates logarithmic time requirement.  
Time: `O(m+n)`, Space: `O(m+n)`

**Expected Approach:**  
Partitioning: find cut points where left halves ≤ right halves.  
Adjust cuts using binary search for correct partition.  
Time: `O(log(min(m,n)`)), Space: `O(1)`

## Heap
### 215. Kth Largest Element in an Array`[ Medium ]`
**Problem Statement:**  
Find kth largest element in unsorted array.  
Note: not kth distinct largest.  
Optimize for large datasets.

**Naive Approach:**  
Sort array and return arr[n-k].  
Wasteful if k small (sorts entire array).  
Time: `O(n log n)`, Space: `O(1)`

**Expected Approach:**  
Min-heap of size k: add elements, pop when size > k.  
Heap root is kth largest after full traversal.  
Time: `O(n log k)`, Space: `O(k)`

### 502. IPO`[ Hard ]`
**Problem Statement:**  
Select projects for max capital with k investments.  
Each project has (profit, capital); initial capital w.  
Can only do project if capital ≥ project capital.

**Naive Approach:**  
Sort projects by capital each time; select affordable with max profit.  
Re-sorting after each selection inefficient.  
Time: `O(kn log n)`, Space: `O(n)`

**Expected Approach:**  
Max-heap for profits of affordable projects (capital ≤ current).  
Min-heap for unaffordable projects sorted by capital.  
Time: `O(n log n)`, Space: `O(n)`

### 373. Find K Pairs with Smallest Sums`[ Medium ]`
**Problem Statement:**  
Find k pairs with smallest sums from two sorted arrays.  
Pair: one element from each array.  
Return pairs in ascending sum order.

**Naive Approach:**  
Generate all pairs, sort by sum, return first k.  
Wasteful for large arrays.  
Time: `O(mn log(mn)`), Space: `O(mn)`

**Expected Approach:**  
Min-heap storing (sum, i, j); initially all (nums1[i] + nums2[0], i, 0).  
After popping, push (nums1[i] + nums2[j+1], i, j+1).  
Time: `O(k log k)`, Space: `O(k)`

### 295. Find Median from Data Stream`[ Hard ]`
**Problem Statement:**  
Design data structure with addNum and findMedian.  
Median: middle value or average of two middles.  
Optimize for frequent adds and finds.

**Naive Approach:**  
Insertion sort on every addNum.  
Costly `O(n)` per insertion.  
Time: `O(n)` per addNum, Space: `O(n)`

**Expected Approach:**  
Two heaps: max-heap for left half, min-heap for right half.  
Balance heaps after insertion; median from heap roots.  
Time: `O(log n)` per addNum, Space: `O(n)`

## Bit Manipulation
### 067. Add Binary`[ Easy ]`
**Problem Statement:**  
Add two binary strings; return sum as binary string.  
Strings non-empty and contain only '0'/'1'.  
No leading zeros except "0".

**Naive Approach:**  
Convert to integers, add, convert back to binary.  
Fails for very large binary strings.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Bit-by-bit addition with carry tracking.  
Process strings from least significant bit.  
Time: `O(max(a,b)`), Space: `O(1)`

### 190. Reverse Bits`[ Easy ]`
**Problem Statement:**  
Reverse bits of 32-bit unsigned integer.  
Reverse entire bit sequence.  
No leading zeros in binary representation.

**Naive Approach:**  
Convert to binary string, reverse, convert back.  
Uses string conversion as intermediate.  
Time: `O(32)`, Space: `O(32)`

**Expected Approach:**  
Bit shifting: initialize result=0, for each bit, result <<1 | (n & 1), n >>=1.  
Reverse bits in 32 iterations.  
Time: `O(1)`, Space: `O(1)`

### 191. Number of 1 Bits`[ Easy ]`
**Problem Statement:**  
Count number of set bits ('1') in unsigned integer.  
Also known as Hamming weight.  
Optimize for frequent calls.

**Naive Approach:**  
Check each bit in loop (32 iterations).  
Works but not optimized for sparse ones.  
Time: `O(32)`, Space: `O(1)`

**Expected Approach:**  
Brian Kernighan's: n & (n-1) clears lowest set bit.  
Count iterations until n becomes 0.  
Time: `O(k)` k=set bits, Space: `O(1)`

### 136. Single Number`[ Easy ]`
**Problem Statement:**  
Find non-duplicate in array (others appear twice).  
Linear time, constant space required.  
Array non-empty.

**Naive Approach:**  
Hashmap to count frequencies.  
Uses linear space for frequency counts.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
XOR all elements: duplicates cancel, leaves single number.  
a XOR a = 0; a XOR 0 = a.  
Time: `O(n)`, Space: `O(1)`

### 137. Single Number II`[ Medium ]`
**Problem Statement:**  
Find non-duplicate in array (others appear thrice).  
Linear time, constant space required.  
Array non-empty.

**Naive Approach:**  
Hashmap for frequency counts.  
Uses linear space for storage.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Bitwise counters: track bits that appear 3k+1 times.  
Use ones/twos/threes masks for each bit position.  
Time: `O(n)`, Space: `O(1)`

### 201. Bitwise AND of Numbers Range`[ Medium ]`
**Problem Statement:**  
Find AND of all numbers in range [left, right].  
Optimize for large ranges.  
Return single integer result.

**Naive Approach:**  
Iterate from left to right, AND all numbers.  
Degrades to linear time for large ranges.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Find common prefix of bits in left and right.  
Right-shift until equal, then left-shift back.  
Time: `O(32)`, Space: `O(1)`

## Math
### 009. Palindrome Number`[ Easy ]`
**Problem Statement:**  
Check if integer is palindrome without string conversion.  
Negative numbers not palindromic.  
Optimize for no extra space.

**Naive Approach:**  
Convert to string and check reverse.  
Uses linear space for string conversion.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Reverse half the number; compare with other half.  
Stop when reversed half ≥ original half.  
Time: `O(log n)`, Space: `O(1)`

### 066. Plus One`[ Easy ]`
**Problem Statement:**  
Increment large integer represented as digit array.  
Most significant digit at head; no leading zeros.  
Return resulting digit array.

**Naive Approach:**  
Convert to integer, increment, convert back.  
Fails for very large arrays beyond integer range.  
Time: `O(n)`, Space: `O(n)`

**Expected Approach:**  
Digit-by-digit addition with carry from least significant digit.  
Handle carry propagation; prepend new digit if overflow.  
Time: `O(n)`, Space: `O(1)`

### 172. Factorial Trailing Zeroes`[ Medium ]`
**Problem Statement:**  
Count trailing zeroes in n! (factorial).  
Trailing zeroes from factors of 10 (2×5).  
Optimize for large n.

**Naive Approach:**  
Calculate n! then count trailing zeroes.  
Impractical for large n due to overflow.  
Time: `O(n)`, Space: `O(log n!)`

**Expected Approach:**  
Count factors of 5 in 1..n (more limiting than 2).  
Sum n/5 + n/25 + n/125 + ...  
Time: `O(log n)`, Space: `O(1)`

### 069. Sqrt(x)`[ Easy ]`
**Problem Statement:**  
Compute integer square root of non-negative integer x.  
Return floor of exact square root.  
No built-in exponent functions.

**Naive Approach:**  
Linear search from 1 to x.  
Inefficient for large x values.  
Time: `O(√x)`, Space: `O(1)`

**Expected Approach:**  
Binary search between 0 and x.  
Mid² compared to x; adjust search boundaries.  
Time: `O(log x)`, Space: `O(1)`

### 050. Pow(x, n)`[ Medium ]`
**Problem Statement:**  
Implement pow(x, n) which calculates x raised to n.  
Optimize for large n; handle negative exponents.  
-100.0 < x < 100.0, n is 32-bit signed integer.

**Naive Approach:**  
Multiply x, n times (positive n).  
Fails for large n and negative exponents.  
Time: `O(n)`, Space: `O(1)`

**Expected Approach:**  
Exponentiation by squaring: recursive or iterative.  
Handle negative n as 1/pow(x, -n).  
Time: `O(log n)`, Space: `O(1)`

### 149. Max Points on a Line`[ Hard ]`
**Problem Statement:**  
Find max points lying on same straight line in 2D plane.  
Points represented as [x,y] integer coordinates.  
Handle duplicate points.

**Naive Approach:**  
Check all point triplets for collinearity.  
Leads to cubic time complexity.  
Time: `O(n³)`, Space: `O(1)`

**Expected Approach:**  
For each point, calculate slopes to others; count duplicates.  
Use GCD to normalize slope fractions; track max per point.  
Time: `O(n²)`, Space: `O(n)`

## 1D DP
### 070. Climbing Stairs`[ Easy ]`
**Problem Statement:**  
Count distinct ways to climb n stairs (1 or 2 steps per move).  
n positive integer; start from step 0.  
Fibonacci-like sequence.

**Naive Approach:**  
Recursion without memoization: fib(n-1) + fib(n-2).  
Exponential time due to redundant calculations.  
Time: `O(2ⁿ)`, Space: `O(n)`

**Expected Approach:**  
DP: dp[i] = dp[i-1] + dp[i-2]; dp[0]=1, dp[1]=1.  
Optimize to two variables for constant space.  
Time: `O(n)`, Space: `O(1)`

### 198. House Robber`[ Medium ]`
**Problem Statement:**  
Max sum of non-adjacent numbers in array.  
Cannot select adjacent elements in array.  
Array values non-negative.

**Naive Approach:**  
Recursive with choice: rob current + skip next or skip current.  
Exponential time without memoization.  
Time: `O(2ⁿ)`, Space: `O(n)`

**Expected Approach:**  
DP: dp[i] = max(dp[i-1], nums[i] + dp[i-2]).  
Optimize to two variables (prev, curr).  
Time: `O(n)`, Space: `O(1)`

### 139. Word Break`[ Medium ]`
**Problem Statement:**  
Check if string can be segmented into dictionary words.  
Words can be reused; no extra spaces.  
Dictionary non-empty.

**Naive Approach:**  
Recursive backtracking: try all dictionary word prefixes.  
Exponential time worst-case.  
Time: `O(2ⁿ)`, Space: `O(n)`

**Expected Approach:**  
DP: dp[i] = true if s[0:i] segmentable.  
For each i, check all words ending at i.  
Time: `O(n²)`, Space: `O(n)`

### 322. Coin Change`[ Medium ]`
**Problem Statement:**  
Min coins to make amount; coins infinite supply.  
Return -1 if amount cannot be made.  
Coins distinct positive integers.

**Naive Approach:**  
Recursive: for each coin, subtract from amount and recurse.  
Exponential time without memoization.  
Time: `O(amountᶜ)`, Space: `O(amount)`

**Expected Approach:**  
DP: dp[i] = min(dp[i], 1 + dp[i-coin]) for each coin.  
Initialize dp[0]=0; others infinity.  
Time: `O(amount×coins)`, Space: `O(amount)`

### 300. Longest Increasing Subsequence`[ Medium ]`
**Problem Statement:**  
Find length of longest strictly increasing subsequence.  
Subsequence not necessarily contiguous.  
Optimize for `O(n log n)` time.

**Naive Approach:**  
DP: dp[i] = max(dp[j])+1 for j<i and nums[j]<nums[i].  
Quadratic time for large arrays.  
Time: `O(n²)`, Space: `O(n)`

**Expected Approach:**  
Patience sorting: maintain piles of cards with top increasing.  
Binary search to place each number in piles.  
Time: `O(n log n)`, Space: `O(n)`

## Multidimensional DP
### 120. Triangle`[ Medium ]`
**Problem Statement:**  
Find min path sum from top to bottom of triangle.  
Move to adjacent numbers on next row (i or i+1).  
Triangle represented as list of lists.

**Naive Approach:**  
Recursive top-down without memoization.  
Exponential time for deep triangles.  
Time: `O(2ʰ)`, Space: `O(h)`

**Expected Approach:**  
Bottom-up DP: start from last row, dp[i][j] = min(dp[i+1][j], dp[i+1][j+1]) + triangle[i][j].  
Optimize to single array for `O(n)` space.  
Time: `O(n)`, Space: `O(n)`

### 064. Minimum Path Sum`[ Medium ]`
**Problem Statement:**  
Find min path sum from top-left to bottom-right of grid.  
Move only down or right.  
Grid filled with non-negative numbers.

**Naive Approach:**  
Recursive DFS without memoization.  
Exponential time for large grids.  
Time: `O(2ᵐ⁺ⁿ)`, Space: `O(mn)`

**Expected Approach:**  
2D DP: dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1]).  
Handle top/left boundaries separately.  
Time: `O(mn)`, Space: `O(mn)`

### 063. Unique Paths II`[ Medium ]`
**Problem Statement:**  
Count paths from top-left to bottom-right with obstacles.  
Obstacles marked 1; space marked 0.  
Move down or right only.

**Naive Approach:**  
Recursive DFS with obstacle checks.  
Exponential time without memoization.  
Time: `O(2ᵐ⁺ⁿ)`, Space: `O(mn)`

**Expected Approach:**  
2D DP: dp[i][j] = 0 if obstacle; else dp[i-1][j] + dp[i][j-1].  
Initialize dp[0][0]=1 if no obstacle.  
Time: `O(mn)`, Space: `O(mn)`

### 005. Longest Palindromic Substring`[ Medium ]`
**Problem Statement:**  
Find longest palindromic substring in string.  
Palindrome reads same forwards and backwards.  
String not empty.

**Naive Approach:**  
Check all substrings for palindromicity.  
Cubic time worst-case.  
Time: `O(n³)`, Space: `O(1)`

**Expected Approach:**  
Expand around center: try every center (odd/even lengths).  
Track longest palindrome during expansion.  
Time: `O(n²)`, Space: `O(1)`

### 097. Interleaving String`[ Medium ]`
**Problem Statement:**  
Check if s3 is formed by interleaving s1 and s2.  
Interleave: merge while preserving order of s1/s2.  
s1, s2, s3 consist of lowercase English letters.

**Naive Approach:**  
Recursive: if s1[0] match s3[0], recurse s1[1:], s2, s3[1:], similarly for s2.  
Exponential time worst-case.  
Time: `O(2ᵐ⁺ⁿ)`, Space: `O(m+n)`

**Expected Approach:**  
2D DP: dp[i][j] = (dp[i-1][j] and s1[i-1]==s3[i+j-1]) or (dp[i][j-1] and s2[j-1]==s3[i+j-1]).  
Initialize dp[0][0]=true.  
Time: `O(mn)`, Space: `O(mn)`

### 072. Edit Distance`[ Medium ]`
**Problem Statement:**  
Min operations to convert word1 to word2 (insert/delete/replace).  
Each operation counts as 1 step.  
Return min step count.

**Naive Approach:**  
Recursive: try all operations at first difference.  
Exponential time without memoization.  
Time: `O(3ᵐ⁺ⁿ)`, Space: `O(m+n)`

**Expected Approach:**  
2D DP: dp[i][j] = min(1+dp[i-1][j], 1+dp[i][j-1], cost+dp[i-1][j-1]).  
cost=0 if word1[i-1]==word2[j-1] else 1.  
Time: `O(mn)`, Space: `O(mn)`

### 123. Best Time to Buy and Sell Stock III`[ Hard ]`
**Problem Statement:**  
Max profit with at most two transactions.  
Must sell before buying again; no simultaneous holdings.  
Prices array for each day.

**Naive Approach:**  
Divide array and run one-transaction max on left and right.  
`O(n²)` time for finding best split point.  
Time: `O(n²)`, Space: `O(1)`

**Expected Approach:**  
DP: track max profit after first buy, first sell, second buy, second sell.  
Update states in single pass: s2 = max(s2, b2+price), b2 = max(b2, s1-price), etc.  
Time: `O(n)`, Space: `O(1)`

### 188. Best Time to Buy and Sell Stock IV`[ Hard ]`
**Problem Statement:**  
Max profit with at most k transactions.  
Must sell before buying again; no simultaneous holdings.  
Prices array for each day.

**Naive Approach:**  
Check all possible transaction combinations.  
Exponential time in k.  
Time: `O(nᵏ)`, Space: `O(k)`

**Expected Approach:**  
DP: buy[j] = max(buy[j], sell[j-1]-price) for j in 1..k.  
sell[j] = max(sell[j], buy[j]+price) for each price.  
Time: `O(kn)`, Space: `O(k)`

### 221. Maximal Square`[ Medium ]`
**Problem Statement:**  
Find largest square of 1's in binary matrix.  
Square borders parallel to matrix borders.  
Return area of largest square.

**Naive Approach:**  
Check all possible squares with nested loops.  
Cubic time for large matrices.  
Time: `O(n³)`, Space: `O(1)`

**Expected Approach:**  
2D DP: dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1 if '1'.  
dp[i][j] represents max square side ending at (i,j).  
Time: `O(mn)`, Space: `O(mn)`
