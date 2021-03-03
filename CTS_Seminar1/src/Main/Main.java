package Main;

import Zoo.Zoo;
import Zoo.Zookeeper;
import Zoo.Girafa;
import Zoo.Zebra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo zoo=new Zoo();
		Zookeeper keeper=new Zookeeper();
		keeper.setName("Gigel");
		zoo.setKeeper(keeper);
		Zebra zebra1=new Zebra("zebra1");
		Zebra zebra2=new Zebra("zebra2");
		zoo.add(zebra1);
		zoo.add(zebra2);
		Girafa girafa1=new Girafa("girafa1");
		Girafa girafa2=new Girafa("girafa2");
		zoo.add(girafa1);
		zoo.add(girafa2);
		zoo.feedAll();

	}

}
