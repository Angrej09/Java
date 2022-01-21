package interfacepkg;



interface WebDriver1
{
	void get();
}

class ChromeDriver1 implements WebDriver1
{

	@Override
	public void get() {
		System.out.println("Chrome laucnhed");
		
	}
}

 class IEDriver implements WebDriver1
{

	@Override
	public void get() {
		System.out.println("IE launched");
		
	}

}
  public class BrowerLaunch implements WebDriver1{

	public static void main(String[] args) {
	
		//BrowerLaunch b=new BrowerLaunch();
		WebDriver1 wd= new BrowerLaunch();
		wd.get();
		/*b.get();
		IEDriver ie=new IEDriver();
		ie.get();
		ChromeDriver cd=new ChromeDriver();
		cd.get();*/
		
	}

	@Override
	public void get() {
		System.out.println("mozilla launch");
		
	}	
}
