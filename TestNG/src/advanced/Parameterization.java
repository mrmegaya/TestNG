package advanced;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Test
	@Parameters({"username"})
	public void display(String username) {
		System.out.println("The Name is "+username);
		//username
	}

}
