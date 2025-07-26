package implementingAnnotations.inheritedAnnotation;

public class Main {
	public static void main(String[] args) {

		boolean b=SubUser.class.isAnnotationPresent(Role.class);
		System.out.println(b?"Inherited":"Not Inherited");
		
		System.out.println("===============");
	
		Role roleAnnotation=User.class.getAnnotation(Role.class);
		System.out.println(roleAnnotation.value());
	
	}

}
