package methods;

class Whatsapp1{
	String whatsapp_name="Whatsapp";
	
	void voicecall(){
		System.out.println("voice calling from whatsapp");
	}
	void videocall(){
		System.out.println("video calling from whatsapp");
	}
}

class Facebook1{
	String facebook_name="Facebook";
	
	void like(){
		System.out.println("likes from facebook");//System is class || out is variable || println is method
		//Whatsapp1.videocall();
	}
	void share(){
		// new Whatsapp1().whatsapp_name;//can call method but can't call non static variable without storing to reference variable or printing
		System.out.println( new Whatsapp1().whatsapp_name);
		System.out.println("sharing from facebook");
	}
}

class Instagram1{
	String instagram_name="instagram";	
	
	void follow(){
		System.out.println("follow instagram");
	}
	void pics(){
		System.out.println("pics from intagram");
	}
	void share(){
		new Facebook1().share();
	}
}

public class SocialNonstatic {
	void disp(){
		System.out.println("displaying from main class");
	}

	public static void main(String[] args) {
		new SocialNonstatic().disp(); //calling by object without reference variable
		new Instagram1().follow();
		new Instagram1().pics();
		new Facebook1().like();
		System.out.println(new Facebook1().facebook_name);
	}
}
