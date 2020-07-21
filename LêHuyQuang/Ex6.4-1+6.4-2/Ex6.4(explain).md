6.4,

Explain :
- Iterator interface consists of three methods hasNext(), next() and remove() with different return types and return values for each of these methods
- We know that the "ConcurrentModificationExceptionis thrown by" methods that have detected concurrent modification of an object when such modification is not permissible. Thus in case of iterator this exception is thrown when the object that is "ArrayList" for which iterator is defined is modified in the duration of use of iterator.
- For Iterator checks for the modification, its implementation is present in "AbstractList class"(super class of ArrayList)where an int variable "modCount" is defined that provides the number of times "ArrayList" size has been changed. This value is used in every "next() call" to check for any modifications in a function "checkForComodification()".
- I wanted to modify the ArrayList and yet avoid the "ConcurrentModificationException" so I try to modify the list in a way that does not change the size of the list .
- The list had been modified during  the "iterator" use but this modification was not in terms of change in size of list,  the "remove()" call failed  to throw  the "ConcurrentModificationException". 
