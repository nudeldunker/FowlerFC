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
}