package int1;

public class Sample123 {
public static void main(String args[]) {
	StringBuffer s = new StringBuffer("hallo");
	s.append("hey");
	System.out.println(s);
	s.replace(1, 3,"java");
	System.out.println(s);
	s.insert(1, "java");
	System.out.println(s);
	s.delete(1, 3);
	System.out.println(s);
	s.reverse();
	System.out.println(s);
	
	
	
}
}
