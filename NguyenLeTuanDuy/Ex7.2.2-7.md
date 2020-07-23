### Nguyen Le Tuan Duy - BI9-082

# Homework 7 - Section 7.2.2
## Exercise 7

 a)

p5 is not a test path because there is no way to reach 2 from 3 directly

 b)

|Test Paths|	Test Requirements that are toured by test paths directly|
|---|---|
|[1,3,1,2,3]|	[1,3,1], [1,2,3], [3,1,2]|
|[1,2,1,2,3]|	[1,2,3], [1,2,1], [2,1,2]|
|[1,2,3,1,2,3]|	[1,2,3], [2,3,1], [3,1,2]|
|[1,2,1,3]|	[1,2,1], [2,1,3]|
|[1,2,3,1,3]|	[1,2,3], [2,3,1], [3,1,3]|

 c)

From b), p1, p4 don't satisfy

 d)

No

With a sidetrip: [3, 1, 2, 1, 3]