public class TestingPrimitives{
	public static void main(String[] args){
		System.out.println("You ran testingPrimitives succesfully!");
		int i = 10; //Assign primitive value 10
		Integer iW = 10; //Make reference variable pointing to an integer 10
		if (i == iW){
			System.out.println("The value of i and iW is the same");
		} else{
			System.out.println("The value of i and iW is not the same");
		}
		
		if (iW.equals(i)){
			System.out.println("The variable i and iW are the same");
		} else{
			System.out.println("The variable i and iW are not the same");
		}
		/*iW.equals(i) is true. I presume iW is unboxed, or i is boxed, before
		they are compared in the equals method. Didn't look into how equals works.*/
	}
}
