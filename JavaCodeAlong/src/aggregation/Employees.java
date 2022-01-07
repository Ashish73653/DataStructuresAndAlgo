package aggregation;

class Address{
	String city;
	int sector;
	Address(String city,int sector){
		this.city = city;
		this.sector = sector;
	}
}
class Employee{
	int id;
	String name;
	Address address;
	Employee(int id,String name,Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println("Employee id is: "+this.id);
		System.out.println("Employee name is: "+this.name);
		System.out.println("Employee address is: "+this.address.city+" sector is: "+this.address.sector);
	}
}
public class Employees {

	public static void main(String[] args) {
		Address adr = new Address("Chandigarh",39);
		Employee emp1 = new Employee(1,"Ashish",adr);
		emp1.display();

	}

}
