class UserDefinedMethod3
{
	static void m1(){
		System.out.println("m1()");
	}	
	static void m2(){
		System.out.println("m2()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
		m1();
		m2();		/* Exectuin order based on the calling of the methods */
		m1();
		m2();
	}
}
