package day18;

public class NestedGenericMethodExample {

	public static void main(String[] args) {
		GenericClass1<String> gc = new GenericClass1<String>();

		gc.printGenericMethodArgInfo(10L);
		gc.printGenericMethodArgInfo('A');
		
		//gc.printMethodArgInfo(10L); // error 
		
	}

}


class GenericClass1<T>{
	
	public void printMethodArgInfo(T args) {
		System.out.print("Argument Type is " + args.getClass());
		System.out.println(" / Value is " + args.toString());
	}

	public <T> void printGenericMethodArgInfo(T arg) {
		System.out.print("Argument Type is " + arg.getClass());
		System.out.println(" / Value is " + arg.toString());
	}
}