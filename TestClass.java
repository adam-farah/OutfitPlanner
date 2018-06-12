/*
Run the program a few times to see different types of outfites! 
*/ 
import java.util.*;
public class TestClass
{
  public static void main(String[] args)
 {       
    Accessories accessories1 = new Accessories(false, false,false, " bracelet", "Blue");
    Accessories accessories2 = new Accessories(false, true,true, " Bow Tie", "Black");
    Accessories accessories3 = new Accessories(false, false,false, " watch", "Red");
    Accessories accessories4 = new Accessories(false, true,true, " mega ultra baller crown", "gold");
    
    Outwear outwear1 = new Outwear("Winter", false, true,true, " mega ultra baller Dress Jacket", "gold");
    Outwear outwear2 = new Outwear("Fall", false, false,false, " mega ultra baller fur coat", "gold");
    Outwear outwear3 = new Outwear("Summer", false, false,false, " light summer coat", "pink");
    Outwear outwear4 = new Outwear("Spring", false, false,false, " Rain Jacket", "red");
    
    Pants pants1 = new Pants("Winter", false, true,true, " mega ultra baller dress pants", "gold");                 //set up my objects
    Pants pants2 = new Pants("Spring", false, true,true, " chinos", "brown");
    Pants pants3 = new Pants("Summer", false, false,false, " summer shorts", "red");
    Pants pants4 = new Pants("Summer", false, false,false, " Kevin Bacon's shorts", "blue");
    
    Shirt shirt1 = new Shirt("Summer", true, false,false, "T-Shirt", "blue");
    Shirt shirt2 = new Shirt("Winter", false, true,true, "maga ultra baller blazer", "gold");
    Shirt shirt3 = new Shirt("Spring", false, false,false, "turtle neck", "purple");
    Shirt shirt4 = new Shirt("Winter", false, true,true, "cardigan", "white");
    
    
    Shoes shoes1 = new Shoes("Summer", false, false,false, " hi-tops", "grey");
    Shoes shoes2 = new Shoes("Winter", false, true,true, " mega ultra baller Dress Shoes", "gold");
    Shoes shoes3 = new Shoes("Spring", false, false,false, " Rain Boots", "topaz");
    Shoes shoes4 = new Shoes("Summer", false, false,false, " espadrilles", "Turqoise");
    

    for (int i = 0; i < 6; i++)
    { //print six outfits or more if you want to increase the for loop
      System.out.println(" ");
      OutfitPlanner.makeOutfit();

    }
  }
}