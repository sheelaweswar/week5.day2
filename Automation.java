package week5.day2;

public class Automation extends MultipleLangauge implements TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation lang=new Automation();
		lang.Java();
		lang.python();
		lang.ruby();
		lang.Selenium();
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("This is for Ruby");
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("This is for Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("This is for JAVA");
		
	}

}
