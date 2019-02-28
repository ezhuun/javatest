package day18;

public class GenericInterfaceExample {

	public static void main(String[] args) {
		GenericClass<Integer> gInteger = new GenericClass<Integer>();
		GenericClass<String> gString = new GenericClass<String>();
		
		gInteger.setValue(10);
		gString.setValue("Text");
		Integer a = new Integer(10);
		System.out.println(gInteger.getValueType());
		System.out.println(gString.getValueType());
	}

}

interface GenericInterface<T>{
	public void setValue(T x);
	public String getValueType();
}

class GenericClass<T> implements GenericInterface<T>{
	private T value;
	
	@Override
	public void setValue(T x) {
		value = x;
	}

	@Override
	public String getValueType() {
		return value.getClass().toString();
	}
	
}