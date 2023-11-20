package int1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sample4{
	public static void main(String args[]) {
		Sample4 ob=new Sample4();
		ob.link();
	}
		public void link() {

List<String>a1=new LinkedList<>();
a1.add("Welcome");
a1.add("to");
a1.add("our");
a1.add("Website");
Iterator<String>itr=a1.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
	
}
itr.remove();

}}