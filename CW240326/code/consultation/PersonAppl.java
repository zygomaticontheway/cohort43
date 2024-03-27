package consultation;
import consultation.model.Person;

public class PersonAppl {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person person1 = new Person("Alex", 35);

        System.out.println(Person.count);
        Person person2 = new Person("Sam", 25);

        System.out.println(Person.count);
        System.out.println(Person.count);


        person1.sayHi();
        person2.sayHi();
        person1.goToSleep();
        person2.goToSleep();

        System.out.println(person1.count);
        System.out.println(Person.count);

    }

}
