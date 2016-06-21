package comp.fundacionjala.movies;

import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class NewReleaseMovieTest {

    private static final String movieTitle = "new release movie";

    private IMovie movie;

    @Test
    public void testNewReleaseMovieInstanceIsNotNull() {

        assertNotNull(new NewReleaseMovie(movieTitle));
    }

    @Test
    public void testNewReleaseMovieCanBeCreatedOnlyWithItsTitle() {
        movie = new NewReleaseMovie(movieTitle);
        assertTrue(movie instanceof NewReleaseMovie);
    }

    @Test
    public void testNewReleaseMovieCanCalculateItsRentalCharge() {

        movie = new NewReleaseMovie(movieTitle);
        int daysRented = 5;
        int expectedRentalCharge = 15;
        assertEquals(expectedRentalCharge, movie.calculateRentalCharge(daysRented), DELTA);
    }

    @Test
    public void testNewReleaseMovieCanCalculateTheFrequentRenterPoints() {
        movie = new NewReleaseMovie(movieTitle);
        int expectedFrequentPoints = 2;
        int daysRented = 10;
        assertEquals(expectedFrequentPoints, movie.calculateRenterFrequentPoints(daysRented));
    }
}
