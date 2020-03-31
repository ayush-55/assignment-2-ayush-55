/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue
import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private int size;

    public MyCircularQueue() {
        rear = null;
        size = 0;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            node.setNext(node);
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    private boolean isEmpty() {
        boolean response = false;
        if (rear == null)
            response = true;
        return response;
    }

    public Node getRear() {
        return rear;
    }

    public int getSize() {
        return size;
    }

    public boolean dequeue() {
        boolean response = false;
        if (!isEmpty()) {
            size--;
            response = true;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(rear.getNext().getNext());
            }
        }
        return response;
    }

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }

    public void viewAll(){
        Node t=rear;
        while (t.getNext()!=rear){
            System.out.print(t.getData().name+", ");
            t=t.getNext();
        }
        System.out.print(t.getData().name);
    }
}