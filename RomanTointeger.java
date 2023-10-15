import java.util.Scanner;
public class RomanToInteger  
{   
  int value(char ch)   
  {   
    if (ch == 'I')   
      return 1;   
    if (ch == 'V')   
      return 5;   
    if (ch == 'X')   
      return 10;   
    if (ch == 'L')   
      return 50;   
    if (ch == 'C')   
      return 100;   
    if (ch == 'D')   
      return 500;   
    if (ch == 'M')   
      return 1000;   
    return -1;   
  }    
  int convertRomanToInt(String s)   
  {     
    int total = 0;    
    for (int i=0; i<s.length(); i++)   
    {   
      int s1 = value(s.charAt(i));   
      if (i+1 <s.length())   
      {   
        int s2 = value(s.charAt(i+1));  
        if (s1 >= s2)   
        {   
          total = total + s1;   
        }   
        else  
        {   
          total = total - s1;   
        }   
      }   
      else  
      {   
        total = total + s1;   
      }   
    }   
    return total;   
  }   
  public static void main(String args[])   
  {   
    Scanner scan=new Scanner(System.in);
    RomanToInteger ob = new RomanToInteger();  
    String romanvalue= scan.nextLine() ;   
    System.out.println(ob.convertRomanToInt(romanvalue));   
    scan.close();
  }   
}
