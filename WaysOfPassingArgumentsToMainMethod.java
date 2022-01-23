class A{
	static void m1() {
		System.out.println("A.m1()");
	}
	public static void main(String[] args) {
		System.out.println("A.main()");
	}
}
class B{
	static void m1() {
		System.out.println("B.m1()");
	}
	public static void main(String[] args) {
		System.out.println("B.main()");
	}
}
class WaysOfPassingArgumentsToMainMethod {
	public static void main(String[] args) 	{
		System.out.println("WaysOfPassingArgumentsToMainMethod .main()");
		A.main(args);
		B.main(args);
		B.main(new String[0]);
		A.main(new String[0]);
	}
}
