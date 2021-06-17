package Day_5.com.pheonix.designpatterns.singleton;

public class President {

	private static President ob;

	private President() {
		
	}

	public static President newInstance(){
		if(ob==null){
			ob=new President();
		}
		return ob;
	}
	public void representNation() {
		
			
			System.out.println("President represent Nation");
		
	}
}
