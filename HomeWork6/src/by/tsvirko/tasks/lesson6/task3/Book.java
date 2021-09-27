package by.tsvirko.tasks.lesson6.task3;

import java.util.Objects;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    static void printBooks(Printable[] printable) {
        System.out.println(printable);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Это книга " + getName());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
