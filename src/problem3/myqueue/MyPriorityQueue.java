/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {
    Node head;
    public void enqueue(Student student){
        Node node=new Node();
        node.setStudent(student);
        //node.setNext(null);
        node.setPriority(student.rollNo);
        if(head==null){
            head=node;
        }
        else {
            Node iterator=head;
            if(head.getPriority()>node.getPriority()){
                Node temp=head;
                head=node;
                head.setNext(temp);
            }

            else {
                while (iterator.getPriority()<node.getPriority() ){
                    if (iterator.getNext()==null){
                        iterator.setNext(node);
                    }
                    else if(node.getPriority()<iterator.getNext().getPriority()){
                        node.setNext(iterator.getNext());
                        iterator.setNext(node);
                    }
                    else {
                        iterator=iterator.getNext();
                    }
                }
            }
        }
    }

    public Node dequeue(){
        Node temp=head;
        head=temp.getNext();
        return temp;
    }

    public Node peek(){
        return head;
    }

    public void displayAll(){
        Node temp=head;
        while (temp.getNext()!=null){
            Student s=temp.getStudent();
            System.out.println(s.name+"  "+s.rollNo);
            temp=temp.getNext();
        }
    }



}