package usingGenericsClass;

public class Accept<T> {
	T t;
	
	public Accept() {
		// TODO Auto-generated constructor stub
	}
	
	Accept(T t){
		this.t=t;
	}
	
	void print() {
		System.out.println(t);
	}
	
	T get() {
		
		return t;
	}
	
	public static void main(String[] args) {
		Accept a1=new Accept("Rohan");
		a1.print();
		
		Accept a2=new Accept(123);
		a2.print();
		
		Accept a3=new Accept(12.3);
		a3.print();
		
		Accept a4=new Accept('a');
		a4.print();
		
		Accept a5=new Accept(0011);
		a5.print();
		
		Accept a6=new Accept(0x11df);
		a6.print();
		
		Accept a7=new Accept(0b0011);
		a7.print();
		
		Accept a8=new Accept('2');
		a8.print();
		
		Accept a9=new Accept(new Accept("Hello World"));
		a9.print();
		
		Accept a10=new Accept(new Accept("Hello World").get());
		a10.print();
	}

}
