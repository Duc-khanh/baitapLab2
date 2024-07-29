public class Dog extends Animal {
@Override
    public void walk() {
        System.out.println("walk on four legs");
    }
    public void makeSound() {
        System.out.println("Bark");
    }
    public void eat(String food) {
        System.out.println("Dog eats    " + food);
    }
}
