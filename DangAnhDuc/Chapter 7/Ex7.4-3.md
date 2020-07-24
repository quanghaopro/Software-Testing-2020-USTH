# Exercise 3 - Section 4 - Chapter 7

```java
public static void f1 (int x, int y)
{
if (x < y) { f2 (y); } else { f3 (y); };
}
public static void f2 (int a)
{
if (a % 2 == 0) { f3 (2*a); };
}
public static void f3 (int b)
{
if (b > 0) { f4(); } else { f5(); };
}
public static void f4() {... f6()....}
public static void f5() {... f6()....}
public static void f6() {...}
```
Use the following test inputs:  
- t1 = f1 (0, 0)
- t2 = f1 (1, 1)
- t3 = f1 (0, 1)
- t4 = f1 (3, 2)
- t5 = f1 (3, 4)  


## (a) 
![image](./Ex7.4-3.png)


- Since this is a call graph, everynode is a potential initial node

## (b)
Path of each test inputs:
- t1: [f1, f3, f5, f6]
- t2: [f1, f3, f4, f6]
- t3: [f1, f2]
- t4: [f1, f3, f4, f6]
- t5: [f1, f2, f3, f4, f6]


## (c)
- {t1, t5} would be enough to satisfy Node Coverage

## (d)
- {t1, t5} would also be enough to satisfy Edge Coverage

### (e) 
Prime paths in the graph:
- [f1, f2, f3, f4, f6]  
- [f1, f2, f3, f5, f6]  
- [f1, f3, f4, f6]  
- [f1, f3, f5, f6]  

Prime path that is not covered by the test paths above:
- [f1, f2, f3, f5, f6]  