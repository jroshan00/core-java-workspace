package implementingEnum.enumImplementingInterface;

public enum Language implements Greetable {
	ENGLISH{
		@Override
		public void greet() {
			System.out.println("Hello!!");
		}
	},
	
	SPANISH("Spanish language is being used"){

		@Override
		public void greet() {
			System.out.println("HOLA");
		}
		
	},
	
	HINDI{
		@Override
		public void greet() {
			System.out.println("Namaste!!");
		}
	};
	
	private String msg;
	
	//Default Constructor
	private Language() {
		System.out.println("Default Language construtor called...");
	}
	
	//Parameterized Constructor
	private Language(String msg) {
		this.msg=msg;
		System.out.println("Parameterized Language construtor is called...");
	}
	
	public String getMessage() {
		return msg;
	}
}
