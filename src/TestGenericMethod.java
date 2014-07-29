
import java.util.LinkedList;

public class TestGenericMethod {
	
	public static LinkedList<Employee> copyEmployess(LinkedList<? extends Employee> data) {
		LinkedList<Employee> result = new LinkedList<Employee>();
		for (Employee e : data) {
			result.add(new Employee(e.getName()));
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		// Original employees
		LinkedList<RetiredEmployee> data = new LinkedList<RetiredEmployee>();
		
		RetiredEmployee emp1 = new RetiredEmployee("Mark Smith", 1700.0);
		RetiredEmployee emp2 = new RetiredEmployee("Nick Martin", 1750.0);
		RetiredEmployee emp3 = new RetiredEmployee("John Stuart", 1500.0);
		
		data.add(emp1);
		data.add(emp2);
		data.add(emp3);

		// Cloned employees
		System.out.println("Cloned employees:");
		LinkedList<Employee> employees = copyEmployess(data);
		for (Employee e : employees) {
			System.out.println(e.getName());
		}
	}

}
