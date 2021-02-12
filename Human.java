
public class Human {

    public void hit(Animal animal) {
        System.out.println(animal.roar());
    }

    public static void main(String[] args) {
        Animal dog = new Dog(); // Q1
        Human human = new Human();
        Person person = new Person();

        System.out.println("The first calling hit(Animal)");
        human.hit(dog); // Q2

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog);// Q3_sample

        dog = new Fish();
        System.out.println("The third calling hit(Animal)");
        person.hit(dog);// Q3_ans

    }

}