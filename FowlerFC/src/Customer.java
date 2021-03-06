
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        Enumeration enum_rentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            //determine amounts for each line
         
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines

        result +=  "Amount owed is " + String.valueOf(getTotalCharge()) +"\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())+ " frequent renter points";
        return result;
    }
	/**
	 * @deprecated Use {@link #MISSING()} instead
	 */
	private double amountFor(Rental each) {
		return each.getCharge();
	}
	
	private double getTotalCharge() {
		double result = 0;
		Enumeration enum_rentals = rentals.elements();
		while (enum_rentals.hasMoreElements()) {
		Rental each = (Rental) enum_rentals.nextElement();
		result += each.getCharge();
		}
		return result;
		}
	
	private int getTotalFrequentRenterPoints(){
		int result = 0;
		Enumeration enum_rentals = rentals.elements();
		while (enum_rentals.hasMoreElements()) {
		Rental each = (Rental) enum_rentals.nextElement();
		result += each.getFrequentRenterPoints(result);
		}
		return result;
		}
	
	public String htmlStatement() {
		Enumeration enum_rentals = rentals.elements();
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
		while (enum_rentals.hasMoreElements()) {
		Rental each = (Rental) enum_rentals.nextElement();
<<<<<<< HEAD
<<<<<<< HEAD
=======
		35//wo kommt die her?
>>>>>>> origin/master
=======
		//35 
		//wo kommt die her?
>>>>>>> 198723d03e43ff0071fd1320acced01d9e1378c2
		//show figures for each rental
		result += each.getMovie().getTitle()+ ": " +
		String.valueOf(each.getCharge()) + "<BR>\n";
		}
		//add footer lines
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
		return result;
	}
    
    }





    