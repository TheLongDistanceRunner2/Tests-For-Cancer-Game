package testy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class MotionCellTestFalse {
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

    //==================================================================

    @Given("There is <up> equal to {long}")
    public void there_is_up_equal_to(Long l1) {
        // convert boolean to int:
        this.up = false;
        int myInt = this.up ? 1 : 0;
        Assert.assertEquals((long)myInt, (long)l1);
    }

    @Then("I set x using setX with value {int}")
    public void i_set_x_using_set_x_with_value(Integer int1) {
        setX(int1 - this.speedX);
    }

    @Then("I set y using setY with value {int}")
    public void i_set_y_using_set_y_with_value(Integer int1) {
        setY(int1 - this.speedY);
    }

    @Then("having getX < endX OR getY < endY")
    public void having_get_x_end_x_or_get_y_end_y() {
        assertThat(this.getX(), greaterThan(this.endX));
        assertThat(this.getY(), greaterThan(this.endY));
    }

    @Then("I set <up> with {long}")
    public void i_set_up_with(Long l1) {
        // convert boolean to int:
        this.up = false;
        int myInt = this.up ? 1 : 0;
        Assert.assertEquals((long)myInt, (long)l1);
    }

}
