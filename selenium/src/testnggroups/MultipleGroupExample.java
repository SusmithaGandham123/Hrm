package testnggroups;

import org.testng.annotations.Test;

public class MultipleGroupExample {
	 @Test(groups = { "group-one" })
	    public void test1() {
	        System.out.println("Test method one belonging to group.");
	    }
	 
	    @Test(groups = { "group-one", "group-two" })
	    public void test2() {
	        System.out.println("Test method two belonging to both group.");
	    }
	 
	    @Test(groups = { "group-two" })
	    public void test3() {
	        System.out.println("Test method three belonging to group.");
	    }
	
}


