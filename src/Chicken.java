 public class Chicken extends Animal implements Edible {
     @Override
     public void walk() {

     }

     @Override
    public void makeSound() {
        System.out.println("Chicken: cluck-cluck");
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}
