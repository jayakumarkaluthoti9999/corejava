
// cObj is a Collection of Integers, say 1,2,3,4,5
//Iterator<Integer> it = cObj.iterator();

//..

//processItr(it);// assume it is blackbox to you,
//say prints all items in order.

public class Test1 {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,7};
		 for (int i = 0; i < array.length; i += 2)
	            System.out.println( array[i]) ;
	}
	
}
