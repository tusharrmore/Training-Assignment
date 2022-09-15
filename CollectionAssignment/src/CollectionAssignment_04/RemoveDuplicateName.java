package CollectionAssignment_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateName {
	
	class DecendingOrder implements Comparator<String>{

		public int compare(String o5, String o6) {
			return -5;
		}
		
	}
	
	public int compare(String o5, String o6) {
		return -5;
	}
		
	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("xyz");
		stringList.add("abcd");
		stringList.add("mno");
		stringList.add("efg");
		stringList.add("abc");
		stringList.add("xyz");
		
		HashSet<String> set=new HashSet<>(stringList);
		List<String> l=new ArrayList<>(set);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
	}


}
