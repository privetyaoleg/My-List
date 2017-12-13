package by.htp.collections.LinkedList.MyLinkedList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import by.htp.collections.MyCollections;

public class Main {

	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<>();
		
		
		MyCollections<String> list = new MyLinkedList<>();
		MyCollections<String> list2 = new MyLinkedList<>();
		list.addLast("A");
		list.addLast("C");
		list.addLast("Z");
		list.addLast("X");
		list.addLast("O");
		list.addLast("Y");
		
		list.addFirst("M");
		list.addFirst("N");
		
		System.out.println(list.size());
		System.out.println(list.getElementByIndex(5));
		System.out.println(list);
		list.setPosition(5, "NEW");
		System.out.println(list);
		list.remove(1);
		
		System.out.println(list);
		list.remove(4);
		list.remove(3);
		list.setPosition(6, "NEW");
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list2.isEmpty());
	}

}
