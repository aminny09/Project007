package collectionshit;
import java.util.Map;
import java.util.HashMap;

public class EmployeeId {

	public static void main(String[] args) {
		
		Map<String,String> employee=new HashMap<String,String>();
	
		employee.put("a1234","Donald Trump");
		employee.put("a1235","Brack Obama");
		employee.put("a1236","Gorge W.Bush");
		employee.put("a1237","Bill Gates");
		employee.put("a1238","Regan");
		
		
		System.out.println("The map is:"+ employee);
		System.out.println("is the key a1234 exists");
		
		if(employee.containsKey("a1234")) {
			System.out.println("Yes the associate name: " + employee.get("a1234"));
		}
		else{
			System.out.println("Invalid Test");
		}
		System.out.println("Is a1234");
		
		if(employee.containsKey("a12345")) {
			System.out.println(employee.get("a12345"));
		}
		
		else {
			System.out.println("No invalid test");
					
		}
				
	}
}
