/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    public String name;
    public String course;
    public int rollNo;
    public int backlogs;

    public Student(String name, String course, int rollNo) {
        this.name = name;
        this.course = course;
        this.rollNo = rollNo;
    }
}