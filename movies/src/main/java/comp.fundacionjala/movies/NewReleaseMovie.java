package comp.fundacionjala.movies;

class NewReleaseMovie extends Movie implements IMovie {

    public NewReleaseMovie(String title) {
        super(title);
        CHARGE_PER_RENTAL_DAY = 3;
        FREQUENT_RENTER_POINTS = 1;
        MINIMUM_RENTAL_DAYS = 1;
    }

    public double calculateRentalCharge(int daysRented) {
        return daysRented * CHARGE_PER_RENTAL_DAY;
    }

    public int calculateRenterFrequentPoints(int daysRented) {

        if (daysRented > MINIMUM_RENTAL_DAYS) {
            return FREQUENT_RENTER_POINTS + 1;
        }
        return FREQUENT_RENTER_POINTS;
    }
}
