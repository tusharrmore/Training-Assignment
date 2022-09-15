package CollectionAssignment_01;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrder {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(17);
		list.add(8);
		list.add(1);
		list.add(27);
		list.add(10);
		list.add(11);
		
		System.out.println("List without Sort="+list);
		Collections.sort(list);
		System.out.println("Sorted List="+list);
	}

}
