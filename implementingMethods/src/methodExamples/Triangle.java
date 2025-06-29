package methodExamples;

public class Triangle {
	public static void getArea(){
		double a=2;
		double b=2;
		double c=2;
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of square is : "+area);
	}

	public static void getPara(){
		double a=2;
		double b=2;
		double c=2;
		double para=a+b+c;
		System.out.println("Parameter of Square is : "+para);
	}

	public static void main(String[] args){
		getArea();
		getPara();

	}

}
