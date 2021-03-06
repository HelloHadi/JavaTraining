/**  
* Porsche.java - a simple class for demonstrating the use of javadoc comments by Gopinathan Munappy.  
* @author  Abdul Hadi
* @version 1.0 
* @see Automobile
*/ 
public class Porsche extends Automobile {  

   protected String color; 

   /**  
    * Retrieve the value of color.  
    * @return A String data type.  
    */  
   public String getColor() {  
      return color;  
   } 

   /**  
    * Set the value of color.  
    * @param newColor A variable of type String.  
    */  
   public void setColor(String newColor) {  
      color = newColor;  
   }  
}  