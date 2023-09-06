
package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MarsRovers;

import static org.junit.Assert.assertEquals;

public class MarsRoverStepDef {
    private int x;
    private int y;
    private char direction;
    private String instructions;
    private String finalPosition;

    @Given("^a plateau with upper-right coordinates (\\d+) (\\d+)$")
    public void aPlateauWithUpperRightCoordinates(int upperX, int upperY) {
        // You can set up any necessary data for the plateau here, if needed.

    }

    @Given("^a rover positioned at (\\d+) (\\d+) ([NSEW])$")
    public void aRoverPositionedAt(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @When("^the rover moves with the command \"([^\"]*)\"$")
    public void theRoverMovesWithCommand(String commands) {
        this.instructions = commands;
        finalPosition = MarsRovers.moveRover(x, y, direction, instructions);
    }

    @Then("^the rover's position should be (\\d+) (\\d+) ([NSEW])$")
    public void theRoverPositionShouldBe(int expectedX, int expectedY, char expectedDirection) {
        String expectedPosition = expectedX + " " + expectedY + " " + expectedDirection;
        assertEquals(expectedPosition, finalPosition);
    }

}
