package CollectionAssignment_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		 ArrayList<Integer> l = new ArrayList<Integer>();
         
         l.add(9);
         l.add(13);
         l.add(19);
         l.add(24);
         l.add(28);
         l.add(36);
         l.add(41);
  
         System.out.println("List of array: "+l);
  
         // Initializing the key to be found
         int val = 20;
     
         int result = Collections.binarySearch(l, val);
        
         if (result == -1)
             System.out.println("Element not present");
         else
             System.out.println("The Element " + val + " is found at "
                                + "index " + result);
     }

}
