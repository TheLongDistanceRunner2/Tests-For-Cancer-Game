package testy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SquareTest {
    private int x;
    private int y;
    private int width;
    private int height;
    private int _xPoint;
    private int _yPoint;

    @Given("There is variable <x> equal to {int}")
    public void there_is_variable_x_equal_to(Integer int1) {
        this.x = int1;
    }

    @Given("There is variable <y> equal to {int}")
    public void there_is_variable_y_equal_to(Integer int1) {
        this.y = int1;
    }

    @Given("There is variable <width> equal to {int}")
    public void there_is_variable_width_equal_to(Integer int1) {
        this.width = int1;
    }

    @Given("There is variable <height> equal to {int}")
    public void there_is_variable_height_equal_to(Integer int1) {
        this.height = int1;
    }

    @When("Point <x> <y> is inside of the square {int} {int}")
    public int point_x_y_is_inside_of_the_square(Integer int1, Integer int2) {
        this._xPoint = int1;
        this._yPoint = int2;

        if ((this._xPoint >= this.x && this._xPoint <= this.x + this.width) &&
                (this._yPoint >= this.y && this._yPoint <= this.y + this.height)) {
            return 1;
        }

        return 0;
    }

    @Then("Function returns {int}")
    public void function_returns(Integer int1) {
        Assert.assertEquals((long)int1, (long)this.point_x_y_is_inside_of_the_square(this._xPoint, this._yPoint));
    }
}
