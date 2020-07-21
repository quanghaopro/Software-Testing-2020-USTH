For the search() method with partion: 

Block 1: 1st element
Block 2: Last element
Block 3: some position that doesn't belong to Block 1 and Block 2

a)
For disjointness property: Block 1 and Block 2 will overlap if there is only 1 element in the input list
b)
For completeness property: Block 3 only covers "some" position instead of all element other than first
and last element,so the union of all 3 blocks might not be the whole domain
c)
Block 1: 1st element
Block 2: If size > 1,last element
Block 3: If size > 2,every elements that is not 1st or last element 

