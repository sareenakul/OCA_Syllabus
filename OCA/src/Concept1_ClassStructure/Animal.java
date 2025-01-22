package Concept1_ClassStructure;

public class Animal {
    String name;
    String species;

    //Getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("This is an Concept1_ClassStructure.Animal");
    }
}
