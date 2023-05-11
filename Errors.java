class Errors{
	public static void main(String[] args){
		int i = 10;
		/*
		byte b = 200; - caught by compiler. Value too large for one byte.
		b = 10; - caught by compiler; class error, cannot find symbol
			Undefined variables report errors like that. I cannot get Java to
			spit out an Undefined Variable error. 
		String test = 97; - caught by compiler; incompatible types.
		Forbidden words in unexpected places will trip up the compiler. Won't compile.
		*/
		
		int k = 'a'; //not an error. Ascii value for 'a' is assigned to k.
		
		/*
		String word = "Four";
		char[] myArray = word.toCharArray();
		System.out.println(myArray[5]); - out of bounds exceptions occur at runtime
		
		int b = 10/0; - caught at runtime for some reason.
		*/
	}
}
