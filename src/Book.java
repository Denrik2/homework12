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

    public String toString() {
        return "Название книги " + this.name  + ". Год написания " + this.age + this.author.toString();
    }


    public boolean equals(Book other) {
        if (this == other) {
            return true;
        } else if (this == null || this.getClass() != other.getClass()) {
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age, author);
    }


}

