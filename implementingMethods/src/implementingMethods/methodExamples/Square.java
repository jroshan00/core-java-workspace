package implementingMethods.methodExamples;

public class Square {
	public static void getArea(){
		double s=2;
		double area=s*s;
		System.out.println("Area of square is : "+area);
	}

	public static void getPara(){
		double s=2;
		double para=4*s;
		System.out.println("Parameter of Square is : "+para);
	}

	public static void main(String[] args){
		getArea();
		getPara();
	}
}
