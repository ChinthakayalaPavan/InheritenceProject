package FirstProject;

class Emp1{
	public static void EmpName() {
		System.out.println("Name: Chinthakayala Pavan");
	}
	public void EmpPhoneNo() {
		System.out.println("Old Number: 7995371560");
	}
}
class Emp2 extends Emp1{
	@Override
	public void EmpPhoneNo() {
		System.out.println("New Number: 9440416557");
	}
	public void EmpSalary() {
		System.out.println("Salary: 25000");
	}
}
class Emp3 extends Emp2{
	@Override
	public void EmpSalary() {
		System.out.println("Hike Salary: 35000");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Emp3 e1 = new Emp3();
		e1.EmpName();
		e1.EmpPhoneNo();
		e1.EmpSalary();
	}

}
