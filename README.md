# Algorithms
Problem: Find if given binary tree T has a path from root node to any leaf node 
         where sum of all the nodes in the path is equal to the given sum s.
Output : Return boolean value. Value 'true' if there is a path else a 'false'.

Solution:
  Assumptions : Binary tree need not be balanced
                Node value is an integer.
  

  Logic used: 1. Employ DFS(pre order traversal) to traverse all possible routes 
              from root to a leaf node of T.
              2. Check if the sum of all nodes in the path is equal to s.
              3. If yes return true or return false and continue with next path.
  
  Time Complexity: O(n) where n is the number of node in T.
 
         
              
