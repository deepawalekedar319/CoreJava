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
class MultipleMainMethods {
	public static void main(String[] args) {
		System.out.println("MultipleMainMethods.main()"	);
		A.m1();
		B.m1();
		A.main(new String[0]);
		B.main(new String[0]);
	}
}
