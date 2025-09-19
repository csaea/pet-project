public class Pet {

    //attribute fields:
    private String species;

    //constructor method:
    public Pet(String species) {
        this.species = species; 
        //the first 'this.species' refers to the variable 'species' in THIS class: String species = < enter string here >
        //the second 'species' refers to the parameter, whose value was entered when creating the new object: Pet("cat").  
        //Ex: If we made an object like: Pet jeffrey = Pet("cat"), then in this class, the constructor would set the 'species' variable to 'cat', like: species = "cat" 
    }    

    //behavior
    public void getSpecies(){
        System.out.println("This pet is a: " + species);
    }
}
