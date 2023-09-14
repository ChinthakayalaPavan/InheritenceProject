package FirstProject;
class FirstGenerationCar{
	public void carName() { 
		System.out.println("Name: Lamborghini");
	}
	public void carColor() { 
		System.out.println("Color: Red");
	}
	public void carCost() { 
		System.out.println("Cost: "+50000000.00);
	}
	public void carBrand() { 
		System.out.println("Brand: Automobili Lamborghini S.p.A");
	}
}
class SecoundGenerationCar extends FirstGenerationCar{
	public void carName() { 
		System.out.println("Name: Lamborghini 250");
	}
	public void carColor() { 
		System.out.println("Color: Yellow");
	}
	public void carCost() { 
		System.out.println("Cost: "+70000000.00);
	}
}
class SecoundGenerationCar1 extends SecoundGenerationCar{
	public void carSeats() { 
		System.out.println("Seats: 2");
	}
}
class SecoundGenerationCar2 extends SecoundGenerationCar{
	public void carCost() { 
		System.out.println("Cost: "+80000000.00);
	}
	public void carSeats() { 
		System.out.println("Seats: 4");
	}
}
public class HybridLevel {

	public static void main(String[] args) {
		SecoundGenerationCar2 s1 = new SecoundGenerationCar2();
		s1.carName();
		s1.carColor();
		s1.carCost();
		s1.carBrand();
		s1.carSeats();
	}

}
