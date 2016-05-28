package skeleton;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import skeleton.Belly.BellyNoise;

import static junit.framework.TestCase.*;

public class StepsDefs {
	
	private Belly belly;
	
	@Before
	public void setUp() {
		this.belly = new Belly();
	}

	@Given("I have (\\d+) cukes in my belly")
	public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
		this.belly.eat(cukes);
		assertEquals(cukes, belly.getNumberOfCukes());
	}

	@When("I wait (\\d+) hour")
	public void i_wait_hour(int hoursWaiting) throws Throwable {
		this.belly.setHoursWithoutFood(hoursWaiting);
		assertEquals(hoursWaiting, belly.getHoursWithoutFood());
	}
	
	@Then("my belly sould growl")
	public void my_belly_sould_growl() throws Throwable {
		assertEquals(BellyNoise.GROWL, belly.getBellyNoise());
	}
	
}
