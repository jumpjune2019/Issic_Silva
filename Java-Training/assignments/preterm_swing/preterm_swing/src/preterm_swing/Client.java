package preterm_swing;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.*;


class Client implements Comparable<Client> {
		
	//create variables for object
	private String lastName;
	private String firstName;
	private Integer id;
	private String seatName;
	List<Client> clientList = new ArrayList<Client>();
	
	//object constructor
	Client(String l, String f, Integer i, String seat) {
		setClientLastName(l);
		setClientFirstName(f);
		setClientId(i);
		setSeat(seat);
	}
	
	//getter and setter methods
	public Integer getClientId() {
		return id;
	}
	
	public void setClientId(Integer personCsv) {
		this.id = personCsv;
	}
	
	public String getClientLastName() {
		return lastName;
	}
	
	public void setClientLastName(String lastname) {
		this.lastName = lastname;
	}
	
	public String getClientFirstName() {
		return firstName;
	}
	
	public void setClientFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	public String getSeat() {
		return seatName;
	}
	
	public void setSeat(String seat) {
		this.seatName = seat;
	}
	
	@Override
	   public String toString() { 
	        return (this.getClientLastName() +
	                " "+ this.getClientFirstName());
	   }
	
	String getClientInitials() {
		char[] initialsArr = {' ', ' '};
		initialsArr[0] = firstName.charAt(0);
		initialsArr[1] = lastName.charAt(0); 
		return new String(initialsArr);
	}

	String getFullClientString() {
		String full = ("" + lastName + " " + firstName);
		return full;
	}
	
	public void getData() throws NumberFormatException, IOException {
		String file = "clients_list.csv";
		boolean first = true;
		
		BufferedReader br = new BufferedReader(new FileReader(file));  
		List<Client> personList = new ArrayList<>();
		String line;
		while ((line = br.readLine()) != null) {  
				// skip the first line of the CSV 
				// it contains the field names
				if(first == true) {
					first = false;
					continue;
				}
			
		       // split on comma(',')  
		       String[] personCsv = line.split(",");  

		       // create client object to store values  
		       Client clientObj = new Client(line, line, id, null);  

		       // add values from csv to client object  
		       clientObj.setClientId(Integer.parseInt(personCsv[0]));  
		       clientObj.setClientLastName(personCsv[1]);  
		       clientObj.setClientFirstName(personCsv[2]);   

		       // adding client objects to a list  
		       personList.add(clientObj);
		} 
		
		clientList = personList;
		Collections.sort(clientList);
	}

	@Override
	public int compareTo(Client o) {
		// TODO Auto-generated method stub
		
		return this.getClientId().compareTo(o.getClientId());
	}	
}
