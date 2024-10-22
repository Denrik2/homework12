public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Author mayakovsky = new Author("Владимир", "Маяковский");
        Book karamazov = new Book("Братья Карамазовы", 1879, dostoevsky);
        Book idiot = new Book("Идиот", 1867, dostoevsky);
        karamazov.setAge(1881);
        System.out.println(karamazov.toString());
    }
}