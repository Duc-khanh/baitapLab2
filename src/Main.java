
public class Main {

        public static void main(String[] args) {
            Animal[] animals = {new Chicken(), new Cat()};
            for (Animal animal : animals) {
                animal.makeSound();
                if (animal instanceof Edible) {
                    System.out.println(((Edible) animal).howToEat());
                }
                animal.walk();
            }
        }

}