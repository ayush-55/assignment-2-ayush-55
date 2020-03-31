/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree =new MyBinarySearchTree();
        int[] insertData={13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 18};
        for (int a:
                insertData) {
            myBinarySearchTree.insert(a);
            //System.out.println(a);
        }
        System.out.println("Preorder Traversal :");
        myBinarySearchTree.preOrder(myBinarySearchTree.root);
        System.out.println("\nPostorder Traversal :");
        myBinarySearchTree.postOrder(myBinarySearchTree.root);

    }
}