# Stack
A Stack is a linear data structure that follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out). LIFO implies that the element that is inserted last, comes out first and FILO implies that the element that is inserted first, comes out last.

## Basic Operations on Stack
In order to make manipulation in a stack, there are certain operations provided to us.

* <b>push()</b> to insert an element into the stack
* <b>pop()</b> to remove an element from the stack
* <b>top() or peek()</b> Returns the top element of the stack without removing it
* <b>isEmpty()</b> return true if the stack is empty else false.
* <b>isFull()</b> return true if the stack is full else false.

## History Tracking
- A history tracking pattern comes into play when we need to remember and process elements in reverse order. If an action depends on what came before it, use stack because it lets us process the most recent elements first.
- Using a stack to record historical or states to allow undo, backtracking or reversal operations.
- Use cases:
  - <b>Web Browsers:</b> Tracking visited pages for the "Back" button
  - <b>Text Editors:</b> Tracking edits for "Undo" functionality.
- How it works:
  - Push each state or action onto the stack.
  - To revert, pop the top of the stack and restore the previous state.


## Customized Stack
- A stack tailored with additional features to fit specific use cases or optimize performance.
- Use cases:
  - <b>Min Stack:</b> A stack that supports push, pop and getMin in constant time by keeping a second stack to track the minimum value.
  - <b>Max Stack:</b> Similar to min stack but tracks the maximum value.
- Implementation:
  - Modify the standard stack operations to include auxiliary data structure for additional functionalities.

## Nested Structures / Mathematical operations


## Monotonic Stack


## Stack for DFS

