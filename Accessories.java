import java.util.*;
public class Accessories extends Outfit
{
  //create array list for accessories
  protected static ArrayList<Accessories> accessories = new ArrayList<Accessories>();
  
  public Accessories(boolean p,boolean f,boolean fi,String n,String c)
  {
        
    super(p,f,fi,n,c); //call the contructer of the super class outfit
    accessories.add(this); // add to the arraylist
  }
  
    public static int getSize()
  {
    return accessories.size();  //return size of the list
  }
  
  public static Accessories getTheAccessories(int i) 
  {
    return accessories.get(i); //this will return the appropriate assoccories
  }
  
}