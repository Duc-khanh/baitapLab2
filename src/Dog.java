public class Dog extends Animal {
    @Override
    public void go() {
        System.out.println("walk on two legs");
    }
   void makeSound() {
        System.out.println("Dog barks");
    }
    public void eat(String food) {
        System.out.println("Dog eats    " + food);
    }
}
