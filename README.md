# DataStructure

WorkStoreImp is the only class with my own written code. The task was to implement a data structure and write code to make the other programs work. 
To get very efficient storage, research was required for techniques such as hash tables and ordered trees.
This implementation uses Binary Search Trees.

The code in WordGen.java generates random words. The "seed", sets up a particular series of words which is always given for any particular seed, so you can test the code several times knowing each time the same words will be generated. 

The program in WordTest0.java just generates and displays some words, so you can see the sort of data you are dealing with. The program in WordTest1.java enables you to generate some words (which are not displayed, so you can generate more of them than you could reasonably display on the screen) and then enter your own words to see how many times each of them was generated. 

The programs in WordTest2.java, WordTest3.java and WordTest4.java are designed to test the efficiency of the operations count, add and remove respectively. The code in these programs generates a collection of words, then generates a second set of words stored in an array and applies the operation on the collection with each word from the second set. It measures and displays the time taken to apply the operation repeatedly.
