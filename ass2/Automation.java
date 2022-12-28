package week5.d2.ass2;

public class Automation extends MultipleLanguage implements Language, TestTool 
{

	public static void main(String[] args) 
	{
		Automation obj=new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		
		

	}

	public void Java() {
		System.out.println("java");
		
	}


	public void Selenium() 
	{
		System.out.println("selenium");

		
		
	}
	public void ruby() {
		
	}

	
	

	

}