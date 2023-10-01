package developnment;

import org.testng.annotations.Test;

public class DevelopmentTest {
	@Test(groups = {"smoke","regression"})
	public void demo() {
		System.out.println("demo Started");
	}

}
