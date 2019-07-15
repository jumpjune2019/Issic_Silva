
enum TrafficLight {
	GREEN(5), YELLOW(7), RED(10);
	
	private int second;
	
	TrafficLight(int s){
		second = s;
	}
	
	int getSeconds() {
		return second;
	}
}
