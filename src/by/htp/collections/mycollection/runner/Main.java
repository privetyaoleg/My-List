package by.htp.collections.mycollection.runner;

import java.util.LinkedList;
import java.util.List;

import by.htp.collections.mycollection.list.MyArrayList;
import by.htp.collections.mycollection.list.MyCollections;
import by.htp.collections.mycollection.list.MyLinkedList;

public class Main {

	public static void main(String[] args) {
		
//		List<String> list1 = new LinkedList<>();
//		
//		
//		MyCollections<String> list = new MyLinkedList<>();
//		MyCollections<String> list2 = new MyLinkedList<>();
//		list.addLast("A");
//		list.addLast("C");
//		list.addLast("Z");
//		list.addLast("X");
//		list.addLast("O");
//		list.addLast("Y");
//		
//		list.addFirst("M");
//		list.addFirst("N");
//		
//		System.out.println(list.size());
//		System.out.println(list.getElementByIndex(5));
//		System.out.println(list);
//		list.setPosition(5, "NEW");
//		System.out.println(list);
//		list.remove(1);
//		
//		System.out.println(list);
//		list.remove(4);
//		list.remove(3);
//		list.setPosition(6, "NEW");
//		System.out.println(list);
//		System.out.println(list.isEmpty());
//		System.out.println(list2.isEmpty());
		
		System.out.println("?????????????????????????????????");
		
		MyCollections<String> listArray = new MyArrayList<>();
		listArray.addLast("a");
		listArray.addLast("b");
		listArray.addLast("x");
		listArray.addLast("y");
		listArray.addLast("z");
		System.out.println(listArray);
		listArray.remove(3);
		
		listArray.remove(0);
		System.out.println(listArray);
		listArray.addFirst("new");
		listArray.setPosition(2, "new2");
//		listArray.remove(1);
		System.out.println(listArray);
		System.out.println(listArray.size());
		System.out.println(listArray.getElementByIndex(1));
		
		for (String string : listArray) {
			System.out.println(string);
		}
		
		
	}

}
