package string;

public class thunderRev {

	public static void main(String[] args) {

		String s="taste the thunder";
		
		String split[]=s.split(" ");
		for(int i=0;i<split.length;i++)
		{
			char ch[]=split[i].toCharArray();
			int count=0;
			for(int k=0;k<ch.length;k++)
			{
				
				if(ch[k]=='t')
					count++;				
			}
			if(count==2)
			{
				for(int j=0;j<ch.length;j++)
					System.out.print(ch[j]);
			}
			
			else if(count!=2)
			{
				System.out.print(" ");
				for(int j=ch.length-1;j>=0;j--)
				{
										
					System.out.print(ch[j]);
				}
				System.out.print(" ");
				
			}
		}
	}

}
