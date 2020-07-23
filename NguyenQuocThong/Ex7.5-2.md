Ex7.5-2

For the following questions a–c, consider the FSM that models a (simplified) programmablethermostat.
Suppose  the  variables  that  define  the  state  and  the  methods  that  transitionbetween states are:
partOfDay : {Wake, Sleep}
temp      : {Low, High}
// Initially "Wake" at "Low" temperature
//Effects: Advance to next part of day
public void advance();
// Effects: Make current temp higher, if possible
public void up();
// Effects: Make current temp lower, if possible
public void down();

a)  How many states are there?

b)  Draw and label the states (with variable values) and transitions (with method names).Notice that all of the methods are total.

c)  A test case is simply a sequence of method calls.  Provide a test set that satisfies EdgeCoverage on your graph



a)
- 4 states:
1) : Wake, Low
2) : Wake, High
3) : Sleep, Low
4) : Sleep, High

b)
- There are 12 edges
1, advance(): (1) --> (3)
2, advance(): (2) --> (4)
3, advance(): (3) --> (1)
4, advance(): (4) --> (2)
5, up(): (1) --> (2)
6, up(): (2) --> (2)
7, up(): (3) --> (4)
8, up(): (4) --> (4)
9, down(): (1) --> (1)
10, down(): (2) --> (1)
11, down(): (3) --> (3)
12, down(): (4) --> (3)




