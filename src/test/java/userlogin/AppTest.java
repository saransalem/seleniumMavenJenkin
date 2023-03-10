package userlogin;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void check1()
	{
		validateLogin vl = new validateLogin();
		Assert.assertEquals(0, vl.checkUesr("test", "test"),"Test FAIL");		
	}
	@Test
	public void check2()
	{
		validateLogin vl = new validateLogin();
		Assert.assertEquals(1, vl.checkUesr("saran", "saran"),"Test PASS");
	}

}
