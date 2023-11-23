public class Cafe extends Building {

    private int nCoffeeOunces = 200;
    private int nSugarPackets = 50;
    private int nCreams = 50;
    private int nCups = 50;
    // Constructor for Cafe, takes in name, address, and nFloors from parent class. Initializes nCoffeeOunces, nSugarPackets, nCreams, and nCups
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.name = name;
        this.address = address;
        this.nFloors = nFloors;
    }
    // sellCoffee method takes in a size, number of sugar packets and number of creams, and subtracts them from the inventory. Throws an exception if one of the items is sold out. Calls restock.
    public int getnCoffeeOunces(){
        return this.nCoffeeOunces;
    }
    public int getnSugarPackets(){
        return this.nSugarPackets;
    }
    public int getnCreams(){
        return this.nCreams;
    }
    public int getnCups(){
        return this.nCups;
    }




    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (size >= this.nCoffeeOunces){
            throw new RuntimeException("Unfortunately we are out of coffee. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }else if (nSugarPackets>=this.nSugarPackets){
            throw new RuntimeException("Unfortunately we are out of sugar. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }else if (nCreams>=this.nCreams){
            throw new RuntimeException("Unfortunately we are out of cream. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
    }

    // restock method. Takes in nCoffeeOunces, intnSugarPackets, nCreams, nCups, and restocks each so they return to the original inventory level.
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces = 200;
        nSugarPackets = 50;
        nCreams = 50;
        nCups = 50;
    }
    public void showOptions(){
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n");
    }
}
