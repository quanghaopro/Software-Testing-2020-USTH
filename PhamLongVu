Ex1-1.
- Good, technical people in testing.
- Amicable relationships between testers and developers.
- Management leadership
Ex1-3
"Level 3 thinking is that the purpose of testing is to reduce risk" is the process of reduce faults to reduce the bad effects of them in the future.

Risk here can be:

The resources using to debugging.
The reduce of benefits obtained from the program.
The risk can never be reduce to zero since there is impossible to test all the test cases.
Ex1-4.
a.

public static Vector union(Vector v1, Vector v2)
{
    Vector v3 = new Vector();
    v3.addAll(v1);
    v3.addAll(v2);
    return v3;
}
b. The program will return error if v1 or v2 is NULLL.

c. Test cases:

Test[1]:

Vector v1 = new Vector();
Vector v2 = new Vector();
Test[2]:

Vector v1 = new Vector();
v1.add(1);
Vector v2 = new Vector();
Test[3]:

Vector v1 = new Vector();
Vector v2 = new Vector();
v2.add(1);
d.

public static Vector union(Vector v1, Vector v2)
{
	if (v1.isEmpty() || v2.isEmpty()) {
		return NULL;
	} else {
   		Vector v3 = new Vector();
    	v3.addAll(v1);
    	v3.addAll(v2);
    	return v3;
	}
}
Ex1-5
The program will never reach the first element of the array. Fix:

 for (int i = x.length-1; x >= 0; x--)
The program will return the first index of zero. Fix:

 for (int i = x.length-1; x >= 0; x--)
The program will count 0 as positive. Fix:

 if (x[i] > 0)
The program will not count the odd negative numbers. Fix:

 if (x[i] % 2 == -1 || x[i] > 0)
b. In the four given program, there is no way to not execute the fault since the fault is in the code that will always be executed with any test case.

c.

x = [1, 1, 5]; y = 5;
x = [0];
x = [2, 2, 2];
x = [-2, -4, 2, 4];
d.

x = [2, 3, 1]; y = 5;
x = [0, 1, 1];
Cannot since the error here always lead to the failure.
Cannot since the error here always lead to the failure.
e.

x = [2, 3, 5]; y = 2; i = 0; PC = "return -1"
x = [0, 1, 0]; i = 0; PC = "i < x.length"
x = [-4, 2, 0, 2]; i = 2; count = 2; PC = "i++"
x = [-3, -2, 0, 1, 4]; i = 0; count = 0; PC = "i++"
