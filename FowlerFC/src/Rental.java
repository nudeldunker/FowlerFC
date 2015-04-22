class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
	/**
	 * @deprecated Use {@link #MISSING()} instead
	 */
	double getCharge() {
		return movie.getCharge(this);
	}
	public int getFrequentRenterPoints() {
		
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) 
	&&
		   getDaysRented() > 1) return 2;
		
		return 1;
	}
	
}