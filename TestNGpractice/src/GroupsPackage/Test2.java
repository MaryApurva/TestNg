package GroupsPackage;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups={"regression"})
	public void testr2()
	{
		System.out.println("Regression testcase2");
	}
	@Test(groups={"regression"})
	public void testr3()
	{
		System.out.println("Regression testcase3");
	}
@Test(groups={"smoke"})
public void test4()
{
	System.out.println("smoke testcase4");
}

}
