6.1-5
Consider the problem of searching for a pattern string in a subject string. 
One possible imple-mentation with a specification is on the book website; PatternIndex.java.
This particularversion has an incomplete specification–and a decent interface-based input domain modelsingles
out the problematic input!
Assignment: find the the problematic input, complete thespecification, and revise the implementation to match the revised specification.

The problem is what to do with empty patterns - an easy case for interface-based input domainmodels,
since  the  empty  string  is  a  standard  special  case  for  string  type

The empty subjects are a different matter - the specification has a natural interpretation for empty 
subjects in that patterns are never found in empty subjects

