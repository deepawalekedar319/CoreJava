class  ABC{                                                              
	static int a = 10;
	int b = 20;
	public static void main(String[] args) {
		System.out.println("Main");
		//System.out.println(b);
		System.out.println(a);
		ABC a = new ABC();
		System.out.println(a.b);
		System.out.println(a.a);
		System.out.println(a);
		System.out.println(a.a);
	}
}
