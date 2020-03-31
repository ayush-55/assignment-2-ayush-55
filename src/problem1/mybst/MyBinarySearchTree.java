/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
import problem1.node.TreeNode;

import java.util.ArrayList;

//function to be implemented
//insert
//traverse
//traverseLeftChildren
//noOfNodeWithoutLeftChild
public class MyBinarySearchTree {
    public TreeNode root;
    private int max=1;
    private int count=0;

    public void insert(int data) {
        TreeNode bstNode = new TreeNode(data);
        if (root == null) {
            root = bstNode;
        } else {
            TreeNode iteration = root;
            TreeNode nodeWhereInsertionIsToBeDone = null;
            while (iteration != null) {
                nodeWhereInsertionIsToBeDone = iteration;
                if (bstNode.getData() <= iteration.getData()) {
                    iteration = iteration.getLeftChild();
                } else {
                    iteration = iteration.getRightChild();
                }
            }
            if (bstNode.getData() <= nodeWhereInsertionIsToBeDone.getData()) {
                nodeWhereInsertionIsToBeDone.setLeftChild(bstNode);
            } else {
                nodeWhereInsertionIsToBeDone.setRightChild(bstNode);
            }
        }
    }


    public void traverse (TreeNode start) {
        if(start==null){
            return;
        }
        traverse(start.getLeftChild());
        traverse(start.getRightChild());
        System.out.print(start.getData()+"   ");
    }


    public void traverseLeftChildren (TreeNode start) {
        leftNode(start,1);
        //assuming root node is not first left child

    }


    public void leftNode(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (max < level) {
            System.out.print(node.getData() + " ");

        }
        max = level;
        if (node.getLeftChild() == null) {
            count++;
            max++;
        }
        leftNode(node.getLeftChild(), level + 1);
        leftNode(node.getRightChild(), level + 1);
    }



    public void noOfNodesWithoutLeftChild (TreeNode treeNode) {
        //this if condition is for condition when this method is run before traverse left child method.
        if(count==0){
            leftNode(treeNode,1);
        }
        System.out.println(count);
    }

    public void preOrder(TreeNode start){
        if(start==null){
            return;
        }
        System.out.print(start.getData()+"   ");
        preOrder(start.getLeftChild());
        preOrder(start.getRightChild());
    }

    public void postOrder(TreeNode start){
        if(start==null){
            return;
        }
        postOrder(start.getLeftChild());
        postOrder(start.getRightChild());
        System.out.print(start.getData()+"   ");
    }

    public void getPreOrderSuccessor(TreeNode start,ArrayList<Integer> arrayList){
        if(start==null){
            return ;
        }
        arrayList.add(start.getData());
        getPreOrderSuccessor(start.getLeftChild(),arrayList);
        getPreOrderSuccessor(start.getRightChild(),arrayList);

    }
}