package comp.fundacionjala.movies;

import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RegularMovieTest {

    private static final String movieTitle = "new movie title";

    private static final int daysRented = 5;

    private IMovie movie;

    @Test
    public void testRegularMovieInstanceIsNotNull() {
        assertNotNull(new RegularMovie(movieTitle));
    }

    @Test
    public void testRegularMovieCanBeCreatedOnlyWithItsTitle() {
        movie = new RegularMovie(movieTitle);
        assertTrue(movie instanceof RegularMovie);
    }

    @Test
    public void testRegularMovieCanCalculateItsRentalCharge() {
        movie = new RegularMovie(movieTitle);
        double expectedRentalCharge = 6.5;
        assertEquals(expectedRentalCharge, movie.calculateRentalCharge(daysRented), DELTA);
    }

    @Test
    public void testRegularMovieCanCalculateTheFrequentRenterPoints() {
        movie = new RegularMovie(movieTitle);
        int expectedFrequentPoints = 1;
        assertEquals(expectedFrequentPoints, movie.calculateRenterFrequentPoints(daysRented));
    }
}
