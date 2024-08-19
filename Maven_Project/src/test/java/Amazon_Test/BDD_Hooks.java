package Amazon_Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BDD_Hooks {
	
	@Before
	public void pre_con()
	{
		System.out.println("Open Browser");
	}
	
	@After
	public void post_con()
	{
		System.out.println("Close Browser");
	}

}
