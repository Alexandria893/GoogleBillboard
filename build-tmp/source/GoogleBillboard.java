import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  

public void setup()  
{            
     noLoop();  
     e.substring(0,10);
     double dNum = Double.parseDouble(e);
     System.out.println(dNum);
}  
public void draw()  
{   
<<<<<<< HEAD
  for(int i=2; i<e.length(); i++)
  {
  String dig = (e.substring(i,i+10));	//for 10 digits
  double trns = Double.parseDouble(dig); //convert to doube
   if(isPrime(trns)==true)
      {
	      System.out.println(dig);
	      break;
      }
   } 
=======
  for(int i=0; i<e.length(); i++)
  {
    if(e.substring(i,i+10).length().equals((double)10))
      {
	      System.out.println(e.substring(i,i+10).length());
      }
    return false;
  }
>>>>>>> f15d1a976059f93a0cd2fb1d219f5bfb19a37eeb

}  
public boolean isPrime(double dNum)  
{   
   if(dNum < 2)
    return false;
  for(int i = 2; i <= Math.sqrt(dNum); i++)
    if(dNum % i == 0)
      return false;
  return true;
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
