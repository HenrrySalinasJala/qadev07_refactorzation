package comp.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RegularMovieTest {

    private static final String MOVIE_TITLE = "new movie title";

    private static final int DAYS_RENTED = 5;

    private IMovie movie;

    @Before
    public void setUp() {
        movie = new RegularMovie(MOVIE_TITLE);
    }

    @Test
    public void testRegularMovieInstanceIsNotNull() {
        assertNotNull(movie);
    }

    @Test
    public void testRegularMovieCanBeCreatedOnlyWithItsTitle() {
        assertTrue(movie instanceof RegularMovie);
    }

    @Test
    public void testRegularMovieCanCalculateItsRentalCharge() {
        final double expectedRentalCharge = 6.5;
        assertEquals(expectedRentalCharge, movie.calculateRentalCharge(DAYS_RENTED), DELTA);
    }

    @Test
    public void testRegularMovieCanCalculateTheFrequentRenterPoints() {
        final int expectedFrequentPoints = 1;
        assertEquals(expectedFrequentPoints, movie.calculateRenterFrequentPoints(DAYS_RENTED));
    }
}
