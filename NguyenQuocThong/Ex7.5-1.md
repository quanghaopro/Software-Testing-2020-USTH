Ex7.5-1
Use the classBoundedQueue2for questions a–f below.
A compilable version is available on thebook website in the fileBoundedQueue2.java.
The queue is managed in the usual circularfashion.
Suppose we build a FSM where states are defined by the representation variables ofBound-edQueue2.
That is, a state is a 4-tuple defined by the values for [elements, size, f ront, back].
For example, the initial state has the value [[null, null],0,0,0], and the state that resultsfrom pushing an objectobjonto the queue in its initial state is [[obj, null],1,0,1].
a)We do not actually care which specific objects are in the queue.
Consequently, thereare really just four useful values for the variableelements. What are they?

b)How many states are there?

c)How many of these states are reachable?

a)elements are [null, null], [obj, null], [null, obj] and [obj, obj], [obj, null] and [ull, obj] are different at the representation level.

b) states = Element * size * front * back
 => states = 48

c)number of reachable states are 6

d)The exceptions (enqueue() on full queues and dequeue() on empty queues) as well as observer method.
