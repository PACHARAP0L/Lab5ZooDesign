import java.util.ArrayList;
import Lib.*;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Dolphin("Dingdong"));
        zoo.add(new Lion("Simba"));
        zoo.add(new Penguin("Duke"));
        zoo.add(new Penguin("Luna"));
        zoo.add(new Eagle("Mumu"));
        

        for (Animal animal : zoo) {
           System.out.println(animal.getName()); 
           System.out.println(animal.makeSound());
        }

        for (Animal animal : zoo) {
            if(animal instanceof Flyable){
                System.out.println((animal.getName()) + " can fly" + ((Flyable)animal).fly());
            }else if(animal instanceof Swimable){
                System.out.println((animal.getName()) + " can swim " + ((Swimable)animal).swim());
            }else
                System.out.println((animal.getName()) + " can walk");
        }

    }
}
