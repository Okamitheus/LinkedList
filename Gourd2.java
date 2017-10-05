/* ***************************************************
 * John Spurgeon
 * 9/22/17
 * Gourd2.java
 *
 * Finds sum of four largest consecutive integers in 2Darray
 *************************************************** */
//Worked with a group of classmates to get scanner working
import java.util.Scanner;

public class Gourd2
{
  public static void main(String[] args)
  {
    Scanner readList = new Scanner(System.in);
//initialize 2D array
    int[][] list2 = new int[20][20];
//initialize variables
    int row = 0;
    int col = 0;
    int output = 0;
    int sum = 0;
//populate 2D array
    for (row=0; row<=19; row++)
    {
      for(col=0; col<=19; col++)
      {
        if (readList.hasNextInt())
          list2[row][col] = readList.nextInt();
      }
    }
//find sum of each index and the three indexes after
    for (row=0; row<20; row++)
      {
        for (col=0; col<20; col++)
          {
            if (col<=15)
              {
                sum = list2[row][col] + list2[row][col+1] + list2[row][col+2] + list2[row][col+3];
//updates the largest sum
                if (sum > output)
                {
                  output = sum;
                }
              }
          }
      }
//prints the result of the above math
      System.out.println(output);
    }
  }
