package CollectionAssignment_05;

import java.util.Collections;
import java.util.Vector;

public class VectorShort {
	
	 public static void main(String[] args) {
		
		 Vector<String> v=new Vector<>();
			v.add("bed");
			v.add("chair");
			v.add("tubelight");
			v.add("door");
			Collections.sort(v);
			System.out.println(v);
		 
	}

}
