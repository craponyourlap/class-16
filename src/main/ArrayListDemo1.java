package main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(20);
		list.add(54);
		list.add(69);
		//calling iterator interface
		Iterator iterator = list.iterator();
		//normally, you would call Iterator<Integer> but ig he feels special today
		System.out.println(iterator.next());
		//every single time the method .next is called on this iterator,
		//the pointer moves forward
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		iterator.remove();//this method removes the latest returned element
		//by the iterator
		
		
	}

}
