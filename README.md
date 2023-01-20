# Binary-23-Tree

# What is a 2-3 Tree?
A 2-3 Tree is a form of a B-tree, which is a self-balancing tree data structure that stores sorted data. Each node can store up to 2 values, and can have up to 3 children. 

# What is this project?
This project can be described as the binary implementation of a 2-3 tree. At its core it is just a simple binary tree, with nodes that have 1 value and 2 children. However, it has a set of methods that organize this binary tree as a 2-3 tree, potentially making it a new data structure. 

# Why does it matter?
Binary trees can be a very unfriendly to data scientists because of how disorganized and inefficient they can be. That is why the self-balancing 2-3 tree data structure is far preferred when dealing with big data sets. But lets say that for whatever reason, you could not modify the nodes to support this, or had other restrictions where the data itself could not be modified. This project's set of methods can be used on any binary tree without modifying the nodes or data at all, simply by rearranging and organizing the nodes to form a perpetually-balanced tree. 

# How it works
The core of this project, and the method that allows this binary tree to be read as a two-three tree, is the isGroup method. It took me pages of drawings, and several iterations to come up with the final method. 

Here is a visualization of the isGroup method:
In this binary 2-3 tree below, the only groups are (10,50) and (100,200) The isGroup method would look at the total groups to the left and the right of 2 nodes respectively to determine the two nodes are in fact a group. But crucially- it ignores groups on the inside. Here is what I mean. 

EXAMPLE 1:
(10,50): 
On the left of (10,50), we will count: (5), (1), (0), (7), and (8). This is a total of FIVE. We will ignore 2 and 6 because they are on the "inside." 
On the right of (10,50), we will count: (100,200), (75), (70), (250), (300). This is a total of FIVE. We will ignore 80, 150, 120, 160, and 225 because they are on the "inside." 
Since of course 5=5, the program returns true, so 10 and 50 are a group. Note that it recursively calls isGroup, which is how it figures out that 200 and 100 are a group.

EXAMPLE 2: 
(100, 200):
On the left of (100,200), we will count: (75), (70), and (80). This is a total of THREE. Nothing is on the inside since we are not deep enough yet.
On the right of (100,200), we will count: (225), (250), and (300). This is a total of THREE. Nothing is on the inside since we are not deep enough yet.
Since of course 3=3, the program returns true, so 100 and 200 are a group.

![image](https://user-images.githubusercontent.com/30671624/188293013-864cbcf2-463a-4120-8fa1-cc4e9eef5909.png)

# Future Improvements
While this project does an excellent job at organizing data into self-balancing trees, there could still be more done to allow it to be as efficient as a normal 2-3 tree. Some of these ideas were recommended by David Taylor, my professor at San Jose State University.

One idea is for the nodes to have a flag to keep track of weather they are a left node or a right node in a pair. This flag would be similar to a "color." This approach would make this implementation similar to red-black trees, another well knows data structure. 

Another idea would be for each node to keep a variable that keeps track of their "height," which would make it easier for 2 vertices to see if they are in the same node. 

Now that I understand the idea, I see how some slight modifications to make this run efficiently too, in multiple ways.  For one, nodes could either have a flag to tell if they are the left node of a pair.  That flag could also be considered to be a "color".  This approach makes these 23 trees look similar to red-black trees.  Red black trees are very similar to 234 trees, this would be a variant that is similar to the 23 tree.  Another option would be that each node could keep a variable that tells their "height" (by group, not by binary node).  Then it is easy to see if two vertices are in the same virtual node.
