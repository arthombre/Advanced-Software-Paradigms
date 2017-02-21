import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Akshay
 *
 */
public class Queue implements Cloneable {
	// FIFO

	private List<String> que = new ArrayList<String>();
	private List<String> que1 = new ArrayList<String>();
	private List<String> que2 = new ArrayList<String>();

	public void enqueue(String item, int pri) {
		// add element at the beginning of the queue
		System.out.println("Adding elements into Queue: ");
		System.out.println("adding: " + item);
		System.out.println("pri: " + pri);
		que.add(0, item + ";" + pri);
		que1.add(0, item + ";" + pri);
		que2.add(0, item + ";" + pri);
		System.out.println(que);
	}

	public void dequeue() {
		if (que.isEmpty()) {
			System.out.println("Deque underflow!! unable to remove.");
			return;
		} else {

			int max = 0;
			int temp = 0;
			String maxPriString = null;
			// Max priority

			for (int i = 0; i < que.size(); i++) {

				if (max <= Integer.parseInt(que.get(i).split(";")[1])) {
					max = Integer.parseInt(que.get(i).split(";")[1]);
					maxPriString = que.get(i).split(";")[0];
					temp = i;
				}
			}

			System.out.println("String and Max priority element is " + maxPriString + " and " + max + " respectively");

			// remove an item from the queue
			String rem = que.remove(temp);
			System.out.println("removed " + rem);
			System.out.println(que);
		}
	}

	public void empty() {
		System.out.println("Clearing queue");
		que.clear();
		System.out.println("Cleared queue: " + que);
	}

	// Defined clone method in Department class.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	class Client {

		public void duplicate() throws CloneNotSupportedException {

			try {
				System.out.println();
				System.out.println("Using clone() to clone an existing list and run the methods on the clone");
				Queue queA = new Queue();
				Queue cloA = (Queue) queA.clone();
				System.out.println("Working with Cloned Queue");
				cloA.enqueue("zxc", 3); // Add String and its priority
				cloA.enqueue("asd", 2);
				cloA.enqueue("qwe", 1);
				cloA.enqueue("tyu", 4);
				cloA.enqueue("fgh", 5);

				cloA.dequeue(); // Returns element with max priority and deletes it from list
				cloA.dequeue();

				cloA.empty(); // Clears list completely.

			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void equate(List<String> que1,List<String> que2){
			//Check if both lists are equal or not.
			System.out.println();
			System.out.println("Using equal() to check whether 2 lists are equal or not");
			System.out.println("ArrayList 1: "+que1);
			System.out.println("ArrayList 2: "+que2);
			if(que1.equals(que2)){
				System.out.println("Both Arraylist contain same data");
			}else{
				System.out.println("Arraylist contain different data");
			}
			
		}
		
		public void convertToString(List<String> que){
			System.out.println();
			System.out.println("Using toString() to convert and concatinante list elements into a string");
			String fullList = "";
			List<String> queCheck = new ArrayList<String>();
			queCheck = que;
			for (int m = 0; m < queCheck.size(); m++) {
				fullList = fullList.concat(queCheck.get(m).toString()+" ");
			}
			System.out.println("Using toString(), the fullList is "+fullList);
		}

		
		public void checkHashCode(List<String> que1,List<String> que2){
			//Check if both lists are equal or not by hashcode.
			System.out.println();
			System.out.println("Using hashCode() to check if the lists are equal or not by computing their hashCode values");
			System.out.println("ArrayList 1 hashCode: "+que1.hashCode());
			System.out.println("ArrayList 2 hashCode: "+que2.hashCode());
			if(que1.hashCode()==que2.hashCode()){
				System.out.println("Both Arraylist have same data based on their hashCode values");
			}else{
				System.out.println("Arraylist contain different data based on their hashCode values");
			}
			
		}
		
	}

	public static void main(String a[]) {

		Queue addeq = new Queue();
		addeq.enqueue("Abc", 3); // Add String and its priority
		addeq.enqueue("PQR", 4);
		addeq.enqueue("mno", 5);
		addeq.enqueue("zxs", 1);
		addeq.enqueue("sdc", 2);

		addeq.dequeue(); // Returns element with max priority and deletes it from list
		addeq.dequeue();

		addeq.empty(); // Clears list completely.

		Client c = new Queue().new Client();
		System.out.println("Calling methods from Client class");
		
		try {
			c.duplicate();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.equate(addeq.que1, addeq.que2);
		
		c.convertToString(addeq.que1);

		c.checkHashCode(addeq.que1, addeq.que2);
	}

}
