/* ***************************************************
 * John Spurgeon
 * 9/22/17
 * Gourd1.java
 *
 * Lists the count and percentage of the initial digits of integers in a list
 *************************************************** */
//import scanner utility and formatting utility
import java.util.Scanner;
import java.io.PrintStream;

public class Gourd1
{
  public static void main(String[] args)
  {
    //create new scanner
    Scanner readList = new Scanner(System.in);

    //initialize array and variables
    int[] digits = new int[10];
    int num = 0;
    int total = 0;
    float perTotal = 0;

    //populate array with counts of initial digits
    while(readList.hasNextInt())
      {
      	num = readList.nextInt();
      	while(num>=10)
          {
      			num/=10;
          }
        digits[num]++;
      }

    //obtain total
    for (num=0; num<10; num++)
      {
        total += digits[num];
      }

    //obtain total of all percentages
    for (num=0; num<10; num++)
      {
        perTotal += digits[num]*100f/total;
      }

    //declare strings for table pieces
    String border = "-------------------------------";
    String dBorder = "===============================";
    String header = "Leading Digit\t" + "Count\t" + "      %";
    String footer = "TOTAL\t\t" + total + "\t";

    //print table header
    System.out.println(border + "\n" + header + "\n" + border);

    //print table
    for (num=0; num<10; num++)
    {
      float percent = digits[num]*100f/total;
      System.out.print(num + "\t\t" + digits[num] + "\t ");
      System.out.format("%5.2f%%%n", percent);
    }

    //print table footer
    System.out.print(border + "\n" + footer);
    System.out.format("%5.2f%%%n", perTotal);
    System.out.println(dBorder);
  }
}
