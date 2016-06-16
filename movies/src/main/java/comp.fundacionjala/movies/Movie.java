package comp.fundacionjala.movies;

class Movie {

    private String title;
    public static double CHARGE_PER_RENTAL_DAY;
    public static double INITIAL_CHARGE;
    public static double THRESHOLD_DAYS;
    public static int FREQUENT_RENTER_POINTS;
    public static int MINIMUM_RENTAL_DAYS;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
