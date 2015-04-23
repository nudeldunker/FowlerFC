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
		return movie.getCharge(daysRented);
	}
	/**
	 * @deprecated Use {@link #MISSING()} instead
	 */
	public int getFrequentRenterPoints(int daysRented) {
		return movie.getFrequentRenterPoints(daysRented);
	}
	
}