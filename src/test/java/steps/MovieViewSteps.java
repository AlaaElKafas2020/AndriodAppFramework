package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.MoviesPage;

public class MovieViewSteps {

        MoviesPage moviesPage = new MoviesPage();
        @Given("I am on the Home page")
        public void i_am_on_the_Home_page() {
                moviesPage.launchApp();
        }

        @When("I click on the Movie icon")
        public void i_click_on_Movie_icon() {
                moviesPage.OpenMovieDetails();
        }

        @Then("the details should be viewed")
        public void the_details_should_be_viewed() {
            moviesPage.validateDetails();
        }

}
