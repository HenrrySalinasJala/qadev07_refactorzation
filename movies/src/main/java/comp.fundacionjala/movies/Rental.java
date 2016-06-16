package comp.fundacionjala.movies;

class Rental {

    private IMovie movie;
    private int daysRented;

    public Rental(IMovie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public IMovie getMovie() {
        return movie;
    }

    public double calculateRentalCharge(IMovie movie) {
        return movie.calculateRentalCharge(daysRented);
    }

    public int calculateRenterFrequentPoints() {
        return movie.calculateRenterFrequentPoints(daysRented);
    }
}