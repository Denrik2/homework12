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
        if (this == other) {
            return true;
        } else if (this == null || this.getClass() != other.getClass()) {
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}