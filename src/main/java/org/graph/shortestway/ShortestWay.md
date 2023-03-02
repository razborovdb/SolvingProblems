## Description
You'll get adj_list, an adjacency list of neighboring cities, and a start and end city number.

You'll return an array of cities you pass through along the shortest route.

If there is a fork that leads to two equal-length shortest routes, choose the fork whose number comes first in the adjacency list.

When adding the path so far to your queue, be sure to make a copy of the current path before adding a neighbor onto it. 
Most languages have some built-in way of copying arrays into new ones, sometimes while appending values.