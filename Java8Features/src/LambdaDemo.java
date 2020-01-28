
interface A
{
	//void show();
	void show(int i);
}

/*class Xyz implements A
{
	public void show()
	{
		System.out.println("Hello");
	}
}*/

public class LambdaDemo {

	public static void main(String[] args) {

		/*A obj;
		obj=new A()                   // Anonymous Inner Class
				{
			      public void show()
			      {
			    	  System.out.println("Hello");
			      }
				};
				*/
		
		//A obj=() ->{System.out.println("hello");};
		            //Or
		A obj=(int i)->System.out.println("Hello"+i);
		
		obj.show(6);

	}

}
