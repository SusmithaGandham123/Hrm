package testnggroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Excludindgroups {
	@Test(groups = { "i" })
    public void test1() {
        System.out.println("Test method one belonging to include group.");
    }
 
    @Test(groups = { "e" })
    public void test2() {
        System.out.println("Test method two belonging to include group.");
    }
 
    @Test(groups = {  "i" })
    public void test3() {
        System.out.println("Test method three belonging to exclude/include groups.");
        Assert.assertEquals(12, 12);
    }

}
