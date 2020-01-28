interface B
{
	void m1();
}

public class Demo {

	public static void main(String[] args) {
		
		B obj=new B() 
		{
			@Override
			public void m1() 
			{
				// TODO Auto-generated method stub
				System.out.println("Hiiii");
			}
		};
		/*B obj=()->System.out.println("hii");*/
		obj.m1();
	}
}
