package string;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
				
				String s="Javaaa is is two";
				String str="Apple";
				char ch[]=s.toCharArray();	
				//main(null);
			
				for(int i=0;i<ch.length;i++)
				{
					int j,count=1;
					for(j=i+1;j<ch.length;j++)
					{
						if(ch[i]==ch[j])
						{
							count++;
							ch[j]=' ';
					}
					
				}
				
				if(ch[i]!=' ')
				//System.out.println(ch[i] +" " +count);
				System.out.print(ch[i] + " " );
				}
				
			}
}