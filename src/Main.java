public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Author mayakovsky = new Author("Владимир", "Маяковский");
        Book karamazov = new Book("Братья Карамазовы", 1879, dostoevsky.name + "" +dostoevsky.surname);
        Book idiot = new Book("Идиот", 1867, dostoevsky.name + "" +dostoevsky.surname);
        System.out.println("karamazov.author = " + karamazov.author);
        karamazov.setAge(1881);
    }
}