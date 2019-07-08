package org.dimigo.inheritance;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getName() + "쌤이 공부를 가르침니다.");
    }

    public void oversee() {
        System.out.println(getName() + "쌤이 감독을 합니다.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                super.toString();
    }
}

