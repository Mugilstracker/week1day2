package week1.day2;

public class Car {
public void applyBreak() {
		System.out.println("Press Break");	
}

public void applyGear() {
		System.out.println("Gear1");
}

public void switchOnAC() {
		System.out.println("Press AC btn,Fan speed 2");
}

public void applyAccelerator() {
		System.out.println("Gently Apply Break and Release clutch");

}

public static void main(String[] args) {
		Car c = new Car();
		c.applyBreak();
		c.applyGear();
		c.switchOnAC();
		c.applyAccelerator();
		
		
		
}
}


