Ex 7.2.2-5

a. Draw the graph.

b. List the test requirements for Edge-Pair Coverage.


|[1,2,4,6,1,7]|	    [1,2,4], [1,7], [2,4,6], [4,6,1], [6,1,7]|

|[1,2,4,5,6,1,7]|	  [1,2,4], [1,7], [2,4,5], [4,5,6], [5,6,1], [6,1,7]|

|[1,2,3,2,3,2,4,6,1,7]|   	[1,2,3], [1,7], [2,3,2], [2,4,6], [3,2,3], [3,2,4], [4,6,1], [6,1,7]|

|[1,2,4,6,1,2,4,6,1,7]|	    [1,2,4], [1,7], [2,4,6], [4,6,1], [6,1,2], [6,1,7]|

c. Does the given set of test paths satisfy Edge-Pair Coverage? If not, state what is
missing.

p3 does not satisfy Edge-Pair Coverage.

d. Consider the simple path [3, 2, 4, 5, 6] and test path [1, 2, 3, 2, 4, 6, 1, 2, 4, 5, 6, 1, 7]. Does the test path tour the simple path directly? With a sidetrip? If so, write
down the sidetrip.

No.

With a sidetrip: [6,1,2,4,5,6]

e. List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.

TR node coverage: [1] [2] [7] [3] [4] [5] [6]

TR edge coverage: [1,2] [1,7] [2,3] [2,4] [3,2] [4,5] [4,6] [5,6] [6,1]

TR prime paths: [3,2,4,5,6,1,7] [2,4,5,6,1,2] [1,2,4,5,6,1] [3,2,4,6,1,7] [5,6,1,2,4,5] [6,1,2,4,5,6] [4,5,6,1,2,4] [4,5,6,1,2,3] [2,4,6,1,2] [1,2,4,6,1] [6,1,2,4,6] [4,6,1,2,3] [4,6,1,2,4] [3,2,3] [2,3,2]

f. List test paths from the given set that achieve Node Coverage but not Edge Coverage
on the graph.

[1,2,3,2,4,6,1,7]

[1,2,4,5,6,1,7]

g. List test paths from the given set that achieve Edge Coverage but not Prime Path
Coverage on the graph.

[1,2,3,2,4,6,1,7]
[1,2,4,5,6,1,7]