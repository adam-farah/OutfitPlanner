import java.util.*;
public class Outfit extends OutfitPlanner
{ 
  protected String colour;
  protected boolean fancy;
  protected boolean plain;
  protected boolean fancyItem;
  protected String name;
  ////////////////////// class' atributes
  protected Shirt shirt;
  protected Pants pants;
  protected Shoes shoes;
  protected Outwear outwear;
  protected Accessories accessories;
  
  public Outfit(boolean p,boolean f,boolean fi,String n,String c)
  {
    plain = p;
    fancy = f;
    fi = fancyItem;  //contructor
    name = n;
    colour = c;
  }
  
  public Outfit(Shirt s, Pants p, Shoes sh, Outwear o, Accessories a)
  {
    shirt = s;
    pants = p;
    shoes = sh;  //contructor
    outwear = o;
    accessories = a;
  }
  
  //if these functions are true it will return....
  boolean areYouFancy() 
  {
    //object is fancy
    return (this.shirt.fancy) && (this.pants.fancy) && (this.shoes.fancy) && (this.outwear.fancy) && (this.accessories.fancy);
  }
    
  boolean isItPlain()
  {
    //object is plain
    return (this.shirt.fancy) && (this.pants.fancy) && (this.shoes.fancy) && (this.outwear.fancy) && (this.accessories.fancy);
  }
  
  public boolean hasGreenAndBlue()
  {
    //object has green and blue
   return (((this.shirt.colour.equals("Blue")) || (this.pants.colour.equals("Blue")) || (this.shoes.colour.equals("Blue")) || (this.outwear.colour.equals("Blue")) || (this.accessories.colour.equals("Blue")))
      && ((this.shirt.colour.equals("Green")) || (this.pants.colour.equals("Green"))  || (this.shoes.colour.equals("Green")) || (this.outwear.colour.equals("Green")) || (this.accessories.colour.equals("Green"))));
  }
  
  boolean dressshoesAppropriate()
  {
    //object is good with dress shoes
    return this.fancy;
  }
  
   public boolean allSameColor()
  {
     //the entire outfit has the same colour
    return ((this.shirt.colour.equals(this.pants.colour)) && (this.pants.colour.equals(this.shoes.colour)) && (this.shoes.colour.equals(this.outwear.colour)) && (this.outwear.colour.equals(this.accessories.colour)));
  }
  
  public boolean tieWithJeans()
  {
    //tie and jeans in in the same outfit
    return ((this.accessories.name.equals("Tie")) && (this.pants.name.equals("Jeans")));
  }
  
  public boolean seasons()
  {
    //it'sall apart of the same season
    return ((this.shirt.season.equals(this.pants.season)) && (this.pants.season.equals(this.shoes.season)) && (this.shoes.season.equals(this.outwear.season)) && (this.accessories.fancy == this.areYouFancy()));
  }
  public boolean hasFancyItem()
  {
    //object is good with a fancy item
   return ((this.shirt.fancy) || (this.pants.fancy) || (this.shoes.fancy) || (this.outwear.fancy) || (this.accessories.fancy));
  }
  public String stringsOfOutfits()
  {
    String info = "Wearing a " + this.shirt.name  + " and " + this.pants.name  + ", and some" + this.shoes.name;
    //with this we can give variables strings in order to set up a final statement when an outfit is generated 
    if (!this.outwear.name.equals("not wearing an outwear"))
    {
      info += " , with a" + this.outwear.name + ".";
    }

    if (!this.accessories.name.equals("with no asseccory"))
    {
      info += " Topping it off with a " + this.accessories.name + ".";
    }   
    return info;
  }
}   