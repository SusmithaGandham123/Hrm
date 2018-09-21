package testnggroups;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups={"default-group"})

public class DefaultGroup {
	@BeforeTest
	  public static void beforeTest(){
		System.out.println("Before Test");
	}
		  public void test1(){
		    System.out.println("Test method one.");
		  }
		   
		  public void test2(){
		    System.out.println("Test method two.");
		  }
		   
		  @Test(groups={"test-group"})
		  public void test3(){
		    System.out.println("Test method three.");
		  }
	@AfterTest
	 public void afterTest(){
		System.out.println("AfterTest");
	}

}
