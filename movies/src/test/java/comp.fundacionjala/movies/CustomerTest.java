package comp.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    private static final String customerName = "Juan";

    private Rental rentalChildrenMovie;

    private Rental rentalRegularMovie;

    private Rental rentalNewReleaseMovie;

    private final static int DAYS_RENTED = 2;

    private Customer customer;

    @Before
    public void setUp() {
        String childrenMovieTitle = "Resident Evil I";
        String regularMovieTitle = "Resident Evil II";
        String newReleaseMovieTitle = "Resident Evil III";
        rentalChildrenMovie = new Rental(new ChildrenMovie(childrenMovieTitle), DAYS_RENTED);
        rentalRegularMovie = new Rental(new RegularMovie(regularMovieTitle), DAYS_RENTED);
        rentalNewReleaseMovie = new Rental(new NewReleaseMovie(newReleaseMovieTitle), DAYS_RENTED);
        customer = new Customer(customerName);
    }

    @Test
    public void testCustomerInstanceIsNotNull() {
        assertNotNull("The object should not be null", customer);
    }

    @Test
    public void testCustomerInstanceCanBeCreatedGivenACustomerName() {
        assertTrue("The object should be a Customer instance", customer instanceof Customer);
    }

    @Test
    public void testMoreThanTwoRentalInstancesCanBeAddedToCustomerShoppingCart() {
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalChildrenMovie);
        final int expectedRentals = 2;
        assertEquals("The expected number of rentals does not match", expectedRentals, customer.getRentals().size());
    }

    @Test
    public void testDuplicateRentalInstanceCannotBeAddedToCustomerShoppingCart() {
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalRegularMovie);
        final int expectedRental = 1;
        assertEquals("The expected number of rentals does not match", expectedRental, customer.getRentals().size());
    }

    @Test
    public void testCustomerCanCalculateTheTotalChargeOfMultipleMoviesRented() {
        customer.addRental(rentalChildrenMovie);
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalNewReleaseMovie);
        final double expectedCharge = 9.5;
        assertEquals("The expected rental charge does not match", expectedCharge, customer.calculateTotalCharge(), DELTA);
    }

    @Test
    public void testCustomerCanCalculateTheTotalFrequentRenterPoints() {
        customer.addRental(rentalChildrenMovie);
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalNewReleaseMovie);
        final int expectedFrequentPoints = 4;
        assertEquals("The expected customer frequent points does not match", expectedFrequentPoints, customer.calculateTotalFrequentRenterPoints());
    }
}
