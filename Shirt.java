import java.util.*;
public class Shirt extends ClothingItems
{
  protected static ArrayList<Shirt> shirts = new ArrayList<Shirt>();
  
  public Shirt(String seaSon,boolean p,boolean f,boolean fi,String n,String c)
  {
    super(seaSon,p,f,fi,n,c); //call the contrucot of the super class clothingItems
    shirts.add(this); // add to the arraylist
  }
   
  public static Shirt getTheShirts(int i)
  {
    return shirts.get(i); //return the size of list
  }
  
  public static int getSize()
  {
    return shirts.size(); // this will return the appropriate shirts
  }
}