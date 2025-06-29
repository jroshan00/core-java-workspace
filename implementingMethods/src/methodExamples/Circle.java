package methodExamples;

public class Circle {
	public static void getArea(){
		double r=2;
		double pi=3.14;
		double area=pi*r*r;
		System.out.println("Area of circle is : "+area);
	}

	public static void getPara(){
		double r=2;
		double pi=3.14;
		double para=2*pi*r;
		System.out.println("Parameter of circle is : "+para);
	}

	public static void main(String[] args){
		getArea();
		getPara();

	}

}
