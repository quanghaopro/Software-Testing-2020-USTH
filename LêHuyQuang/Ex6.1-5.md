6.1-5,

- The problem is what to do with empty patterns - an easy case for interface-based input domain models.
- We should use the exception mechanism:@throws IllegalArgumentException if pattern is empty.
- For the implementation to match, it needs an explicit check for an empty pattern, along with an explicit throws clause: if (patternLen == 0) throw new IllegalArgumentException("PatternIndex.patternIndex").
- Finally a test case should be added to PatternIndexTest.java that calls patternIndex() with an empty pattern and looks for this exception.
