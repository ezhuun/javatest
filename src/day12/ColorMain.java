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
		return "�ʷϻ��Դϴ١�";
	}
	
}

interface Red{
	public String redColor();
}
class RedImpl implements Red{

	@Override
	public String redColor() {
		return "�������Դϴ١�";
	}
	
}

class ColorImpl implements Green, Red {

	@Override
	public String greenColor() {
		// TODO Auto-generated method stub
		return "�ʷϻ��Դϴ�";
	}
	@Override
	public String redColor() {
		return "�������Դϴ�";
	}
	
}