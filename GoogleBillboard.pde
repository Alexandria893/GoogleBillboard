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
  for(int i=0; i<e.length(); i++)
  {
    if(e.substring(i,i+10).length().equals(10))
      {
	      System.out.println(e.substring(i,i+10).length());
      }
    return false;
  }

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