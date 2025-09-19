public class Pet {

    //attribute fields:
    private String species;

    //constructor method:
    public Pet(String species) {
        this.species = species;
    }    

    //behavior
    public void getSpecies(){
        System.out.println("This pet is a: " + species);
    }

}