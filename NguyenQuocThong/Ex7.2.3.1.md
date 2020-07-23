Ex7.2.3.1
Below are four graphs, each of which is defined by the sets of nodes, initial nodes, final nodes,edges, and defs and uses.
Each graph also contains some test paths.
Answer the followingquestions about each graph
a) Draw the graph.
b) List all of the du-paths with respect to x.(Note: Include all dupaths, even those that are subpaths of some other du-path).
c) Determine which du-paths each test path tours.
Write them in a table with test paths in the first column and the du-paths they cover in the second column.
For this part of the exercise, you should consider both direct touring and sidetrips.
d) List a minimal test set that satisfies all defs coverage with respect to x. (Direct tours only.) If possible, use the given test paths. If not, provide additional test paths to satisfy the criterion.
e) List a minimal test set that satisfies all uses coverage with respect to x. (Direct tours only.) If possible, use the given test paths. If not, provide additional test paths to satisfy the criterion.
f) List a minimal test set that satisfies all du-paths coverage with respect to x. (Direct tours only.) If possible, use the given test paths. If not, provide additional test paths to satisfy the criterion.

a)Graph 1:(upload in github repo)
  Graph 2:(upload in github repo)
  Graph 3:(upload in github repo)
  Graph 4:(upload in github repo)

b)x has 5 du-paths: i	:[1, 2, 8]
	   	    ii	:[1, 2, 3, 5, 6]
		    iii	:[4, 3, 5, 6]
   	 	    iv	:[4, 3, 5, 7, 2, 8]
		    v   :[4, 3, 5, 6, 7, 2, 8]

c) each test path tours each du-path with or without a sidetrip.
	direct 	w/ sidetrip
t1	   i
t2	   	      i
t3  	  ii	      i
t4 	  iv
t5	 iii,v 
t6         	   iii,iv,v

e)Possible answer:{t1, t3, t5}

f)Possible answer:{t1, t3, t4, t5}




