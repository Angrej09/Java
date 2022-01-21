package methods;

/*class whatsapp
{
	static String whatsapp_name="whatsapp";
	
	static void voicecall()
	{
		System.out.println("voice calling from whatsapp");
	}
	static void videocall()
	{
		System.out.println("video calling from whatsapp");
	}
	
}
class facebook
{
	static String facebook_name="Facebook";
	static String whatsapp_name=whatsapp.whatsapp_name;
	static void like()
	{
		System.out.println("likes from facebook");//System is class || out is variable || println is method
		whatsapp.videocall();//classname.method is calling from whatsapp class
	}
	static void share()
	{
		System.out.println("sharing from facebook");
	}

}

class instagram
{
	String instagram_name="instagram";
	
	static void follow()
	{
		System.out.println("follow instagram");
	}
	static void pics()
	{
		System.out.println("pics from intagram");
	}

}

public class PracticeStatic {
	
	static void disp()
	{
		System.out.println("displaying from main class");
	}

	public static void main(String[] args) {
		disp(); //directly
		instagram.follow();//classname.method
		instagram.pics();//classname.method
		facebook.like();//classname.method
		String facebook_name=facebook.facebook_name;
		System.out.println(facebook_name);
		String whatsapp_name=facebook.whatsapp_name;
		System.out.println(whatsapp_name);
		
		
	}

}*/
/*class PracticeStatic
{
	static int x=10;//single copy for whole class
	int y=20;
	public static void main(String[] args)
	{
		PracticeStatic t1=new PracticeStatic();
		t1.x=888;
		t1.y=999;
		System.out.println(t1.y);//--
		PracticeStatic t3=new PracticeStatic();
		System.out.println(t3.y);
		PracticeStatic t2=new PracticeStatic();//
		System.out.println(t2.x);// 888
		System.out.println(t2.y);//-----interview question
		
		//https://www.topperskills.com/tutorials/java/java-static-variable-example.html
	}
}
*/



class ATest{
	
	static int i=10;
	int j=20;
	
	static BTest obj_B=new BTest();
}

class BTest{
	
	int i=30;
	static int j=40;
	ATest obj_A =new ATest();
	
	void add()
	{
		System.out.println(ATest.i+BTest.this.i+obj_A.j+j);
	}
	
	static void sub()
	{
		/*System.out.println(ATest.obj_B.obj_A.j);
		System.out.println(BTest.j);
		System.out.println(ATest.i);
		System.out.println(ATest.obj_B.i);*/
		System.out.println(ATest.obj_B.obj_A.j+BTest.j-ATest.i-ATest.obj_B.i);
	}
}

public class PracticeStatic{
	
	public static void main(String[] args){
		ATest.obj_B.add();
		BTest.sub();
		
	}
}
