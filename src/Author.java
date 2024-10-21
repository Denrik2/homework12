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

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }else {
            return true;
        }
    }

    public int hashCode() {
        return java.util.Objects.hash(surname);
    }
}