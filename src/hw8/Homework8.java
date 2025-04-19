package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(3.14));
		list.add(Long.valueOf(21L));
		list.add(Short.valueOf("100"));
		list.add(Double.valueOf(5.1));
		list.add("Kitty");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		Iterator<Object> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			if(!(object instanceof Number)) {
				it.remove();
			}
		}
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
