package org.dimigo.oop;

public class Book {
    // 필드 선언
    private String title;
    private String auther;
    private int page;

    //기본생성자
    public Book() {
        System.out.println("기본 생성자 호출");
    }

    //생성자 추가

    public Book(String title, String auther, int page) {
        this.title = title;
        this.auther = auther;
        this.page = page;
    }

    public Book(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }

    public Book(String title) {
        this.title = title;
    }

    // 메소드 선언
    // getter method
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", auther='" + auther + '\'' +
                ", page=" + page +
                '}';
    }
}
