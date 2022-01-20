class NonStaticMethod {
	void m1(){
		System.out.println("m1");
	}
	public static void main(String[] args) {
		//m1(); Gives Error
		System.out.println("Main");
		NonStaticMethod m1  = new NonStaticMethod();
		NonStaticMethod m2  = new NonStaticMethod();
		NonStaticMethod m3  = new NonStaticMethod();
		m1.m1();
		m2.m1();
		m3.m1();
	}
}
