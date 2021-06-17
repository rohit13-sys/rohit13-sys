//Author name:Rohit khatwani
//Date:16-06-2021
//Version:1.0

package Day_5.com.pheonix.interfaces.main;

import Day_5.com.pheonix.interfaces.Movable;
import Day_5.com.pheonix.living.pet.Cat;
import Day_5.com.pheonix.living.wild.Tiger;
import Day_5.com.pheonix.machines.HumanRobot;
import Day_5.com.pheonix.planets.Earth;
import Day_5.com.pheonix.planets.Jupitor;
import Day_5.com.pheonix.vehicles.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		Movable move;

		System.out.println("Problem statement I:\n");
		// Earth object
		move = new Earth();
		((Earth) move).setNoOfMoons(1);
		System.out.println(move);
		((Earth) move).revolve();
		((Earth) move).rotate();
		((Earth) move).move();
		System.out.println("Status of life:" + ((Earth) move).supportsLife());

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement II:\n");
		// Jupitor object
		move = new Jupitor();
		((Jupitor) move).setNoOfMoons(79);
		System.out.println(move);
		((Jupitor) move).revolve();
		((Jupitor) move).rotate();
		((Jupitor) move).move();
		System.out.println("Status of life:" + ((Jupitor) move).supportsLife());

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement III:\n");
		// Tiger object
		move = new Tiger();
		((Tiger) move).run();
		((Tiger) move).walk();
		((Tiger) move).move();
		((Tiger) move).jump();

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement IV:\n");
		// Cat object
		move = new Cat();
		((Cat) move).run();
		((Cat) move).walk();
		((Cat) move).jump();
		((Cat) move).move();

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement V:\n");
		// Car object
		move = new Car();
		((Car) move).start();
		((Car) move).stop();
		((Car) move).move();

		System.out.println("\n*******************************\n");

		System.out.println("Problem statement VI:\n");
		//HumAN rOBOT
		move=new HumanRobot();
		((HumanRobot)move).run();
		((HumanRobot)move).move();
		((HumanRobot)move).walk();
		((HumanRobot)move).jump();
		((HumanRobot)move).useArtificialIntelligence();
		((HumanRobot)move).senseInfo();
		((HumanRobot)move).processData();
		

	}

}
