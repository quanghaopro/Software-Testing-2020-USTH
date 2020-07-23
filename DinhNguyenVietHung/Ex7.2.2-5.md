# Section 7.2.2
----------------
## Exercise  5

### (a) Draw the graph.

![](Ex7.2.2-5.png)

### (b) List the test requirements for Edge-Pair Coverage. (Hint: You should get 12 requirements of length 2.)

TR = {
    (1,2,3),(1,2,4),(1,2,6),(2,3,2),(2,4,6),(2,4,5),(2,6,1),
    (3,2,3),(3,2,4),(3,2,6),(4,5,6),(4,6,1),(5,6,1),(6,1,2),
    (6,1,7)
}

### (c) Does the given set of test paths satisfy Edge-Pair Coverage? If not, state what is missing?

No, the missing state is (6,1,2)

### (d) Consider the simple path (3, 2, 4, 5, 6) and test path (1, 2, 3, 2, 4, 6, 1, 2, 4, 5, 6, 1, 7). Does the test path tour the simple path directly? With a sidetrip? If so, write down the sidetrip.

The test path did tour with a sidetrip of (4,6,1,2,4)

### (e) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.

- NC's TR = {1,2,3,4,5,6,7}

- EC's TR = {
    (1,2),(1,7),(2,3),(2,4),(2,6),(3,2),(4,5),(4,6),(5,6),(6,1)
}

- PPC's TR = {
    (1,2,3),(1,2,4,5,6),(1,2,4,6),(2,3,2),(2,4,5,6,1),(2,4,6,1),(2,6,1),(3,2,3),(4,5,6,1,2),(4,5,6,1,2,3),(4,6,1),(1,7),(6,1,2,4,5),(6,1,2,4).(6,1,7)
}

### (f) List test paths from the given set that achieve Node Coverage but not Edge Coverage on the graph.

(1,2,3,2,4,5,6,1,7)

### (g) List test paths from the given set that achieve Edge Coverage but not Prime Path Coverage on the graph.

(1,2,3,2,4,5,6,1,2,6,1,1,4,6,1,7)
