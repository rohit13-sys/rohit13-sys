package Day_5.com.pheonix.designpatterns.singleton;

public class Sun {
	private static Sun ob;

	private Sun() {
		
	}

	public static Sun newInstance(){
		if(ob==null){
			ob=new Sun();
		}
		return ob;
	}
	public void giveLight() {
		
			
			System.out.println("Sun gives light");
		
	}
}
