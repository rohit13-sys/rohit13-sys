//Author name:Rohit khatwani
//Date:16-06-2021
//Version:1.0

package Day_5.com.pheonix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String args[]) {

		System.out.println("Sun");
		Sun sun=Sun.newInstance();
		sun.giveLight();
		Sun sun1=sun.newInstance();
		sun1.giveLight();
		
		System.out.println("\n*******************************\n");
		
		System.out.println("Earth");
		Earth earth=Earth.newInstance();
		
		earth.createLight();
		Earth earth1=Earth.newInstance();
		earth1.createLight();
		
		System.out.println("\n*******************************\n");
		
		System.out.println("PrimeMinister");
		PrimeMinister primeMinister=PrimeMinister.newInstance();
		primeMinister.serveNation();
		PrimeMinister primeMinister1=PrimeMinister.newInstance();
		primeMinister1.serveNation();
		
		
		System.out.println("\n*******************************\n");
		
		System.out.println("President");
		President president=President.newInstance();
		president.representNation();
		President president1=President.newInstance();
		president1.representNation();
	}

}
