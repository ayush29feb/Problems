# Unsolved Questions
- [Square With 1 in all Boundary](https://discuss.leetcode.com/topic/30809/largest-square-with-all-1-in-the-boundary)

# Solved Questions
## Implemented
- Merge Two Interval List: [Solution](./MergeIntervalList.java) [Question](https://discuss.leetcode.com/topic/245/merge-two-interval-lists)
- BST => DLL: [Solution](./BSTtoDLL.java) [Question](https://discuss.leetcode.com/topic/61942/fb-phone-screen-convert-a-bst-into-a-doubly-linked-list)

## Unimplemented
- https://discuss.leetcode.com/topic/112/minimal-run-time-scheduler
<pre>
Its is easy to calculate the runtime but just adding numbers and keeping track of each task in the sequence.
For the follow up optimization just use a dict and treverse through it in dec order of the quantity until its empty
</pre>
- https://discuss.leetcode.com/topic/57230/phone-interview-given-an-array-with-possible-repeated-numbers-randomly-output-the-index-of-a-given-number/2
- https://discuss.leetcode.com/topic/60744/fb-phone-interview-word-break-problem-given-a-string-s-and-a-dictionary-check-whether-the-string-can-be-broken-down-to-valid-words/2
<pre>
Use the Trie dictionary as a finite state machine. Store the running result (already formed words) in each pointer. 
Then at the end return all the pointers that end in an accept state. As you move each pointer if it reaches an accept 
state then move a copy of that pointer to the start with the new word to the running result.
</pre>
- 