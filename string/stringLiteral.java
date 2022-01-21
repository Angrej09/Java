package string;

public class stringLiteral {

	public static void main(String[] args) {

		char c='s';
		
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword
		
		String s1="java";//creating string by java string literal  
		String s4="java";//Same address
		
		String s5=new String("java");// different address
		String s6=new String("java");
		System.out.println(s5==s6);//object ka address
		System.out.println(s5.equals(s6));//object ka content
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s4));
		System.out.println(s1==s4);//address matching Same address
		System.out.println(s1.equals(s4));// object matching
		
		System.out.println("*******************");
		
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		System.out.println(s5==s6);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s5));
		System.out.println(s1==s5);// different address
		System.out.println(s1.equals(s5));
	
		System.out.println("*******************");
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		
	}

}
