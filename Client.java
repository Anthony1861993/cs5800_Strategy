package cs5800_Strategy;

public class Client {

	public static void main(String[] args) {
		
		Transportation prius = new Car();
		Transportation publicBlueBus = new Bus();
		CollegeKid Vincent = new CollegeKid(prius);
		Vincent.goToSchool();
		
		Vincent.setTransportation(publicBlueBus);
		Vincent.goToSchool();
	}
}
