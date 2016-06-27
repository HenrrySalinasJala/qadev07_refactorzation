package comp.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ChildrenMovieTest {

    public static final int DAYS_RENTED = 5;

    private IMovie movie;

    private static String MOVIE_TITLE = "new movie title";

    @Before
    public void setUp() {
        movie = new ChildrenMovie(MOVIE_TITLE);
    }

    @Test
    public void testChildrenMovieInstanceIsNotNull() {
        assertNotNull("The object should not be null", new ChildrenMovie(MOVIE_TITLE));
    }

    @Test
    public void testChildrenMovieCanBeCreatedOnlyWithItsTitle() {
        assertTrue("The object should be a ChildrenMovie instance", movie instanceof ChildrenMovie);
    }

    @Test
    public void testChildrenMovieCanCalculateItsRentalCharge() {
        final double expectedCharge = 4.5;
        assertEquals("The expected rental charge does not match", expectedCharge, movie.calculateRentalCharge(DAYS_RENTED), DELTA);
    }

    @Test
    public void testChildrenMovieCanCalculateTheFrequentRenterPoints() {
        final int expectedRenterPoints = 1;
        assertEquals("The expected customer frequent points does not match", expectedRenterPoints, movie.calculateRenterFrequentPoints(DAYS_RENTED));
    }
}
