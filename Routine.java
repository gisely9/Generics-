
public class Routine {
	// create a function that takes an array , length  and returns the position of the element in the array 
	
	public static <Test> int elementPos(Test arr[], Test element) {
		
		for (int i=0; i<arr.length; i++) {
			
			//checking the index of the element 
			
			if (arr[i].equals(element)) {
				return i;
				
			}
		}
		//the function will return -1 if there is any error 
		
		return -1;
	}
	//creating a generic greater than function that takes two objects as arguments 
	
    public static <Test extends Number> Test greaterThan(Test t1, Test t2) {
    	//check if first argument is null
    	
	if(t1== null) {
		//return the second argument 
		return t2;
	}
	// compare the values 
	if (t1.intValue()> t2.intValue()) {
		return t1;
	  } else {
		return t2;
	}
}
// main function 
    
public static void main(String[] args) {
	
//passing the argument values 
	
	System.out.println(Routine.<Integer>elementPos(new Integer[] {2,4,6,8},6));
	System.out.println(Routine.<Integer>greaterThan(10,20));
  }
}
