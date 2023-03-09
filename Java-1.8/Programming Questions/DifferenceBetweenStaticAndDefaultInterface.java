package InterviewQuestions;

@FunctionalInterface
interface ABC{
	void display();
	
	default void defaultMethod() {
		System.out.println("In default Method");
	}
	
	static void staticMethod() {
		System.out.println("In static Method");
	}
}


class Test implements ABC{

	@Override
	public void display() {
		System.out.println("In abstract method");
	}
	
//	@Override
//	public void defaultMethod() {
//		System.out.println("In default Method In Test Class");
//	}
	
//	@Override
//	public void staticMethod() {
//		
//	}
	
}

public class DifferenceBetweenStaticAndDefaultInterface {

	public static void main(String[] args) {
		ABC abc=new Test();
		abc.defaultMethod();
		
	}

}
