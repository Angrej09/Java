package string;

public class CharCount {

	public static void main(String[] args) {
		
		String s="Jvaaa is is twox";
		
		char ch[]=s.toCharArray();
		int i,maxcount=0;
		for(i=0;i<ch.length;i++)
		{
			int j,count=1;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=' ';// to remove duplicate characters
				}
			
			}
		
			if(ch[i]!=' ')	
			{	
				
				System.out.println(ch[i] +" " +count);
		
			}
			if(count>maxcount)
			{
				maxcount=count;
			}
		}
		//System.out.println(ch[i] + " " +maxcount);
		
	}
}
