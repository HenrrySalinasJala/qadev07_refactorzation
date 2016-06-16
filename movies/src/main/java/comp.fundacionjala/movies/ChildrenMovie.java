package comp.fundacionjala.movies;

class ChildrenMovie extends Movie implements IMovie {

    public ChildrenMovie(String title) {
        super(title);
        CHARGE_PER_RENTAL_DAY = 1.5;
        INITIAL_CHARGE = 1.5;
        THRESHOLD_DAYS = 3;
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
