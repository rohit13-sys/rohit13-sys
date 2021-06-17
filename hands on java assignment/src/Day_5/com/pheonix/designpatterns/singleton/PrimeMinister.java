package Day_5.com.pheonix.designpatterns.singleton;

public class PrimeMinister {

	private static PrimeMinister ob;

	private PrimeMinister() {
		
	}

	public static PrimeMinister newInstance(){
		if(ob==null){
			ob=new PrimeMinister();
		}
		return ob;
	}
	public void serveNation() {
		
			
			System.out.println("President serves Nation");
		
	}
}
