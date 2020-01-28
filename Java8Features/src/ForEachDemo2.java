import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class ConsImpl implements Consumer<Integer>
{
	@Override
	public void accept(Integer i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}	
}*/

public class ForEachDemo2 {

	public static void main(String[] args) {
		
		List<Integer> values=Arrays.asList(3,4,5,6,8);
		
		/*Consumer<Integer> c=new Consumer<Integer>()
		{
			public void accept(Integer i)
			{
				System.out.println("Hii Hello ");
			}
			
		};*/
		Consumer<Integer> c=(Integer i) -> System.out.println(i);
		values.forEach(c);
	}
}
