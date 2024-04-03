package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		
		//arraylist fill 10 integers 1 - 10
		for (int i = 0; i < 10; i++) {
			list1.add(((int) (Math.random() * 10) + 10));
		}
		
		System.out.println("arraylist: ");
		for (Iterator<Integer> i = list1.iterator(); i.hasNext();) {
			System.out.print(i.next() + " ");
		}
		System.out.println();
	}

}
