public class Author {
    String name;
    String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return ". Имя автора " + this.name + ". Фамилия автора " + this.surname;
    }

    public boolean equals(Author other) {
        if (this.getName().equals(other.getName()) && this.getSurname().equals(other.getName())) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}