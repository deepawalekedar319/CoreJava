class A{
	static void m1(){
		System.out.println("A Class m1()");
	}
	void m2(){
		System.out.println("A Class m2()");
	}
}

class B{
	static void m1(){
		System.out.println("B Class m1()");
	}
	void m2(){
		System.out.println("B Class m2()");
	}
}
class C 
{
	static void m1(){
		System.out.println("C Class m1()");
	}
	void m2(){
		System.out.println("C Class m2()");
	}
	public static void main(String[] args) {
			m1(); // C class m1 is called
			//m2(); // Gives error since object not created
			 A.m1();
			B.m1();
			 
			A a = new A();
			a.m2();
			a.m1();
			B b = new B();
			b.m2();
			b.m1();
			C c = new C();
			c.m2();
			c.m1();
	}
}
