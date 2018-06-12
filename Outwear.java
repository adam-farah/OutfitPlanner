import java.util.*;
public class Outwear extends ClothingItems
{
  protected static ArrayList<Outwear> outwear = new ArrayList<Outwear>();
  
  public Outwear(String seaSon,boolean p,boolean f,boolean fi,String n,String c)
  {
    super(seaSon,p,f,fi,n,c); //call the contructor of the super class clothingItems
    outwear.add(this); // add to the arraylist
  }
  
  public static int getSize()
  {
    return outwear.size(); //return size of list
  }
  
  public static Outwear getTheOutwear(int i)
  {
    return outwear.get(i); //this will return the appropriate outwear
  }
  

}