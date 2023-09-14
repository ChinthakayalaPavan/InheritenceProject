package FirstProject;
class Customer{
	public void customerName() {
		System.out.println("Name: Chinthakayala Pavan");
	}
	public void customerPhone() {
		System.out.println("PhoneNo: 7995371560");
	}
}
class buyingList1 extends Customer{
	public void ListName1() {
		System.out.println("ProductName1: chocolates");
	}
	public void ListCost1() {
		System.out.println("ProductCost1: 45");
	}
}
class buyingList2 extends Customer{
	public void ListName2() {
		System.out.println("ProductName2: oil");
	}
	public void ListCost2() {
		System.out.println("ProductCost2: 175");
	}
}
public class HierarchicalLevel {

	public static void main(String[] args) {
		buyingList1 b1= new buyingList1();
		b1.customerName();
		b1.customerPhone();
		b1.ListName1();
		b1.ListCost1();
		buyingList2 b2= new buyingList2();
		b2.ListName2();
		b2.ListCost2();
	}

}
