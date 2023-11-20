package int1;

import java.util.ArrayList;

public class Sample2 {
	public void list() {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.addAll(a2);
		a1.add(20);//adds 20 to o th index
		a1.add(30);//add 30 to 1 st index
		a1.add(50);//add 50 to 2 nd index
		for(Integer i:a1) {
			System.out.println("values added"+i);
			
		}
		a1.remove(2);//remove element in 2nd index position
		int s=a1.size();//size of the array
		System.out.println("size is"+s);
		System.out.println("add"+a1.add(20));
		System.out.println(a1.size());
		System.out.println("remove"+a1.remove(2));
	}
	public static void main(String args[]) {
		Sample1 ob=new Sample1();
		ob.list1();
	}
}
