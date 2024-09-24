package week6Day3;

public class Automation  extends MulipleLanguage implements  Language,TestingTool{	
	
	
	
	@Override
	public void java() {
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}


@Override
public void selenium() {
	System.out.println("selenium");
}
public static void main(String[] args) {
	
	Automation obj= new Automation();
	obj.java();
	obj.ruby();
	obj.python();
	obj.selenium();
	
	
}

}

	

