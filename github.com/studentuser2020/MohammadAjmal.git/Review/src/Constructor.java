
public class Constructor {
	String fname;
	String lname;
	int att; 
	
	public Constructor (String n, String m, int a)
	{	fname = n;
		lname = m;
		att = a; }
	
	public void details() {System.out.println("Details of studnet: " +  fname + lname + " " + att);}
	
	
	public static void cdetails() {System.out.println("Batch 236");}

	
	public static void main(String[] args) {
		Constructor s1 = new Constructor("Ajmal ", "Khan", 90);
		Constructor s2 = new Constructor ("Anita ", "Kundal", 95);
		 
		
		cdetails();
		s1.details();
		s2.details();
		}}
		
		
		
		
		
		



