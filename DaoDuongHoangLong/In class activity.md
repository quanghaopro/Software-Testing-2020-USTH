##Question 1
• Reachability
 The fault is reached
• Infection
 Execution of the fault leads to an incorrect program state (error)
• Propagation
 The infected state must cause the program output or final state to
be incorrect (failure)
• Revealability
 The tester must observe part of the incorrect portion of the
program state

Test -Reaches-> Faulty location -Infects-> Incorrect program states -Propagates-> Incorrect and observed portion of Final state -Reveals -> Obsevers-Observed portion of the program state

##Question 2
Test Requirement: A test requirement is a specific element of a software artifact that a test case must satisfy or cover
we must have Test Requirement first to sepecify test criteria

##Question 3: MDTD
• Breaks testing into a series of small tasks that simplify test
generation
• 'Isolate' each task
• Work at a higher level of abstraction
 Use mathematical engineering structures to design test values
independently of the details of software or design artifacts, test
automation, and test execution
• Key intellectual step: test case design
• Test case design can be the primary factor determining whether
tests successfully find failures in software

##Question 4
Test Case Values(prefix values, postfix values, and expected results) 

##Question 5
Software Controllability: How easy it is to provide a program with the needed inputs, in terms of values, operations, and behaviors

##Question 6
Repeatedly cutting and pasting the same test method and subsequently editing the inputs and expected outputs
results in completely unmaintainable test code