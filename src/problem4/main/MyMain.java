/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.ArrayList;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree=new MyBinarySearchTree();
        int[] insertData={13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 18};
        System.out.println("Insertion in BST started : ");
        for (int a:
                insertData) {
            myBinarySearchTree.insert(a);
            System.out.print("Inserted : "+a+"  ");
        }
        MyQueue myQueue=new MyQueue();
        ArrayList<Integer> temp=new ArrayList<>();
        myBinarySearchTree.getPreOrderSuccessor(myBinarySearchTree.root,temp);
        System.out.println("\nInsertion of PreOrderSuccessor started in queue data structure : ");
        for (int b:
                temp) {
            System.out.print("Inserted : "+b+" ");
            myQueue.enQueue(b);
        }
        System.out.println("\n");
        myQueue.viewAll(insertData);

    }
}