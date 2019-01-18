/**
 * Mark Schuberth
 * 
 * Creates a histogram based on file input of grades. If grades
 * are out of bounds from 0 - 100 the program lets the user know
 * that this is an invalid input.
 * 
 */
import java.util.Scanner;
import java.io.*;

public class Hist
{
  public static void main (String[] args) throws IOException
  {
    Scanner fileInput = new Scanner(new File("texttest.txt"));
    int[] number = new int[10];
    int temp = 0;
    
    //while there are still tokens to read in the file
    while(fileInput.hasNext())
    {
    		//temp variable will read each int and process it through if statement
        temp = fileInput.nextInt();
        //if numbers are out of the range 1 - 100, invalid input
        if(temp > 100 || temp < 1)
        {
            System.out.println("invalid input");
        }
        else
        {
          number[(temp - 1) / 10]++;
        }
    }
    //for loop will keep processing each integer and put them in the appropriate range group
    for(int i = 0; i <= number.length-1; i++)
    {
    	   if(i == 0)
    	   {
       System.out.print(" 1 - 10  |");
    	   }
    	   else
    	   {
    	   System.out.print(i + "1 - ");
    	   
    	   if(i >= 9)
    	   {
    		 System.out.print(i + 1 + "0 |");
    	   }
    	   else
    	   {
    	    System.out.print(i + 1 + "0  |");
    	   }
    	   }
    	   //this for loop prints the *'s next to the histogram
       for(int h = 0; h < number[i]; h++) 
       {
       System.out.print("*");
       }
       System.out.print("\n");
      {
    }
  }
 }
}
 
