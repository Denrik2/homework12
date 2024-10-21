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
        if (this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.getAuthor().equals(other.getAuthor())) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age, author);
    }
}

