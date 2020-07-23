a.

There are 4 states:
* (1) : (Wake, Low)
* (2) : (Wake, High)
* (3) : (Sleep, Low)
* (4) : (Sleep, High)

b.

There are 12 edges (3 total methods each of which applies in 4 states). The initial states is (1)

* advance(): (1) --> (3)
* advance(): (2) --> (4)
* advance(): (3) --> (1)
* advance(): (4) --> (2)
* up() : (1) --> (2)
* up() : (2) --> (2)
* up() : (3) --> (4)
* up() : (4) --> (4)
* down() : (1) --> (1)
* down() : (2) --> (1)
* down() : (3) --> (3)
* down() : (4) --> (3)

c.

* Initially in state (1)
* down() - edge 9 to state (1)
* advance() - edge 1 to state (3)
* down() - edge 11 to state (3)
* up() -  edge 7 to state (4)
* up() - edge 8 to state (4)
* advance() - edge 4 to state (2)
* up() - edge 6 to state (2)
* down()- edge 10 to state (1)
* up() - edge 5 to state (2)
* advance() - edge 2 to state (4)
* down() - edge 12 to state (3)
* advance() - edge 3 to state (1)