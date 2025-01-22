package Concept1_ClassStructure;

public class Zoo {
    public static void main(String args[]){
        System.out.println("The main method has been called!");
        int i;
        for(i = 0; i < args.length; i++){
            //Added arguments in the modify run configurations
            System.out.println(args[i]);
        }
    }
}
