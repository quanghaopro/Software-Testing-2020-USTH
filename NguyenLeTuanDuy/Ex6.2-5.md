### Nguyen Le Tuan Duy - BI9-082

# Homework 6 - Section 6.2
## Exercise 2 

```
Use the following characteristics and blocks for the questions below.
```
|Characteristics|Block 1|Block 2|Block 3|Block 4|
|:-----:|:-----:|:-----:|:-----:|:--:|
|Value 1|< 0|0 |> 0 ||
|Value 2|< 0 |0 |> 0||
|Operation|+|-|x|/|
```
(a) Give tests to satisfy the Each Choice criterion.
(b) Give tests to satisfy the Base Choice criterion. Assume base
choices are Value 1 = > 0, Value 2 = > 0, and Operation = +.
(c) How many tests are needed to satisfy the All Combinations
criterion? (Do not list all the tests.)
(d) Give tests to satisfy the Pair-Wise Coverage criterion.
```

Answer:

a. Four tests:

| V1 | V2 | Operation |
| -- | -- | --------- |
| -2 | -2 |     +     |
|  0 |  0 |     -     |
|  2 |  2 |     x     |
|  2 |  2 |     /     |

b. Eight tests:

| V1 | V2 | Operation |
| -- | -- | --------- |
|  2 |  2 |     +     |
| -2 |  2 |     +     |
|  0 |  2 |     +     |
|  2 | -2 |     +     |
|  2 |  0 |     +     |
|  2 |  2 |     -     |
|  2 |  2 |     x     |
|  2 |  2 |     /     |

c. 3x3x4 = 36 tests

d. Since each test can accommodate 3 pairs, at least 11 tests are needed:

| V1 | V2 | Operation |
| -- | -- | --------- |
|  2 | -2 |     +     |
| -2 |  0 |     -     |
| -2 |  2 |     x     |
|  2 | -2 |     /     |
|  2 |  0 |     +     |
|  0 |  2 |     -     |
|  0 | -2 |     x     |
|  0 |  0 |     /     |
|  0 |  2 |     +     |
|  2 | -2 |     -     |
|  2 |  0 |     x     |


The best solution involves one extra test:
| V1 | V2 | Operation |
| -- | -- | --------- |
| -2 |  2 |     /     |