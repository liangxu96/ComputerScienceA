import java.util.*;

public class CompareTo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word1, word2; 
    int wordvalue;
    
    word1 = input.nextLine();
    word2 = input.nextLine(); 
    
    //if we have "dog" for word1 and "doggie " for word2, dog will display first, it checks every letter util it finds a difference.
    
    
    wordvalue = word1.compareTo(word2); //Does (word1 - word2)
    //compareTo is CASE SENsitiVE and will look at the ASCII table for values of capitilization. 

    if (wordvalue < 0) { //if word 1 is smaller (comes first in alphabet and make a NEGATIVE) it will display first
        System.out.println(word1 + " comes before " + word2 + " in the alphabet.");
    }
    else if (wordvalue > 0) { //if word 2 is smaller (comes first in alphabet and make a POSITIVE) it will display first
        System.out.println(word2 + " comes before " + word1 + " in the alphabet.");
    }
    else { //if word1 and word2 are the same words
        System.out.println(word1 + " and " + word2 + " are the same word.");
    }
  } //ends main
} //ends class
