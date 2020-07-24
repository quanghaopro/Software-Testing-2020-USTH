# Chapter 7 - Section 2 - Subsection 2 - Exercise 7

## (a)
- p2,p3 are test paths
- p1 is not a test path because it doesn't end at a final node
- p2 is not a test path because it doesn't start at in initial node
- p5 is not a test path since [2,3,2,3] is not a valid path

## (b)
### Edge-Pair Coverage TR:
(1,2,1), (1,2,3), (1,3,1), (2,1,2), (2,1,3), (2,3,1), (3,1,2), (3,1,3)

## (c)
Test paths in part (a) do not satisfy Edge-Pair Coverage since they did not cover 2 subpaths (2,1,2) and (3,1,3)

## (d)
P2 does not tour the prime path [3,1,3] directly. P2 tour the prime path with a detour through node (2)