package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();

        Book book2 = new Book("마닳","성기하",100);

        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getTitle());
        System.out.println(book.getAuther());
        System.out.println(book.getPage());

        book.setTitle("수학의 바이블");
        book.setAuther("김재영");
        book.setPage(100);

        System.out.println(book.getTitle());
        System.out.println(book.getAuther());
        System.out.println(book.getPage());

        System.out.println(book2.getTitle());
        System.out.println(book2.getAuther());
        System.out.println(book2.getPage());


    }
}
