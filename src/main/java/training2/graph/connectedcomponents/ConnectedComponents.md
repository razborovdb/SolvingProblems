## Description
Count the connected components in an undirected graph (i.e. all the edges are two-way).

The graph will be described by an adjacency list of node index numbers.

Think of connected components as the number of islands in the graph.

An empty graph has zero connected components.

Algorithm: for each node, if it's not been visited, perform a traversal from that node. The number of traversals you make is the number of connected components.
