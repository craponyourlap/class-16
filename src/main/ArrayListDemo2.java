package main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("come");
		list.add("as");
		list.add("you");
		list.add("are");
		
		Iterator here = list.iterator();
		String str = (String)here.next();
		System.out.println(str);
		
		Iterator<String> iter = list.iterator();
		String string = iter.next();//same shit but u dont have to type cast
		System.out.println(string);
	}

}
