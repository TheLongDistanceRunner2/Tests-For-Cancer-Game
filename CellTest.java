package testy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CellTest {
    long seconds;
    boolean countDown;
    long counter1;
    long counter2;

    @Given("There is number of seconds <sec> equal to {long}")
    public void there_is_number_of_seconds_sec_equal_to(Long sec) {
        this.seconds = sec;
    }

    @Given("There is <counter1> equal to {long}")
    public void there_is_counter1_equal_to(Long c1) {
        this.counter1 = c1;
    }

    @Given("There is <counter2> equal to {long}")
    public void there_is_counter2_equal_to(Long c2) {
        this.counter2 = c2;
    }

    @When("left time is equal to {long}")
    public void left_time_is_equal_to(Long l1) {
        long tmp = counter1 - counter2 / 1000;
        Assert.assertEquals(tmp, (long)l1);
    }

    @Then("I set <countDown> with true")
    public void i_set_count_down_with_true() {
        this.countDown = true;
    }

    //================================================
    @When("left time is not equal to {long}")
    public void left_time_is_not_equal_to(Long l1) {
        long tmp = counter1 - counter2 / 1000;
        Assert.assertNotEquals(tmp, (long)l1);
    }

    @Then("I set <countDown> with false")
    public void i_set_count_down_with_false() {
        this.countDown = false;
    }
}
