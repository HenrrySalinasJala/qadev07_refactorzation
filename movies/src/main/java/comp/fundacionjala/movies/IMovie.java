package comp.fundacionjala.movies;

/**
 * Thi interface define the common procedures of a movie
 */
public interface IMovie {

    /**
     * This method calculate the rental charge of the different kind of classes that implements this interface
     *
     * @param daysRented days to rent the movie
     * @return rental charge
     */
    double calculateRentalCharge(int daysRented);

    /**
     * This method calculate the renter frequent points of the different kind of classes that implements this interface
     *
     * @param daysRented days to rent the movie
     * @return frecuent renter points
     */
    int calculateRenterFrequentPoints(int daysRented);

    String getTitle();
}
