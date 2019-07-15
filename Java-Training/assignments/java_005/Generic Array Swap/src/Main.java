
public class Main {
	
	

	public static void main(String[] args) {
		Integer nums[] = { 1, 2, 3, 4, 5 };
		
		if(Generics.arraysEqual(nums, nums)) {
			System.out.println("nums equals nums");	
		}
		
		System.out.println("before " + nums[0] + " and " + nums[4]);
		Generics.swap(nums, 0, 4);
		System.out.println("after " + nums[0] + " and " + nums[4]);
	}

}
