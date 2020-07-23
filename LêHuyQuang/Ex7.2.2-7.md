7.2.2-7,

a,

p2 and p3 are test paths
p1, p4 and p5 is not a test path because p1 doesn't terminate at a final node, p4 does not start at an initial node and p5 includes an edge that does not exist in the graph

b,

TR Edge Pairs = { [1,2,1], [1,2,3], [1,3,1], [2,1,2], [2,1,3], [2,3,1], [3,1,2], [3,1,3] }

c, 

The set of test paths does not satisfy Edge-Pair Coverage because the remaining candidate paths are not test paths neither p2 nor p3 tours either of the edge-pairs :{ [2,1,2], [3,1,3] }

d, 

p3 does not tour the prime path directly
p3 does tour the prime path with the sidetrip [1,2,1]
