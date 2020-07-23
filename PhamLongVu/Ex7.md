7.2.2-5,

a, Graph: 
(1): start ; (7): end
(1) --> (2)
(2) --> (3)
(3) --> (2)
(4) --> (6)
(4) --> (5)
(5) --> (6)
(6) --> (1)

b, Edge Coverage :TR = {(1,2,3), (1,2,4), (2,3,2), (2,4,6), (2,4,5), (3,2,3), (3,2,4), (4,6,1), (4,5,6), (5,6,1), (6,1,7), (6,1,2)}

c,Test path p1 = [1,2,4,5,6,1,7]
=> This path covers (1,2,4), (2,4,5), (4,5,6), (5,6,1), (6,1,7)

Test path p2 = [1,2,3,2,4,6,1,7]
=>This path covers (1,2,3), (2,3,2), (3,2,4), (2,4,6), (4,6,1), (6,1,7)

Test path p3 = [1,2,3,2,4,5,6,1,7]
=>This path covers (1,2,3), (2,3,2), (3,2,4), (2,4,5), (4,5,6), (5,6,1), (6,1,7)

However, two edge pairs (3,2,3) and (6,1,2) are missing and not convered by any of the test path.Thus, given set of test path does not satisfy Edge-Pair Coverage.

d, A test path p tours subpath q if q is a subpath of p.
A test path p tours subpath q with sidetrips if every edge in q is also in p in the same order.
=> Test Path does not tour simple path directly
=> Test Path tours simple path with sidetrip {4,6,1,2,4}

e, TR for Node Coverage = {1, 2, 3, 4, 5, 6, 7}
Test paths: [1, 2, 3, 2, 4, 5, 6, 1, 7]
TR for Edge Coverage= {(1,2), (1,7), (2,3), (2,4) ,(3,2),(4,5), (4,6),(5,6),(6,1)}
Test paths: [1,2,3,2,4,6,1,7], [1,2,4, 5, 6, 1,7]
TR for Prime Path Coverage = {(1,2,4,6,1), (1,2,4,5,6,1), (2,3,2), (2,4,6,1,2), (2,4,5,6,1,2), (3,2,3), (3,2,4,6,1,7), (3,2,4,5,6,1,7), (4,5,6,1,2,4), (4,5,6,1,2,3), (4,6,1,2,4), (4,6,1,2,3), (5,6,1,2,4,5), (6,1,2,4,6), (6,1,2,4,5,6)}

f, Test path p3 = [1,2,3,2,4,5,6,1,7] achieves Node Coverage but not Edge Coverage.

g, p1 = [1,2,4,5,6,1,7]
p2 = [1,2,3,2,4,6,1,7]
p1 and p2 together achieve Egde Coverage but not Prime Path Coverage
p2 = [1,2,3,2,4,6,1,7]
p3 = [1,2,3,2,4,5,6,1,7]
p2 and p3 together achieve Egde Coverage but not Prime Path Coverage
7.2.2-6,

a,

TR Node Coverage = {1,2,3,4,5,6,7,8,9,10}
TR Edge Coverage = { (1,4), (1,5), (2,5), (3,6), (3,7), (4,8), (5,8), (5,9), (6,2), (6,10), (7,10), (9,6) }
TR Prime Path Coverage = { [1,4,8], [1,5,8], [1,5,9,6,2], [1,5,9,6,10], [2,5,9,6,2], [2,5,9,6,10], [3,6,2,5,8], [3,6,2,5,9], [3,6,10], [3,7,10], [5,9,6,2,5], [6,2,5,9,6], [9,6,2,5,8], [9,6,2,5,9] }

b,

T Node Coverage = {[1,4,8], [2,5,9,6,10], [3,7,10]}
Although T Node Coverage visits all nodes, T Node Coverage does not tour edges (1,5), (5,7), (6,1) and (3,6)

c,

T Edge Coverage = T Node Coverage U {[1,4,8], [3,6,2,5,8]}
Although T Edge Coverage tours all edges, T Edge Coverage does not tour prime paths [1,5,9,6,2], [2,5,9,6,2], [3,6,2,5,9], [2,6,10], [5,8,5,2,5], [5,1,6,9,6], [9,6,2,5,8], or [9,6,2,5,9]
 Ex7.2.2-7.md 
@@ -0,0 +1,19 @@
7.2.2-7,

a,

p2 and p3 are test paths
p1, p4 and p5 is not a test path because p1 doesn't terminate at a final node, p4 does not start at an initial node and p5 includes an edge that does not exist in the graph

b,

TR Edge Pairs = { [1,2,1], [1,2,3], [1,3,1], [2,1,2], [2,1,3], [2,3,1], [3,1,2], [3,1,3] }

c, 

The set of test paths does not satisfy Edge-Pair Coverage because the remaining candidate paths are not test paths neither p2 nor p3 tours either of the edge-pairs :{ [2,1,2], [3,1,3] }

7.2.3,

a, 

(1): start, (6): end.
Graph:
(1) --> (2)
(2) --> (3)
(3) --> (4)
(3) --> (5)
(4) --> (5)
(5) --> (2)
(2) --> (6)

b,

D-U Pairs : [1,3], [1,6], [3,3], [3,6]

D-U Paths : [1,2,6], [1,2,3], [3,5,2,3], [3,5,2,6], [3,4,5,2,3], [3,4,5,2,6]

c,

A test path p tours subpath q if q is a subpath of p

Test Path:
+ t1 = [1,2,6]
+ t2 = [1,2,3,4,5,2,3,5,2,6]
+ t3 = [1,2,3,5,2,3,4,5,2,6]
+ t4 = [1,2,3,5,2,6]

D-U Paths toured:
+ [1,2,6]
+ [1,2,3], [1,2,6], [3,5,2,6], [3,4,5,2,3], [3,4,5,2,6]
+ [1,2,3], [1,2,6], [3,5,2,3], [3,5,2,6], [3,4,5,2,6]
+ [1,2,3], [1,2,6], [3,5,2,6]

d,

t2=[1,2,3,4,5,2,3,5,2,6]

This test path satisfies all defs by touring at least one path for at least one use for each def
(Path toured are : [1,2,3], [3,5,2,6])

e,

t1 = [1,2,6]
t2 = [1,2,3,4,5,2,3,5,2,6]

These two test paths together satisfy all uses coverage by touring at least one path for each def-use pair.
(Paths toured are [1,2,3], [1,2,6], [3,4,5,2,3], [3,5,2,6])

f,

t1 = [1,2,6]
t2 = [1,2,3,4,5,2,3,5,2,6]
t3 = [1,2,3,5,2,3,4,5,2,6]

These three test paths together satisfy DU-paths coverage with respect to x.
7.5-1, 

a, 

The four values for elements are [ null, null ], [ obj, null ], [ null, obj ] and [ obj, obj ]
[ obj, null ] and [ null, obj ] are different at the representation level

b, 

The number of states = Element * size * front * back = 4 * 3 * 2 * 2 = 48 total states.

c,

Of the 48 states, only 6 are reachable.

d + e,

The exceptions (enqueue() on full queues and dequeue() on empty queues) as well as observer method. Result in "loop transitions from a state back to itself.
These are not shown on the diagram for clarity and from a grading perspective, aren't relevant. Labels on nodes show the values of the representation state variables : Elements, size, front and back.

f,Small test :

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
