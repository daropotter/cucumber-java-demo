import com.example.Adder;
import com.example.Multiplicator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {
    private final Adder adder;
    private final Multiplicator multiplicator;

    private int sum;
    private int product;

    public MyStepdefs() {
        this.adder = new Adder();
        this.multiplicator = new Multiplicator();
    }

    @When("I add together {int} and {int}")
    public void iAddTogetherAnd(int x, int y) {
        sum = adder.sum(x,y);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int sum) {
        Assertions.assertEquals(sum, this.sum);
    }

    @When("I multiply {int} and {int}")
    public void iMultiplyAnd(int arg0, int arg1) {

    }

    @Then("the product should be {int}")
    public void theProductShouldBe(int arg0) {
    }
}
