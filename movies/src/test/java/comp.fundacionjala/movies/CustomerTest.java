package comp.fundacionjala.movies;

import org.junit.BeforeClass;
import org.junit.Test;

import static comp.fundacionjala.movies.Constants.DELTA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    private static final String customerName = "Juan";

    private static Rental rentalChildrenMovie;

    private static Rental rentalRegularMovie;

    private static Rental rentalNewReleaseMovie;

    private static int daysRented = 2;

    private static Customer customer;

    @BeforeClass
    public static void setUp() {
        String childrenMovieTitle = "Resident Evil I";
        String regularMovieTitle = "Resident Evil II";
        String newReleaseMovieTitle = "Resident Evil III";
        rentalChildrenMovie = new Rental(new ChildrenMovie(childrenMovieTitle), daysRented);
        rentalRegularMovie = new Rental(new RegularMovie(regularMovieTitle), daysRented);
        rentalNewReleaseMovie = new Rental(new NewReleaseMovie(newReleaseMovieTitle), daysRented);
    }

    @Test
    public void testCustomerInstanceIsNotNull() {
        customer = new Customer(customerName);
        assertNotNull(customer);
    }

    @Test
    public void testCustomerInstanceCanBeCreatedGivenACustomerName() {
        customer = new Customer(customerName);
        assertTrue(customer instanceof Customer);
    }

    @Test
    public void testMoreThanTwoRentalInstancesCanBeAddedToCustomerShoppingCart() {

        customer = new Customer(customerName);
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalChildrenMovie);
        assertEquals(2, customer.getRentals().size());
    }

    @Test
    public void testDuplicateRentalInstanceCannotBeAddedToCustomerShoppingCart() {

        customer = new Customer(customerName);
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalRegularMovie);
        assertEquals(1, customer.getRentals().size());
    }

    @Test
    public void testCustomerCanCalculateTheTotalChargeOfMultipleMoviesRented() {
        customer = new Customer(customerName);
        customer.addRental(rentalChildrenMovie);
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalNewReleaseMovie);
        double expectedCharge = 9.5;
        assertEquals(expectedCharge, customer.calculateTotalCharge(), DELTA);
    }

    @Test
    public void aCustomerCanCalculateTheTotalFrequentRenterPoints() {

        customer = new Customer(customerName);
        customer.addRental(rentalChildrenMovie);
        customer.addRental(rentalRegularMovie);
        customer.addRental(rentalNewReleaseMovie);
        int expectedFrequentPoints = 4;
        assertEquals(expectedFrequentPoints, customer.calculateTotalFrequentRenterPoints());
    }
}
