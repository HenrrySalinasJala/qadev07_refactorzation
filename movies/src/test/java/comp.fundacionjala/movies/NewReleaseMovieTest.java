package comp.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class NewReleaseMovieTest {

    private static final String MOVIE_TITLE = "new release movie";

    private IMovie movie;

    @Before
    public void setUp() {
        movie = new NewReleaseMovie(MOVIE_TITLE);
    }

    @Test
    public void testNewReleaseMovieInstanceIsNotNull() {
        assertNotNull("The object should not be null", new NewReleaseMovie(MOVIE_TITLE));
    }

    @Test
    public void testNewReleaseMovieCanBeCreatedOnlyWithItsTitle() {
        assertTrue("The object should be a NewReleaseMovie instance", movie instanceof NewReleaseMovie);
    }

    @Test
    public void testNewReleaseMovieCanCalculateItsRentalCharge() {
        final int daysRented = 5;
        final int expectedRentalCharge = 15;
        assertEquals("The expected rental charge does not match", expectedRentalCharge, movie.calculateRentalCharge(daysRented), DELTA);
    }

    @Test
    public void testNewReleaseMovieCanCalculateTheFrequentRenterPoints() {
        final int expectedFrequentPoints = 2;
        final int daysRented = 10;
        assertEquals("The expected customer frequent points does not match", expectedFrequentPoints, movie.calculateRenterFrequentPoints(daysRented));
    }
}
