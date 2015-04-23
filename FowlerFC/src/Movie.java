public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        //priceCode = newpriceCode;
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        //priceCode = arg;
    	
    	switch (arg) {
    	case REGULAR:
    		price = new RegularPrice();
    		break;
    	case CHILDRENS:
    		price = new ChildrensPrice();
    		break;
    	case NEW_RELEASE:
    		price = new NewReleasePrice();
    		break;
    	default:
    		throw new IllegalArgumentException("Incorrect Price Code");
    	}
    }
    private Price price;
        
    public String getTitle (){
        return title;
    }
<<<<<<< HEAD
	double getCharge(int daysRented) {
	    double thisAmount = 0;
	    switch (getPriceCode()) {
	        case Movie.REGULAR:
	            thisAmount += 2;
	            if (daysRented > 2)
	                thisAmount += (daysRented - 2) * 1.5;
	            break;
	        case Movie.NEW_RELEASE:
	            thisAmount += daysRented * 3;
	            break;
	        case Movie.CHILDRENS:
	            thisAmount += 1.5;
	            if (daysRented > 3)
	                thisAmount += (daysRented - 3) * 1.5;
	            break;
	    }
	    return thisAmount;
	};
=======
	/**
	 * @deprecated Use {@link Price#getCharge(Rental)} instead
	 */
	double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	/**
	 * @deprecated Use {@link Price#getFrequentRenterPoints(Rental)} instead
	 */
	int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
>>>>>>> 198723d03e43ff0071fd1320acced01d9e1378c2
}