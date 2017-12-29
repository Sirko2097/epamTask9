package Task5.people;

import java.util.ArrayList;

public class MainPeople {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Exc", 20, SEX.MALE));
        people.add(new Person("Mag", 22, SEX.FEMALE));
        people.add(new Person("Trinity", 27, SEX.FEMALE));
        people.add(new Person("Mirage", 18, SEX.FEMALE));
        people.add(new Person("Mesa", 23, SEX.FEMALE));
        people.add(new Person("Tyrion", 35, SEX.MALE));
        people.add(new Person("Frank", 28, SEX.MALE));

        System.out.println("\"We are in the army now\": ");
        people.stream().filter((p)->p.getAge() >= 21 && p.getSex() == SEX.MALE).forEach(System.out::println);

        System.out.println("Middle age of women: ");
        System.out.println(people.stream().filter((p)-> p.getSex() == SEX.FEMALE).mapToDouble(Person::getAge).average());
    }

}
