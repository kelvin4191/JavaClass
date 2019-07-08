package org.dimigo.inheritance;

public class Student extends Person{
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(getName() + "이/가 공부를 합니다.");
    }

    public void eatSnack() {
        System.out.println(getName() + "이/가 과자를 먹습니다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString();
    }
}
