import java.util.*;
public class Pants extends ClothingItems
{ 
  protected static ArrayList<Pants> pants = new ArrayList<Pants>(); //array list of pants
  
  public Pants(String seaSon,boolean p,boolean f,boolean fi,String n,String c)
  {
    super(seaSon,p,f,fi,n,c); //call the contructor of the super class clothingItems
    pants.add(this); // add to the arraylist
  }
  
  public static int getSize() 
  {
    return pants.size(); //return the size of list
  }
  public static Pants getThePants(int i)
  {
    return pants.get(i); //this will return the appropriate pants
  }
  
 
}