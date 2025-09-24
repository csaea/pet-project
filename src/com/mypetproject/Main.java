//tester class, where we will instantiate test objects and call methods
package src.com.mypetproject;

public class Main {

    //main method: the doorway to your java program, which the JVC needs to run your code.
    public static void main(String[] args) {

        Pet newAnimal = new Pet("cat");
        newAnimal.getSpecies();

        Cat newCat = new Cat(7, "orange", "cat");
        newCat.meow();

    }

}