import java.util.*;
public class Shoes extends ClothingItems
{
  protected static ArrayList<Shoes> shoes = new ArrayList<Shoes>();
  
  public Shoes(String seaSon,boolean p,boolean f,boolean fi,String n,String c)
  {
    super(seaSon,p,f,fi,n,c); //call the contructor of the super class clothingItems
    shoes.add(this); // add to the arraylist
  }  
  
  public static Shoes getTheShoes(int i)
  {
    return shoes.get(i); //return the size of list
  }
  
  public static int  getSize()
  {
    return shoes.size(); //this will return the appropriate shoes
  }
}