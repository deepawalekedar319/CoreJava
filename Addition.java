class Addition {
	static void add(int a, int b){
		int c = a+b;
		System.out.println("Addition of two number :: " +  c);
	}	
	static void add(int a, int b,int c){
		int d = a+b+c;
		System.out.println("Addition of three number :: " +  d);
	}
	static void add(int a, String b){
		System.out.println("String and Integer Addition :: " + a + b);
	}
	public static void main(String[] args) {
		System.out.println("Main() ::::: ");
		add(10,20);
		add(10,20,30);
		add(10,"Kedar");
		/* Exectuin order based on the calling of the methods */ 
	}
}
/* Method overloading is the process of writing the method with same name but with differnt parameters, List, Types, position
	They are called depending on the arguments we passed...  */