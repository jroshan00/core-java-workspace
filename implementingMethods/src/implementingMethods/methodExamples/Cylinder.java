package implementingMethods.methodExamples;

public class Cylinder {
	public static void totalSurfaceArea(){
		double r=20;
		double h=62.55;
		double area=2*3.14*r*(r+h);
		System.out.println("totalSurfaceArea of cyclinder is : "+area);
	}

	public static void lateralSurfaceArea(){
		double r=20;
		double h=62.55;
		double area=2*Math.PI*r*h;
		System.out.println("lateralSurfaceArea of cyclider is : "+area);
	}

	public static void totalVolume(){
		double r=20;
		double h=62.55;
		double area=Math.PI*r*r*h;
		System.out.println("totalVolume of cyclider is : "+area);
	}

	public static void main(String[] args){
		totalSurfaceArea();
		lateralSurfaceArea();
		totalVolume();
	}
}
