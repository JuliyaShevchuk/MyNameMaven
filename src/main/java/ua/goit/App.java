package ua.goit;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Juliya", "Shevchuk");
        Converter converter = new Converter();
        System.out.println(converter.toJson(person));
    }
}
