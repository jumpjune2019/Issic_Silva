
public class Seat {

	private boolean canBeAssigned;
	private int id;
	private String initials;
	private String seatName;
	private char row;
	private int column;
	
	
	Seat(int i, String lf, boolean assignment, char r, int c, String name, int ri){
		setId(i);
		setSeatInitials(lf);
		canBeAssigned = assignment;
		setRow(r);
		setColumn(c);
		setSeatName(name);
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	
	public String getSeatInitials() {
		return initials;
	}
	
	public void setSeatInitials(String initials) {
		this.initials = initials;
	}

	public char getRow() {
		return row;
	}

	public void setRow(char row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	   public String toString() {
	        return ("ID: "+this.getId()+
	                " Seat Initials: "+ this.getSeatInitials() +
	                " Seat Name: "+ this.getSeatName());
	   }
	
}
