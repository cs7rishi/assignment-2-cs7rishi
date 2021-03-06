/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem4.binaryST.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        MyBinarySearchTree bst = new MyBinarySearchTree(myQueue);
        bst.insert(10);
        bst.insert(20);
        bst.insert(3);
        bst.insert(30);
        bst.insert(15);
        bst.preOrder(bst.getRoot());
        System.out.println("PreOrder successors of all the nodes");
        myQueue.show();

    }


}
