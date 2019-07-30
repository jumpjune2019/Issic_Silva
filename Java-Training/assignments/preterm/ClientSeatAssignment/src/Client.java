import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Client {
	private String lastName;
	private String firstName;
	private String id;
	private String seatName;
	List<Client> clientList = new ArrayList<Client>();
	
	Client(String l, String f, String i) {
		setClientLastName(l);
		setClientFirstName(f);
		setClientId(i);
	}
	
	
	public String getClientId() {
		return id;
	}
	
	public void setClientId(String personCsv) {
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
	
	@Override
	   public String toString() {
	        return ("ID: "+this.getClientId()+
	                " Last Name: "+ this.getClientLastName() +
	                " First Name: "+ this.getClientFirstName());
	   }
	
	String getClientInitials() {
		char[] initialsArr = {' ', ' '};
		initialsArr[0] = firstName.charAt(0);
		initialsArr[1] = lastName.charAt(0); 
		return new String(initialsArr);
	}

	String getFullClientString() {
		String full = ("id: " + id + " lastname: " + lastName + " firstname: " + firstName);
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
		       Client clientObj = new Client(line, line, id);  

		       // add values from csv to client object  
		       clientObj.setClientId(personCsv[0]);  
		       clientObj.setClientLastName(personCsv[1]);  
		       clientObj.setClientFirstName(personCsv[2]);   

		       // adding client objects to a list  
		       personList.add(clientObj);
		} 
		clientList = personList;
	}	
}
