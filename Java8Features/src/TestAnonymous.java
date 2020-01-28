//creating @FunctionalInterface
@FunctionalInterface
interface MyInterface{
	public abstract void m1();
}

public class TestAnonymous{
	public static void main(String []args) {
		
		//write Anonymous inner class to implement method of MyInterface (@FunctionalInterface)
		MyInterface mi=new MyInterface() {
			@Override
			public void m1() {
				System.out.println("aaa");
			}
		};
		mi.m1();	
		
	}
}