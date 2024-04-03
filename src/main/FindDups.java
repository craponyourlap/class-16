package main;

import java.util.HashSet;
import java.util.Set;

public class FindDups {
//	static {
//		String[] args = {"i","am","sam","sam"};
//		main(args);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<>();
		for (int i = 0; i<args.length; i++) {
			if (!s.add(args[i]))
				System.out.println("DUPLICATE FUCKING DETECTED!!!!: " + args[i]);
		}
		System.out.println(s.size() + "distinct words detected: "+s);
	}

}
