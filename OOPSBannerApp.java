/**	
  *OOPSBannerApp - Render OOPS as banner using string array and loop
  *uses an array lines[n]=print statement  and for loop statement
  *author Siddharth B
  *@version 4 

 */



public class OOPSBannerApp{
	public static void main(String[] args){
		String[] lines = new String[7];
		lines[0]=System.out.println(String.join("   ***   ","   ***   ","******   ","   ***** "));
		lines[1]=System.out.println(String.join(" **   ** "," **   ** ","**    ** "," **      "));
		lines[2]=System.out.println(String.join("**     **","**     **","**     **","**       "));
		lines[3]=System.out.println(String.join("**     **","**     **","**    ** "," **      ");
		lines[4]=System.out.println(String.join("**     **","**     **","******   ","   ***   "));
		lines[5]=System.out.println(String.join("**     **","**     **","**       ","      ** "));
		lines[6]=System.out.println(String.join("**     **","**     **","**       ","       **"));
		lines[7]=System.out.println(String.join(" **   ** "," **   ** ","**       ","      ** "));
		lines[8]=System.out.println(String.join("   ***   ","   ***   ","**       "," *****   "));
		
		for(String line:lines){
			System.out.println(line);
	}
}