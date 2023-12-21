import java.util.Enumeration;
import java.util.Hashtable;

public class Library extends Building {
    private Hashtable <String, Boolean> collection;

    /**
   * Constructor for the library. Initializes a hashtable of titles and availability.
   * @param   name String
   * @param   address String
   * @param   nFloors an int with the number of floors
   * @return  an instance of a library
   */
    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a library: 📖");
        this.collection = new Hashtable<String, Boolean>();
        }

    /**
    *Method addTitle. Adds a book with its availability into the hash table titles collection.
   * @param   title String
   * @return  none
   */
    public void addTitle(String title){
        collection.put(title, available);
    }

    /**
   * method removeTitle. Removes a book and its availability from the hashtable collection.
   * @param   title String
   * @return  none
   */
    public void removeTitle(String title){
        collection.remove(title, available);
    }

    /**
   * method checkOut. Takes in key and value. Replaces value with false so the book is no longer available. Throws a runtime exception if the book is unavailable. Throws an exception if the book is not in the system.
   * @param   title String
   * @return  none
   */
    public void checkOut(String title){
        // Check to see if the book is in the collection, check to see if the book is available
        if (containsTitle(title)){
            if (isAvailable(title)){
                collection.replace(title, true, false);
            }
            throw new RuntimeException ("This book is not currently available. You cannot check it out.");

        }
        throw new RuntimeException("Unfortunately this book is not in our library system. Perhaps check another nearby.");
    }

    /**
   * method checkOut. Overloads the original check out to account for checking out multiple books at once. Iterates over each of the titles in the string list "titles" that contains all of the books the library goer wants to check out. 
   * @param   title String
   * @return  none
   */
  public void checkOut(String title){
    if !collection.containsKey(title){
      throw new RuntimeException(title+" does not exist in our collection and cannot be checked out.");
    }
    available.equals(false);
  }

    /**
   * Return method. Takes in key and value. Replaces the value with true so that the book is available. Throws an exception if the book was not checked out.
   * @param   title String
   * @return  none
   */
  public void returnBook(String title){
    if collection.containsKey(title){
      throw new RuntimeException(title+" does not exist in our collection and cannot be returned.");
    }
    available.equals(true);
    }

     /**
   * method returnBook. Overloads the original return book method to account for returning multiple books at once. Iterates over each of the titles in the string list "titles" that contains all of the books the library goer wants to return. 
   * @param   titles String list
   * @return  none
   */
    public void returnBook(String[] titles){
        for (String title: titles){
            returnBook(title);
        }
    }
    
    /**
   * containsTitle. Checks if the hashtable contains a book, if not prints a statement, if it does prints a statement.
   * @param   title String
   * @return  none
   */
    public void containsTitle(String title){
        collection.containsKey(title);
        if (true){
            System.out.println("It looks like "+title+" is currently in our system.");
        } System.out.println("Sorry, for the inconvenience. "+title+" is not in our system");
    }

    /**
   * isAvailable. Checks if the value of the hashtable corresponding to the title is true, if not prints a statement, if it does prints a statement.
   * @param   title String
   * @return  none
   */
    public void isAvailable(String title){
        if (collection.get(title).equals(false)){
            System.out.println("Sorry for the invonvenience, "+title+" is not currently available.");
        }System.out.println(title+" is currently available.");
    }

    /**
   * method printCollection. Uses hashtable enumeration to print each key (title and author).
   * @param   none
   * @return  none
   */
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

    /**
   * Method that shows options of what a person can do in a library. Not overridden because it will contain all of the same things as the showOptions method in the building class. 
   * @param   none
   * @return  none
   */
    public void showOptions(){
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
    }

    
    public void goToFloor(int floorNum){
        super.goToFloor();   
    }

}

