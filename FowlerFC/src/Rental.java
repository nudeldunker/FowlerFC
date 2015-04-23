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
<<<<<<< HEAD
	 * @deprecated Use {@link Movie#getCharge(Rental)} instead
	 */
	double getCharge() {
		return movie.getCharge(this.daysRented);
=======
	 * @deprecated Use {@link #MISSING()} instead
	 */
	double getCharge() {
		return movie.getCharge(daysRented);
>>>>>>> 198723d03e43ff0071fd1320acced01d9e1378c2
	}
	/**
	 * @deprecated Use {@link #MISSING()} instead
	 */
	public int getFrequentRenterPoints(int daysRented) {
		return movie.getFrequentRenterPoints(daysRented);
	}
	
}