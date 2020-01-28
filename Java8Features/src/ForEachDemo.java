import java.util.Arrays;
import java.util.List;
/*
 * forEach() Method in java 8
 */
public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,8);
		
		/*for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		*/
		
		/*for(int i:values)
		{
			System.out.println(i);
		}*/
		
		values.forEach(i -> System.out.println(i));   //Lambda  // Consumer
	}
}
