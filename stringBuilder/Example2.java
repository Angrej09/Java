package stringBuilder;

public class Example2 {

	public static void main(String[] args) {
		String s="Angrej Singh";
		StringBuilder sb=new StringBuilder(s);//thread safe
		
		sb.reverse();
		sb.append(" Gill");
		System.out.println(sb);
		

	}

}
