6.2-5,

a, There are multiple testable units (1 constructor, 2 mutators, and 2 observers).
There is an abstract state variable queue that represents the queue of objects. 
There is also an abstract state variable cap that represents the capacity of the queue.
There is an abstract state variable representing the current number of objects in the queue.

b, Queue is empty or full, what the current size is, what cap is, and whether there are special values (such as null) in the queue. 
The only obvious syntactic characteristic for x is whether it is null. 
In the constructor, capacity can clearly have 'illegal' values.

c,
-Whether queue is empty
 a1:true (Value queue = [])
 a2:false (Value queue = ["cat", "hat"]) Base
-Whether queue is full
 b1:true (Value queue = ["cat"], cap = 1)  
 b2:false (Value queue = ["cat", "hat"], cap = 3) Base 
-Size of queue
 c1:0 (Value queue = []) 
 c2:1 (Value queue = ["cat"], ) 
 c3:more than 1 (Values queue = ["cat", "hat"]) Base 
-Value of cap
 d1:negative (Value cap = -1) 
 d2:0 (value cap = 0)  
 d3:1 (value cap = 1)
 d4:more than 1 (value cap = 2) Base
-Value of capacity 
 e1:negative (value cap = -1) 
 e2:0 (Value cap = 0) 
 e3:1 (Value cap = 1 ) 
 e4:more than 1 (Value cap = 2) Base 
-Whether x is null
 f1:true (value x = null) 
 f2:false (value x = "cat" ) Base 

d,I have already listed one value for each block in part c,

e, We should testing Enqueue for this part and it makes the parameter x relevant
The variable capacity in the constructor is not relevant to this set of test, so we will skip blocks e1, e2, e3 and e4
The base test is (a2,b2,c3,d4,f2), for each partition give more 8 tests:
(a1,b2,c3,d4,f2), (a2,b1,c3,d4,f2), (a2,b2,c1,d4,f2), 
(a2,b2,c2,d4,f2), (a2,b2,c3,d1,f2), (a2,b2,c3,d2,f2), 
(a2,b2,c3,d3,f2), (a2,b2,c3,d4,f1) 
(1)Consider (a2,b2,c3,d3,f2), where the focus is on varying d , the value of cap 
(2)The value for queue specified by c3 is incompatible with this choice, either a2 or b2 has to change, since, if cap is 1, the queue will always be either empty or full
(1),(2)=> A feasible variant of this test is (a2,b1,c2,d3,f2)



