package comp.fundacionjala.movies;

class ChildrenMovie extends Movie implements IMovie {

    private static final double CHARGE_PER_RENTAL_DAY = 1.5;

    private static final double INITIAL_CHARGE = 1.5;

    private static final int THRESHOLD_DAYS = 3;

    private static final int FREQUENT_RENTER_POINTS = 1;

    public ChildrenMovie(String title) {
        super(title, CHARGE_PER_RENTAL_DAY, THRESHOLD_DAYS, FREQUENT_RENTER_POINTS);
    }

    public double calculateRentalCharge(int daysRented) {
        double charge = INITIAL_CHARGE;
        if (daysRented > threshold_days) {
            charge += (daysRented - threshold_days) * charge_per_rental_day;
        }
        return charge;
    }

    public int calculateRenterFrequentPoints(int daysRented) {
        return frequent_renter_points;
    }
}
