Ex 7.2.3-1

### Graph 1

a. Draw the graph.

http: // www. cs. gmu. edu/ ~ offutt/ softwaretest/

b. List all of the du-paths with respect to x.

x has 5 du-paths:

i. [1,2,8]

ii. [1,2,3,5,6]

iii. [4,3,5,6]

iv. [4,3,5,7,2,8]

v. [4,3,5,6,7,2,8]

c. Determine which du-paths each test path tours. Write them in a table with test paths in the first column and the du-paths they cover in the second column. For this part of the exercise, you should consider both direct touring and sidetrips.

|      | direct | with sidetrips |
| ---- | ------ | -------------- |
| t1   | i      |                |
| t2   |        | i              |
| t3   | ii     | i              |
| t4   | iv     |                |
| t5   | iii, v |                |
| t6   |        | iii, iv, v     |

d. List a minimal test set that satisfies all defs coverage with respect to x. (Direct tours only.) Use the given test paths.

{t1, t4} or {t1, t5} or {t3, t4} or {t3, t5}

e. List a minimal test set that satisfies all uses coverage with respect to x. (Direct tours only.) Use the given test paths.

{t1, t3, t5}

f. List a minimal test set that satisfies all-du-paths coverage with respect to x. (Direct tours only.) Use the given test paths.

{t1, t3, t4, t5}




### Graph 3

a. Draw the graph.

http: // www. cs. gmu. edu/ ~ offutt/ softwaretest/

b. List all of the du-paths with respect to x.

x has 6 du-paths:

i. [1,2,3]

ii. [1,2,3,5]

iii. [1,2,6]

iv. [4,5]

v. [4,5,2,3]

vi. [4,5,2,6]

c. Determine which du-paths each test path tours. Write them in a table with test paths in the first column and the du-paths they cover in the second column. For this part of the exercise, you should consider both direct touring and sidetrips.

|      | direct    | with sidetrips |
| ---- | --------- | -------------- |
| t1   | i, ii     | iii            |
| t2   | i, iv, vi |                |

d. List a minimal test set that satisfies all defs coverage with respect to x. (Direct tours only.) Use the given test paths.

{t2}

e. List a minimal test set that satisfies all uses coverage with respect to x. (Direct tours only.) Use the given test paths.

For all-uses, all six du-paths must be toured.

f. List a minimal test set that satisfies all-du-paths coverage with respect to x. (Direct tours only.) Use the given test paths.

All-du-paths coverage is the same as all-uses coverage. The reason is that there is only one du-path for each du-pair.