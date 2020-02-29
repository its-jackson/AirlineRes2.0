public class AirlineResMain {

	public static void main(String[] args) throws InterruptedException {

		AirlineRes passenger1 = new AirlineRes("JaCK", "BluE", 4531, 10);
		System.out.println(passenger1.noFlyList());
		System.out.println(passenger1.getPortionString());
		
		
			if (passenger1.noFlyList() == 9999) {

				for (int i = 0; i < 7; i++) {
					System.out.println("ALERT");
					Thread.sleep(1000);
				}
			}
	}
}