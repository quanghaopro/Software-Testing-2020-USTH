a.

As we can see, the code show that (2) is final and (6) may be final, nodes (1), (3), (4), (5) are not final.
Graph:
(1) --> (2)
(1) --> (3)
(2) --> (3)
(3) --> (4)
(3) --> (5)
(4) --> (6)
(5) --> (6)

b.

The path :

t1 : [ f1, f3, f5, f6 ]
t2 : [ f1, f3, f4, f6 ]
t3 : [ f1, f2 ]
t4 : [ f1, f3, f4, f6]
t5 : [ f1, f2, f3, f4, f6]

c.

We have 3 minimal test set that achieves Node Coverage :

+ { t1, t2, t3 }
+ { t1, t3, t4 }
+ { t1, t5 }

d.

We have only one minimal test set that achieves Edge Coverage : { t1, t5 }

e.

We have 4 prime paths : { [f1, f2, f3, f4, f6], [f1, f2, f3, f5, f6], [f1, f3, f4, f6], [f1, f3, f5, f6] }
Prime path is not covered : [f1, f2, f3, f5, f6]