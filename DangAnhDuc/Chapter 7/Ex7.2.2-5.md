# Chapter 7 - Section 2 - Subsection 2 - Exercise 5

## (a)
![image](./Ex7.2.2-5.png)

## (b)
List of Edge-Pair Coverage:
(1,2,3), (1,2,4), (2,3,2), (2,4,5), (2,4,6), (3,2,3), (3,2,4), (4,5,6), (4,6,1), (5,6,1), (6,1,2), (6,1,7)

## (c)
Given test paths do not satisfy Edge-Pair Coverage since all given paths lack of (6,1,2) edge-pair

## (d)
The test path does tour the simple path. The side trip is [4,6,1,2,4].

## (e)
### Node Coverage TR:
(1), (2), (3), (4), (5), (6), (7)

### Edge Coverage TR:
(1,2), (1,7), (2,3), (2,4), (3,2), (4,5), (4,6), (5,6), (6,1)

### Prime Path TR:
(3,2,4,5,6,1,7), (2,4,5,6,1,2), (1,2,4,5,6,1), (3,2,4,6,1,7), (5,6,1,2,4,5), (6,1,2,4,5,6), (4,5,6,1,2,4), (4,5,6,1,2,3), (2,4,6,1,2), (1,2,4,6,1), (6,1,2,4,6), (4,6,1,2,3), (4,6,1,2,4), (3,2,3), (2,3,2)

## (f)
[1,2,3,2,4,5,6,1,7]

This path achieve Node Coverage but not Edge coverage since edge (4,6) is not covered

## (g)
[1,2,3,2,4,5,6,1,7]
[1,2,4,6,1,7]

These paths satisfy Edge coverage but not Prime Path coverage