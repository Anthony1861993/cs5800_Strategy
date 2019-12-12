package cs5800_Strategy;

public class CollegeKid {
	
	Transportation transportation;
	
	public CollegeKid(Transportation transportation) {
		this.transportation = transportation;
	}
	
	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}
	
	public void goToSchool() {
		transportation.goToSchool();
	}
}
