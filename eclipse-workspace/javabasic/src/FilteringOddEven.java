import java.util.*;
import java.util.stream.Collectors;

interface OddEven{
	void oddeven(List<Integer> arr);
}

public class FilteringOddEven {

	public static void main(String[] args) {
	  List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	  
	  OddEven newArr = (n)->{
	
		  List<Integer>  resultEven = arr.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
          System.out.println("even :"+ resultEven);
          List<Integer>  resultOdd = arr.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
          System.out.println("odd : "+resultOdd);
	  };
	 newArr.oddeven(arr);
	}

}
