# Section 7.2.2
----------------
## Exercise  7

### (a) Which of the listed paths are test paths? For any path that is not a test path, explain why not.

- p5 isn't a test path due to the lack of edge (3,2)
- p1 doesn't end on a final node
- p4 doesn't start at on initial node
- p2,3 satisfy


### (b) List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).

[1, 2, 1], [1, 2, 3], [1, 3, 1], [2, 1, 2],
[2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 1, 3] 

### (c) Does the set of test paths from part (a) above satisfy Edge-Pair Coverage? If not, state what is missing.

No, both p2 and p3 are missing edge [2, 1, 2] and [3, 1, 3]

### Consider the prime path [3, 1, 3] and path p3. Does p3 tour the prime path directly? With a sidetrip?

p3 doesn't tour the prime path directly, though it has a sidetrip of (1,2,1)

