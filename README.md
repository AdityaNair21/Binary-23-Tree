# Binary-23-Tree




# How it works
The methods you are interested in are isGroup, and sizeDirectionalRecurse (which is called by isGroup). 
There is another method called isGroupShift which is used for edge cases in the insert method, so you can ignore this method for the purposes of understanding how my grouping works. 

Here is a visualization of my isGroup, with my best explanation:
In this binary 2-3 tree below, the only groups, unless I missed any, are (10,50) and (100,200) My isGroup method would look at the total groups to the left and the right of 2 nodes respectively to determine the two nodes are in fact a group. But crucially- it ignores groups on the inside. Here is what I mean. 

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

image.png
