import java.util.Scanner;

 

class Name
{
  public static void main(String args[])
  {
     String str;
 
     Scanner in = new Scanner(System.in);
 
     //Get input String
     System.out.println("Enter a string: ");
     str = in.nextLine();
     System.out.println("Input String is: "+str);
      in.close();
     }
     }