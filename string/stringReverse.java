package string;



public class stringReverse {

	public static void main(String[] args) {


		String s= "Java is awesome language";
		String rev="";
		String split[]=s.split(" ");
		
		
		System.out.println(split.length);
		//reverse each word in the given string
		for(int k=0;k<split.length;k++)
		{
			char c[]=split[k].toCharArray();			
			for(int t=c.length-1;t>=0;t--)
			{
				System.out.print(c[t]);
			}
			System.out.print(" ");
		}
		System.out.println();
		
		//reverse the given string
		for(int i=split.length-1;i>=0;i--)
		{
			rev+=split[i]+" ";
		}
		System.out.println(rev);
		
		//reverse each character in the given string or word
		char ch[]=s.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			System.out.print(ch[j]);
		}
		
		
	}
}
