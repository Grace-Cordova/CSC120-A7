/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{
    private ArrayList<String> residents;
    private boolean hasDiningRoom;

    /**
   * Constructor for the house. Takes in the name, address, and nFloors from parent class. Initializes an array list of resident names.
   * @param   name String
   * @param   address String
   * @param   nFloors an int with the number of floors
   * @param   hasDiningRoom boolean
   * @param   hasElevator boolean
   * @return  an instance of a house
   */
    public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
        super (name, address, nFloors);
        System.out.println("You have built a house: 🏠");
        this.residents = new ArrayList<>();
        this.hasDiningRoom = hasDiningRoom;
        this.hasElevator = hasElevator;
    }

    /**
   * Accessor for the private boolean hasDiningRoom
   * @param   none
   * @return  an instance of hasDiningRoom
   */
    public boolean hasDiningRoom(){
        return this.hasDiningRoom;
     }

    /**
   * Accessor for nResidents, the number of residents
   * @param   none
   * @return  an instance of the number of residents
   */
    public int nResidents(){
        return this.residents.size();
    }

    /**
   * Method for a student to moveIn. Adds a student to the array list, residents. 
   * @param   none
   * @return  none
   */
    public void moveIn(){
        residents.add(this.name);
    }

    /**
   * overloaded method for multiple students to moveIn. Takes a string list of names and iterates over each one calling moveIn() for each. 
   * @param   none
   * @return  none
   */
    public void moveIn(String[] names){
            for (String name: names){
                moveIn(name);
            }
    }

    /**
   * Method for a student to moveOut. Removes a student from the array list, residents. 
   * @param   none
   * @return  none
   */
    public void moveOut(){
        residents.remove(this.name);
    }

    /**
   * overloaded method for multiple students to moveOut. Takes a string list of names and iterates over each one calling moveOut() for each. 
   * @param   none
   * @return  none
   */
    public void moveOut(String[] names){
            for (String name: names){
                moveOut(name);
            }
    }

    /**
   * Method isResident checks to see if the student exists in the array list 
   * @param   name String
   * @return  boolean
   */
    public boolean isResident(String name){
        return this.residents.contains(name);
    }

    /**
   * Method that shows options of what a person can do in a house. Not overridden becuase it will contain all of the same things as the showOptions method in the building class. 
   * @param   none
   * @return  none
   */
    public void showOptions(){
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
    }   

    /**
   * Method for a person to go to a floor. Throws an exception if the person is not in the building. If the building has an elevator you can go through multiple floors at once.
   * @param   floorNum int that represents which floor of the house the person is on
   * @return  none
   */
    public void goToFloor(int floorNum){
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum < 1 || floorNum > this.nFloors) {
            throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }
        if (hasElevator()){
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
        }
        while (activeFloor < floorNum){
            System.out.println ("You are now on floor #"+activeFloor+"of"+this.name);
            activeFloor += 1;
        }
    }

}

