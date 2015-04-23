//Seite 41
public abstract class Price {
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);/* {
	    double thisAmount = 0;
	    switch (rental.getMovie().getPriceCode()) {
	        case Movie.REGULAR:
	            thisAmount += 2;
	            if (rental.getDaysRented() > 2)
	                thisAmount += (rental.getDaysRented() - 2) * 1.5;
	            break;
	        case Movie.NEW_RELEASE:
	            thisAmount += rental.getDaysRented() * 3;
	            break;
	        case Movie.CHILDRENS:
	            thisAmount += 1.5;
	            if (rental.getDaysRented() > 3)
	                thisAmount += (rental.getDaysRented() - 3) * 1.5;
	            break;
	    }
	    return thisAmount;
	}*/
}
