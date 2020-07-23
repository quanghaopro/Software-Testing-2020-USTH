Ex7.2.2-7
Answer questions a–d for the graph defined by the following sets:
•N={1,2,3}
•N0={1}
•Nf={3}
•E={(1,2),(1,3),(2,1),(2,3),(3,1)}
Also consider the following (candidate) paths:
•p1= [1,2,3,1]
•p2= [1,3,1,2,3]
•p3= [1,2,3,1,2,1,3]
•p4= [2,3,1,3]
•p5= [1,2,3,2,3

a)  Which of the listed paths are test paths?  For any path that is not a test path, explainwhy not.
b)  List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).
c)  Does the set oftestpaths from part (a) above satisfy Edge-Pair Coverage?  If not, statewhat is missing
d)  Consider the prime path [3,1,3] and pathp3.  Doesp3tour the prime path directly?With a sidetrip?

a)p2 and p3 are test paths. p1 does not terminate a  a final node. p4 does not start at an initial node.

b)Edge pairs: {[1,2,1],[1,2,3],[1,3,1],[2,1,2],[2,1,3],[2,3,1],[3,1,2],[3,1,3]}

c)Neither p2 nor p3 tours either of the edge-pairs:{[2,1,2],[3,1,3]}

d)p3 does not directly tour the prime path. However, p3 does tour the prime path with the sidetrip [1,2,1]










