/**
* Java 1. Homework 5
*
* @author Artem N
* version 29.01.2022
*/
class HomeWork5{
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Vasya", "hub", "a@bk.ru", "8-999-999-9999", 30000, 30);
        persArray[2] = new Person("Alexey", "Cardriver", "ter@yandex.ru", "8-919-065-4567", 20000, 50);
        persArray[3] = new Person("Gosha", "lentyai", "gosha@yandex.ru", "8-919-065-6567", 10000, 55);
        persArray[4] = new Person("Petr 1", "Imperor","Russia", "not number", 1000000, 350);
        for(int i = 0; i < 5; i++) {
            if(persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}


class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int cash;
    private int age;

    public Person(String name, String position, String email, String phone, int cash, int age ) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.cash = cash;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", " + position + ", " + email + ", " + phone + ", " + cash + ", " + age;
    }
}