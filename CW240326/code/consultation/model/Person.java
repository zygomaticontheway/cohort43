package consultation.model;
public class Person {
    private String name; //если модификатор private, то обратиться к нему можно только через геттер
    private int age;
    public static int count = 0; // static - обращаться к переменной можно как
    public static final double PI = 3.14; //final - значение меняться не может больше никогда

    public Person(String name, int age) {
        Person.count +=1;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHi(){
        System.out.println("Hi, my name is " + name);
    }
    public void goToSleep(){
        System.out.println("Sorry, I gotta sleep (" + name + ")");
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }


}
