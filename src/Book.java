public class Book {
    String name;
    String author;
    int age;

    public Book(String name, int age, String author) {
        this.name = name;
        this.age = age;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

