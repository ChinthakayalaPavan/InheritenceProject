package FirstProject;

class Employee1 {
	public void customerName() {
		System.out.println("Name = Chinthakayala Pavan");
	}
	public void customerAge() {
		System.out.println("Age ="+23);
	}
}
class Employee2 extends Employee1{
	public void customerPhoneNo() {
		System.out.println("7995371560");
	}
	public void customerAdd() {
		System.out.println("Hyderabad");
	}
}
public class SingleLevel{
	public static void main(String[] args) {
		Employee2 e = new Employee2();
		e.customerName();
		e.customerAge();
		e.customerPhoneNo();
		e.customerAdd();
	}
}
