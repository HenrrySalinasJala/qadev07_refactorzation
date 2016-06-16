package comp.fundacionjala.movies;

class RegularMovie extends Movie implements IMovie {

    public RegularMovie(String title) {
        super(title);
        INITIAL_CHARGE = 2;
        CHARGE_PER_RENTAL_DAY = 1.5;
        THRESHOLD_DAYS = 2;
        FREQUENT_RENTER_POINTS = 1;
    }

    public double calculateRentalCharge(int daysRented) {

        double charge = INITIAL_CHARGE;
        if (daysRented > THRESHOLD_DAYS) {
            charge += (daysRented - THRESHOLD_DAYS) * CHARGE_PER_RENTAL_DAY;
        }
        return charge;
    }

    public int calculateRenterFrequentPoints(int daysRented) {
        return FREQUENT_RENTER_POINTS;
    }
}
