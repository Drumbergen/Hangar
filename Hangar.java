public class Hangar {

    //Create a Hangar class that will have a main() method.
    
    public static void main(String[] args){
         
       // Add references to instances of the Car and Boat classes in the main() method of Hangar.
        

       Car AndiClio = new Car ("Clio",10);
       Boat Titanic = new Boat ("Queen Elizabeth", 83);
       
       // For each of the references, display the result of calling the doStuff() method in the terminal.

       System.out.println(AndiClio.doStuff());
       System.out.println(Titanic.doStuff());
    }

}
