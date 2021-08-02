import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UnModifiablec 
{
	public static void main(String[] args) {
		System.out.println("Start");
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(4);
		arr.add(2);
		arr.add(1);
		Collection<Integer> unmodifiableArr = Collections.unmodifiableCollection(arr);
		//methodCall(unmodifiableArr);
		methodCall(arr);
		
	}

	private static void methodCall(Collection<Integer> unmodifiableArr) {
		unmodifiableArr.add(22);
		System.out.println(unmodifiableArr);
	}
}
