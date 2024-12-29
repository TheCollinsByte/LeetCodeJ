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
A history tracking pattern comes into play when we need to remember and process elements in reverse order. If an action depends on what came before it, use stack because it lets us process the most recent elements first.