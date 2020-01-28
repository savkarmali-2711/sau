
//create @FunctionalInterface
@FunctionalInterface
interface MyInterface1{
	public abstract void m1();

}

public class TestLambda {

	public static void main(String[] args) {
		
		//write LAMBDA EXPRESSION to implement method of interface
		MyInterface mi=()->{
			System.out.println("bbb");
		};
		mi.m1();
	}

}
