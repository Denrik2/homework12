public class Book {
    String name;
    Author author;
    int age;

    public Book(String name, int age, Author surname) {
        this.name = name;
        this.age = age;
        this.author = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

