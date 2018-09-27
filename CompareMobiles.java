//@author: Tanveer Baba
//@created: 29/06/2018
//@subject: Overriding equals to compare objects for meaningfully equivalent data
class Mobile{
	private String brand, color;
	private Integer memoryCapacity;
	private Integer batteryBackup;

	Mobile(String brand, String color, Integer memoryCapacity, Integer batteryBackup){

		this.brand = brand;
		this.color = color;
		this.memoryCapacity = memoryCapacity;
		this.batteryBackup = batteryBackup;
	}

	// define the getters
	public String getBrand(){
		return this.brand;
	}
	public String getColor(){
		return this.color;
	}
	public Integer getMemoryCapacity(){
		return this.memoryCapacity;
	}
	public Integer getBatteryBackup(){
		return this.batteryBackup;
	}


	@Override
	public boolean equals(Object ref){

		//make sure we are only about to compare mobile with mobile
		if(ref instanceof Mobile){
		//compare on memory
		return this.getMemoryCapacity().equals(((Mobile)ref).getMemoryCapacity());
		}
		else {
		return false;
		}
	}
}

class Dog{

}

class CompareMobiles{
public static void main(String[] args) {
	//Create three objects of Mobile
	Mobile a = new Mobile("Samsung", "Lake Blue", 4, 2700);
	Mobile b = new Mobile("Xioami", "Grey", 6, 4100);
	Mobile c = new Mobile("Xioami", "Black", 8, 4200);

	// Create a dog
	Dog d = new Dog();

	// compare two mobiles
	if(a.equals(c)){
		System.out.println("Same configuration mobiles");
	}
	else{
		System.out.println("Different...");
	}
}
}