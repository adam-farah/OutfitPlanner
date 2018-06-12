import java.util.*;
public abstract class ClothingItems extends Outfit
{
  //class' attributes
  String season;
  
  public ClothingItems(String seaSon, boolean p, boolean f, boolean fi, String n, String c)
  {   
    super(p,f,fi,n,c); //call contructor of the super class outfit
    season = seaSon;   
  }

}