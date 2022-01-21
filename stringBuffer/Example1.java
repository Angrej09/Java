package stringBuffer;

public class Example1 {

	public static void main(String[] args) {

		String s="Angrej Singh";
		System.out.println(s.substring(5));
		StringBuffer sb=new StringBuffer(s);
		//sb.reverse();
		System.out.println(sb);
		String ss=sb.substring(5);
		System.out.println(ss);
		
		

	}

}
