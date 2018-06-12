import java.util.*;
public class OutfitPlanner
{  
  public static boolean isOutfitGood(Outfit o)
  {
    if ((o.areYouFancy()) && (o.hasFancyItem())) 
    {
      return true;
    }    
    else if ((!o.areYouFancy()) && 
             (!o.hasFancyItem()) && 
             (!o.isItPlain())  && 
             (!o.hasGreenAndBlue()) &&    //these too if statements will go through in order to determin an outfit. Either fancy or not.
             (!o.allSameColor()) && 
             (!o.tieWithJeans()) && 
             (o.seasons()))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void makeOutfit()
  {
    boolean passOutfit = false;    
    int shirtI;
    int pantsI;
    int shoesI;  //attributs
    int outewearI;
    int accessoryI;  
    Random random = new Random(System.currentTimeMillis());
  
   while(!passOutfit)
   {
     shirtI = random.nextInt(Shirt.getSize());
     pantsI = random.nextInt(Pants.getSize()); //random indexed
     shoesI = random.nextInt(Shoes.getSize());
     outewearI = random.nextInt(Outwear.getSize());
     accessoryI = random.nextInt(Accessories.getSize());

     Outfit randomO = new Outfit(Shirt.getTheShirts(shirtI), 
                                 Pants.getThePants(pantsI), 
                                 Shoes.getTheShoes(shoesI),        //this will get us a new random outfit
                                 Outwear.getTheOutwear(outewearI),
                                 Accessories.getTheAccessories(accessoryI));
    
     passOutfit = isOutfitGood(randomO); //go to the check and see if it's all good
     if(passOutfit)
      {
        System.out.println(randomO.stringsOfOutfits()); //print the good outfit
      }
   }
  }
}