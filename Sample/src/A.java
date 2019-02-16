class B{
public int getVal(){
	
	try{
		
		int b= 1/0;
		System.out.println("in try..");
		
		return b;
	}
	catch(Exception e){
		e.printStackTrace();
		throw new ArithmeticException();
	}
	finally{
		return 3;
	}
	
}	

	
}
public class A {

	 
	public static void main(String[] args) {
B b=new B();
System.out.println(b.getVal());
	}

}
