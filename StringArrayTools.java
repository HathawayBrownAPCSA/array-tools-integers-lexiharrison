/** The class IntegerArrayTools implements a variety of basic array tasks
  * using an array of integers.
  * 
  * The array has a fixed length MAX_NUMS but the actual number of elements
  * that are used can vary.
  */

import java.util.Scanner;

public class StringArrayTools
{
  
  private String[] arrayData;
  private int arrayCount;
  public final int MAX_NUMS = 100;
  int maxPos = 0;
  int minPos = 0;
  
  // ------------------ CONSTRUCTOR ----------------------------
  /** The contsructor merely creates the array.
    * It does not fill it with any data.  That is left up to 
    * the fillRandom or fillKeyboard methods.
    */
  public StringArrayTools ()
  {
    arrayData = new String[MAX_NUMS];
    arrayCount = 0;
  }
  
  /** Returns the number of objects in the array.
    * @return the count of items in the array. */
  public int getCount ()
  {
    return arrayCount;
  }
      
  // ------------------- METHODS TO FILL THE ARRAY -------------------------
   /** Prints the array, each string on its own line.
    */
  public void printArray ()
  {
    for (int i = 0; i < arrayCount; i++)
    {
      System.out.println (arrayData[i]);
    }
    System.out.println();
  }
  
  /** Adds an element to the end of the array. 
    * @param n The element to add
    * @return whether the element was successfully added
    */
  public boolean addItem (String n)
  {
    if (arrayCount < MAX_NUMS)
    {
      arrayData[arrayCount] = n;
      arrayCount++;
      return true;
    }
    else
      return false;
  }
  
    /** Fills the array nums with integers from 1 to n
    * @param n Upper bound for numbers with which to fill the array.
    * @param count the array to fill.  Returns a modified array.
    */
  /**public void fillRandom (int n, int count)
  {
    if (count > MAX_NUMS)       // check that it's not too many items
      count = MAX_NUMS;
    for (int i = 0; i < count; i++)
      addItem((int)(Math.random() * n) + 1);
  }
  
  /** Fills the array with integers entered by the user
    * @param nums the array to fill.  Returns a modified array.
    */
  public void fillKeyboard ()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println ("Please enter a word or letter and press return to enter the next.");
    System.out.println ("Press return again to signal the end of the list.");
    
    arrayCount = 0;
    String n = keyboard.nextLine();
    while (n.length() != 0)                 // stop input when user enters and empty line
    {
      addItem(n);
      n = keyboard.nextLine();
    }
    keyboard.close();
  }
  
  // -------------------- METHODS TO WORK WITH THE ARRAY --------------------------
  public String getMax() //Finds and returns the string that comes last alphabetically.
  {
    String max = arrayData[0];
    for (int i = 0; i < arrayCount; i++)
    {
      if (arrayData[i].compareTo(max) > 0)
      {
        max = arrayData[i];
      }
    }
    return max;
  }
  
  public int getMaxIndex() //Finds and returns the index of the string that comes last alphabetically.
  {
    String max = arrayData[0];
    for (int x = 0; x < arrayCount; x++)
    {
      if (arrayData[x].compareTo(max) > 0)
      {
        max = arrayData[x];
        maxPos = x;
      }
    }
    return maxPos;
  }
  
  public String getMin() //Finds and returns the string that comes first alphabetically.
  {
    String min = arrayData[0];
    for (int i = 0; i < arrayCount; i++)
    {
      if (arrayData[i].compareTo(min) < 0)
      {
        min = arrayData[i];
      }
    }
    return min;
  }
  
  public int getMinIndex() //Finds and returns the index of the smallest number.
  {
    String min = arrayData[0];
    for (int x = 0; x < arrayCount; x++)
    {
      if (arrayData[x].compareTo(min) < 0)
      {
        min = arrayData[x];
        minPos = x;
      }
    }
    return minPos;
  }
    
  /** Tests the various array tools */
  public static void main (String[] args)
  {
    StringArrayTools myArray = new StringArrayTools();
    //myArray.fillRandom(100, 12);
    myArray.fillKeyboard ();
    myArray.printArray ();
    System.out.println ("There are " + myArray.getCount() + " strings in the array.");
    
    // Un-comment these lines one at a time after you have written the appropriate code
    System.out.println ("The largest item is " + myArray.getMax() + "."); 
    System.out.println ("The largest item is at index " + myArray.getMaxIndex() + ".");

    System.out.println ("The smallest item is " + myArray.getMin() + ".");
    System.out.println ("The smallest item is at index " + myArray.getMinIndex() + ".");
    
  }
}