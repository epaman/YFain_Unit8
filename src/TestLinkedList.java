
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList<String> passengerList = new LinkedList();
		
		passengerList.add("Alex Smith");
		passengerList.add("Mary Lou");
		passengerList.add("Sim Monk");
		
		// Get the list iterator and print every element of the list
		ListIterator<String> iterator = passengerList.listIterator();
		
		System.out.println(iterator.next());
//		passengerList.add("VIP Customer");
		iterator.add("VIP Customer");
		iterator.previous();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());

	}

}
