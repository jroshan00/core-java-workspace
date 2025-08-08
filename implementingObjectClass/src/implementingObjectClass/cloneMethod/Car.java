package implementingObjectClass.cloneMethod;

public class Car implements Cloneable{
	
	
	/*
	 * Case 1 : when same instance of Car is returned by
	 * the clone method.
	 */
//	@Override
//	public Object clone(){
//		return this;
//	}
	
	/*
	 * Case 1 : when same new instance of Car is returned by
	 * the clone method.
	 */
	@Override
	public Object clone(){
		return new Car();
	}

}
