package string;

public class stringMethods {

	public static void main(String[] args) {

		//charAt		
		String s= "Java is awesome and Python is also awesome";
		String s1="Both are oops both";
		char ch=s.charAt(2);
		System.out.println(ch);
		
		//compareTo		
		System.out.println(s.compareTo(s1));//B is 8 times upper than J so output is 8
		
		//concat		
		System.out.println(s.concat(s1));
		
		//contains		
		System.out.println(s.contains("and"));
		
		//equals
		System.out.println(s.equals(s1));
		
		//length
		System.out.println(s.length());
		
		//replace
		System.out.println(s1.replace('b', 'w'));
		
		//replaceAll
		System.out.println(s1.replaceAll("t", "a"));
		
		//split
		String s2[]=s.split(" ");
		System.out.println(s2[0]);
		
		//substring		
		System.out.println(s.substring(6));
		System.out.println(s.substring(5, 9));
		
		//toCharArray		
		char c[]=s.toCharArray();
		System.out.println(c[9]);
		
		//valueOf-- convert to String type
		int i=10;
		int j=20;
		String s4=String.valueOf(i);
		System.out.println(i+j);
		System.out.println(s4+j);
		

	}

}
