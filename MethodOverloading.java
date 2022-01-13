class MethodOverloading {
	static void m1(){
		System.out.println("m1 0 - param");
	}	
	static void m1(int a){
		System.out.println("m1 1 - param");
	}
	static void m1(int a, int b){
		System.out.println("m1 2 - param");
	}
	static void m1(String s){
		System.out.println("m1 String - param");
	}
	public static void main(String[] args) {
		System.out.println("Hello World!");
		m1();
		m1(10);
		m1(10,20);		/* Exectuin order based on the calling of the methods */ 
		m1("Kedar");
		m1();
	}
}
/* Method overloading is the process of writing the method with same name but with differnt parameters, List, Types, position
	They are called depending on the arguments we passed...  */