package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,30,30,20,10,90));
//		HashSet<Integer> dataSet = new HashSet<Integer>(datas);
//		datas = new ArrayList<Integer>(dataSet);
//		System.out.println(datas);
		
		
		
				HashSet<String> bloodTypeSet = new HashSet<>();
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("B");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		
		if(bloodTypeSet.contains("A")) {
			System.out.println("있음");
		}
		
//		System.out.println(bloodTypeSet);  //toString 재정의가 되어있다.
//		
//		//
//		Iterator<String> iter = bloodTypeSet.iterator();
	}
}
