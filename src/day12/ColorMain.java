package day12;

public class ColorMain {

	public static void main(String[] args) {
		Green g = new GreenImpl();
		System.out.println(g.greenColor());
		
		Red r = new RedImpl();
		System.out.println(r.redColor());
		
		ColorImpl c = new ColorImpl();
		System.out.println(c.greenColor());
		System.out.println(c.redColor());
	}

}


interface Green{
	public String greenColor();
}
class GreenImpl implements Green{
	@Override
	public String greenColor() {
		return "초록색입니다★";
	}
	
}

interface Red{
	public String redColor();
}
class RedImpl implements Red{

	@Override
	public String redColor() {
		return "빨간색입니다★";
	}
	
}

class ColorImpl implements Green, Red {

	@Override
	public String greenColor() {
		// TODO Auto-generated method stub
		return "초록색입니다";
	}
	@Override
	public String redColor() {
		return "빨간색입니다";
	}
	
}