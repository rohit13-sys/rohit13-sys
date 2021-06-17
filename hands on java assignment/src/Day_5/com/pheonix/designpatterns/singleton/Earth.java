package Day_5.com.pheonix.designpatterns.singleton;

public class Earth {

	private static Earth ob;

	private Earth() {
		
	}

	public static Earth newInstance(){
		if(ob==null){
			ob=new Earth();
		}
		return ob;
	}
	public void createLight() {
		
			
			System.out.println("Earth creates life");
		
	}
}
