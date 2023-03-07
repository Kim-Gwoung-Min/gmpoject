package hashMapTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONArrayTest {
	public static void main(String[] args) {
//		Product product1 = new Product("족발", 39000, 10);
//		Product product2 = new Product("보쌈", 45000, 10);
//		
////		전체상품 index로 관리!! key값 정하기 힘드니까 
//		
//		JSONObject productJSON1 = new JSONObject(product1);
//		JSONObject productJSON2 = new JSONObject(product2);
//		
//		JSONArray products = new JSONArray();
//		products.put(productJSON1);
//		products.put(productJSON2);
//		System.out.println(products.toString());
		// [] Array 인덱스가생김 가져올때 ,key index 배열로 가져온다
		
		
		ArrayList<Product> productList = new ArrayList<Product>(Arrays.asList(new Product("족발", 39000, 10),new Product("보쌈", 45000, 10)));

		ArrayList<JSONObject> productJSONs = new ArrayList<JSONObject>();
		
		productList.stream().map(product -> new JSONObject(product)).forEach(productJSONs::add);
		
		JSONArray products = new JSONArray(productJSONs);
		
		System.out.println(products.toString());
		
		
		for(int i=0; i< products.length(); i++) {
			try {
//				System.out.println(products.get(i));
//			System.out.println(((JSONObject)products.get(i)).get("productName"));
				System.out.println(products.getJSONObject(i).get("productName"));
				System.out.println(products.getJSONObject(i).get("productPrice"));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		
		}
	}
}
