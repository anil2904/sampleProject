/*public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.print("abc");
	}
	public static void main(String[] args) {
	//MyClass mc= new MyClass();
	//mc.log("test default method..");
	
	Interface1 i1= (String s)-> "Hi"+s;
     System.out.println(i1.method1("anil"));
	}
	
}*/