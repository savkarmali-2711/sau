import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample {

	public static void main(String[] args) {
		
		String [] stringArray= {"ab","ef","cd"};
		
		System.out.println("Sort StringArray using > Lambda expression");
		
		Arrays.sort(stringArray, ( a, b)-> a.compareTo(b));
		
		for(String str : stringArray) {
			System.out.println(str +" ");
		}
	}

}
