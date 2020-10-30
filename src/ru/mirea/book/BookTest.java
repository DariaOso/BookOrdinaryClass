package ru.mirea.book;

public class BookTest {
    public static void main(String[] args){
        Book one= new Book();
        one.setPages(350);
        one.setTitle("The picture of Dorian Gray");
        one.setAuthor("Oscar Wilde");
        System.out.print("Название и автор книги: "+one.getTitle()+" " +one.getAuthor()+" Число страниц: "+one.getPages());
    }
}
