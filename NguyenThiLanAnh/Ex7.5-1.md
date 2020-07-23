Ex 7.5-1

a. We do not actually care which specific objects are in the queue. Consequently, there are really just four useful values for the variable elements. What are they?

The four values for elements are [null, null], [obj, null], [null, obj] and [obj, obj], [obj, null] and [ull, obj] are different at the representation level.

b.How many states are there?

The number of states = Element * size * front * back = 4*3*2*2 = 48 (total states).

c. How many of these states are reachable?

Of the 48 states, only 6 are reachable.

d. Draw the reachable states in a graph. Be sure to indicate size, font, and back in your state labels.

The exceptions (enqueue() on full queues and dequeue() on empty queues) as well as observer method. Result in "loop transitions from a state back to itself.

e.Add edges for the enQueue() and deQueue() methods. (For this assignment, ignore the exceptional returns, although you should observe that when exceptional returns are taken, none of the instance variables are modified.)

These are not shown on the diagram for clarity and from a grading perspective, aren't relevant. Labels on nodes show the values of the representation state variables : Elements, size, front and back.


f. Define, implement in JUnit, and execute a test set that achieves Edge Coverage. You might find it helps to verify your answer if you write a method that shows the internal variables after each call.

    Queue q = new Queue();
    Object obj = new Object();
    q.enqueue(obj);
    q.enqueue(obj);
    q.dequeue();
    q.enqueue(obj);
    q.dequeue();
    q.dequeue();
    q.enqueue(obj);
    q.dequeue();