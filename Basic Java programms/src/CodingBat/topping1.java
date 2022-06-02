package CodingBat;
/*Given a map of food keys and topping values, modify and return the map as follows:
 *  if the key "ice cream" is present, set its value to "cherry". 
 *  In all cases, set the key "bread" to have the value "butter".


topping1({"ice cream": "peanuts"})  {"bread": "butter", "ice cream": "cherry"}
topping1({})  {"bread": "butter"}
topping1({"pancake": "syrup"})  {"bread": "butter", "pancake": "syrup"}*/

import java.util.HashMap;

public class topping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("ice cream", "peanuts");
		map.put("bread", "butter");
		if(map.containsKey("ice cream"))
		{
			
			map.replace("ice cream", "cherry");
		}
		System.out.println(map);
	}

}
