package CollectionAssignment_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DuplicateRemoveFrom {
	
	public static List<Integer> duplicateElements(List<Integer> intList){
		Set<Integer> uniqueSet=new HashSet<>();
		Iterator<Integer> iterator = intList.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
				uniqueSet.add(next);
		}
		
		System.out.println("set="+uniqueSet);
		List<Integer> listconvertSetToList = ListconvertSetToList(uniqueSet);
		Collections.sort(listconvertSetToList);
		
		return listconvertSetToList;
	}
	
	private static List<Integer> ListconvertSetToList(Set<Integer> newSet){
		List<Integer> list=new ArrayList<>();
		Iterator<Integer> setIterator = newSet.iterator();
		while(setIterator.hasNext()) {
			Integer next = setIterator.next();
			list.add(next);
		}
		System.out.println("list="+list);
		return list;
	}
	
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		list.add(4);
		list.add(8);
		list.add(11);
		list.add(17);
		list.add(12);
		list.add(2);
		System.out.println("Inserted List= "+list);
		List<Integer> duplicateElements = duplicateElements(list);
		System.out.println("List after removed duplicate elements="+duplicateElements);
		
	}

}
