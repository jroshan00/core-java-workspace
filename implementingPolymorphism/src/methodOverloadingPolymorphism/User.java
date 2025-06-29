package methodOverloadingPolymorphism;

public class User {
	
	public static void main(String[] args) {
		Game g=new Game();
		TwoDShape t=g.selectShape();	
		t.area();
	}
	

}
