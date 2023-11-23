/* This is a stub for the Library class */
import java.util.Enumeration;
import java.util.Hashtable;
// Creates library as an extension of building. Initializes the hashtable of books. the key is title and author, the key is a boolean that returns a value for whether or not the book is available.

public class Library extends Building {
    private Hashtable <String, Boolean> collection;
    public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖");
    this.collection = new Hashtable<String, Boolean>();
    }
    // Add title method. Takes in the key and value, puts it into the hashtable
    public void addTitle(String title, Boolean available){
        collection.put(title, available);
    }
    // Remove title method. Takes in key and value. Removes the book from the hashtable
    public void removeTitle(String title, Boolean available){
        collection.remove(title, available);
    }
    // Check out method. Takes in key and value. Replaces value with false so the book is no longer available.
    public void checkOut(String title, Boolean available){
        collection.replace(title, available.equals(true), available.equals(false));
    }
    // Return method. Takes in key and value. Replaces the value with true so that the book is available. 
    public void returnBook(String title, Boolean available){
        collection.replace(title, available.equals(false), available.equals(true));
    }
    // containsTitle method that returns a boolean. Checks if the hashtable contains a book, if not prints a statement, it it does prints a statement.
    public boolean containsTitle(String title){
        collection.containsKey(title);
        if (true){
            throw new RuntimeException("Sorry, for the inconvenience. "+title+"is not in our system");
        }
    }
    // isAvailable method returns a boolean and prints a statement if the book is available. Prints a statement if the book is not. 
    public boolean isAvailable(String title){
        if (collection.get(title).equals(false)){
            throw new RuntimeException("Sorry, the title is not currently available");
        }
    }
    // print collection uses hashtable enumeration to print each key (title and author).
    public void printCollection(){
        System.out.println("**********Library Collection**********");
        Enumeration enu = collection.keys();
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
    }
    public static void main(String[] args) {
      new Library();
    }
    public void showOptions(){
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
    }
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
            System.out.println ("You are now on floor #"+activeFloor+" of "+this.name);
            activeFloor += 1;
        }
        
    }

}

