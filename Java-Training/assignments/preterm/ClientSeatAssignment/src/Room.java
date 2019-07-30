import java.util.*;

public class Room {
	
	
	int seatsPerRow;
	int rows;
	
	private Seat seat = new Seat(0, "", false, ' ', 0, null, 0);
	
	List<Seat> theatreRoom = new ArrayList<Seat>();
	int counter = 1;

	//creates seats in a theater room and assigns row letter and seat number
	public void fillSeats() {
		
		//come back and make this more dynamic
		for(int i=1; i < 102; i++) {
			theatreRoom.add(new Seat(0, "", false, ' ', 0, null, 0));
		}
		
		for(int i = 1; i <= 10; i++) {
			theatreRoom.get(i).setRow('A');
			theatreRoom.get(i).setColumn(i);
		}
		for(int i = 11; i <= 20; i++) {
			theatreRoom.get(i).setRow('B');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 21; i <= 30; i++) {
			theatreRoom.get(i).setRow('C');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 31; i <= 40; i++) {
			theatreRoom.get(i).setRow('D');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 41; i <= 50; i++) {
			theatreRoom.get(i).setRow('E');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 51; i <= 60; i++) {
			theatreRoom.get(i).setRow('F');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 61; i <= 70; i++) {
			theatreRoom.get(i).setRow('G');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 71; i <= 80; i++) {
			theatreRoom.get(i).setRow('H');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 81; i <= 90; i++) {
			theatreRoom.get(i).setRow('I');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		counter = 1;
		for(int i = 91; i < 101; i++) {
			theatreRoom.get(i).setRow('J');
			theatreRoom.get(i).setColumn(counter);
			counter++;
		}
		//assign row and column to seatName
		for(int i = 1; i < 101; i++) {
			theatreRoom.get(i).setSeatName((Character.toString(theatreRoom.get(i).getRow()) + theatreRoom.get(i).getColumn()));
			//System.out.println(theatreRoom.get(i).getSeatName());
		}
		
//		//check seat objects for correct row and column assignment
//		for(int i = 1; i < theatreRoom.size(); i++) {
//			System.out.println(theatreRoom.get(i).getSeatRow() + " " + theatreRoom.get(i).getSeatColumn());
//		}
		
	}
	
	//print array list in a grid
	public void drawMatrix() {
		
		for(int i = 1; i < theatreRoom.size(); i++) {
			System.out.print(" " + theatreRoom.get(i).getSeatName());
			if((theatreRoom.get(i).getId()) == 0) {
				System.out.print(" Vacant");
			}else {
				System.out.print(" id: " + theatreRoom.get(i).getId() + "/" + theatreRoom.get(i).getSeatInitials());

			}
			if(theatreRoom.get(i).getColumn() == 10) {
				System.out.println();
			}
		}
		//System.out.println(theatreRoom);
	}
	
	
	
}
