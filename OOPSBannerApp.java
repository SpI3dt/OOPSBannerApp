/**	
  *OOPSBannerApp - Render OOPS as banner using an inline array initialization
  *@author Siddharth B
  *@version 5.0

 */



public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] lines = {
            String.join("   ***   ","   ***   ","******   ","   ***** "),
            String.join(" **   ** "," **   ** ","**    ** "," **      "),
            String.join("**     **","**     **","**     **","**       "),
            String.join("**     **","**     **","**    ** "," **      "),
            String.join("**     **","**     **","******   ","   ***   "),
            String.join("**     **","**     **","**       ","      ** "),
            String.join("**     **","**     **","**       ","       **"),
            String.join(" **   ** "," **   ** ","**       ","      ** "),
            String.join("   ***   ","   ***   ","**       "," *****   ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}