package testy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class MotionCellTestTrue {
    private int x, y;
    private int endX = 14, endY = 16;
    private int centerX, centerY;
    private int speedX,speedY;
    private boolean up;
    private boolean _flag = false;

    private void setup() {
        centerX = getX();
        centerY = getY();
        up = true;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    @Given("There is variable <endX> equal to {int}")
    public void there_is_variable_end_x_equal_to(Integer int1) {
        this.endX = int1;
    }

    @Given("There is variable <endY> equal to {int}")
    public void there_is_variable_end_y_equal_to(Integer int1) {
        this.endY = int1;
    }

    @Given("There is variable <speedX> equal to {int}")
    public void there_is_variable_speed_x_equal_to(Integer int1) {
        this.speedX = int1;
    }

    @Given("There is variable <speedY> equal to {int}")
    public void there_is_variable_speed_y_equal_to(Integer int1) {
        this.speedY = int1;
    }

    @When("I call function setup")
    public void i_call_function_setup() {
        this.setup();
    }

    @Then("I set <centerX> with result of getX")
    public void i_set_center_x_with_get_x() {
        this.centerX = getX();
    }

    @Then("I set <centerY> with result of getY")
    public void i_set_center_y_with_result_of_get_y() {
        this.centerY = getY();
    }

    @Then("I set <up> with true")
    public void i_set_up_with_true() {
        this.up = true;
    }

    //==================================================================
    @Given("There is value <up> equal to {long}")
    public void there_is_value_up_equal_to(Long b1) {
        // convert boolean to int:
        this.up = true;
        int myInt = this.up ? 1 : 0;
        Assert.assertEquals((long)myInt, (long)b1);
    }

    @Then("I set x using function setX with value {int}")
    public void i_set_x_using_function_set_x_with_value(Integer int1) {
        setX(int1 - this.speedX);
    }

    @Then("I set y using function setY with value {int}")
    public void i_set_y_using_function_set_y_with_value(Integer int1) {
        setY(int1 - this.speedY);
    }

    @Then("having getX > centerX OR getY > centerY")
    public void having_get_x_center_x_or_get_y_center_y() {
        assertThat(this.getX(), lessThan(this.endX));
        assertThat(this.getY(), lessThan(this.endY));
    }

    @Then("I set <up> with value {long}")
    public void i_set_up_with_value(Long l1) {
        // convert boolean to int:
        this.up = true;
        int myInt = this.up ? 1 : 0;
        Assert.assertEquals((long)myInt, (long)l1);
    }

}
