public class Cafe extends Building {

    private int nCoffeeOunces = 200;
    private int nSugarPackets = 50;
    private int nCreams = 50;
    private int nCups = 50;
    /**
   * Constructor for the cafe
   * @param   name String
   * @param   address String
   * @param   nFloors an int with the number of floors
   * @return  an instance of cafe
   */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.name = name;
        this.address = address;
        this.nFloors = nFloors;
    }
    /**
   * Overloaded constructor for the cafe. Works when no parameters are given.
   * @param   none
   * @return  a default instance of cafe
   */
    public Cafe(){
        this("My Awesome Cafe", "123 Cafe St", 1);
    }
    /**
   * Accessor for nCoffeeOunces
   * @param   none
   * @return  an instance of coffee ounces
   */
    public int getnCoffeeOunces(){
        return this.nCoffeeOunces;
    }
    /**
   * Accessor for nSugarPackets
   * @param   none
   * @return  an instance of sugar packets
   */
    public int getnSugarPackets(){
        return this.nSugarPackets;
    }
    /**
   * Accessor for nCreams
   * @param   none
   * @return  an instance of creams
   */
    public int getnCreams(){
        return this.nCreams;
    }
    /**
   * Accessor for nCups
   * @param   none
   * @return  an instance of cups
   */
    public int getnCups(){
        return this.nCups;
    }

    /**
   * A method for selling coffee. Takes in an order, removes the ingredients from the inventory, prints out a statement if the cafe is out of stock, and calls the restock method.
   * @param   size int number of oz for order
   * @param   nSugarPackets int number of sugar packets for order
   * @param   nCreams int number of creams for order
   * @return  none
   */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (size >= this.nCoffeeOunces){
            System.out.println("Unfortunately we are out of coffee. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }else if (nSugarPackets>=this.nSugarPackets){
            System.out.println("Unfortunately we are out of sugar. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }else if (nCreams>=this.nCreams){
            System.out.println("Unfortunately we are out of cream. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }}else if (nCups>=1){
            System.out.println("Unfortunately we are out of cups. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }
    /**
   * Overloaded method to sell a default cup of coffee if no parameters are given
   * @param   none
   * @return  none
   */
    public void sellCoffee(){
        sellCoffee(12,2,3);
    }

    /**
   * A method to restock the inventory. Resets all items to their original inventory level.
   * @param   nCoffeeOunces int number of oz in tinventory
   * @param   nSugarPackets int number of sugar packets in inventory
   * @param   nCreams int number of creams in inventory
   * @param   nCups int number of cups in inventory
   * @return  none
   */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces = 200;
        nSugarPackets = 50;
        nCreams = 50;
        nCups = 50;
    }


     /**
   * A method to allow movement between floors. This method has been overridden because cafes do not have multipls floors for customers to pass between.
   * @param   none
   * @return  none
   */
    public void goToFloor(){
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        System.out.println("This is a cafe! Only the first floor is open to the public.");
    }
     /**
   * A method to show available options at the cafe. This method has been overridden because cafes do not have multipls floors for customers to pass between.
   * @param   none
   * @return  none
   */
    public void showOptions(){
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n");
    }
}
