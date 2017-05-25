package testcases.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
 
public class Test_GroupAnnotations {
 
  @Test (groups = { "Car" })
 
  public void Car1() {
 
	  System.out.println("Batch Car - Test car 1");
 
  }
 
  @Test (groups = { "Car" })
 
  public void Car2() {
 
	  System.out.println("Batch Car - Test car 2");
	  //assertEquals("1", "0");
 
  }
 
  @Test (groups = { "Scooter" })
 
  public void Scooter1() {
 
	  System.out.println("Batch Scooter - Test scooter 1");
 
  }
 
  @Test (groups = { "Scooter" })
 
  public void Scooter2() {
 
	  System.out.println("Batch Scooter - Test scooter 2");
 
  }
 
  @Test (groups = { "Car", "Sedan Car"}, dependsOnMethods={"Car2"})
 
  public void Sedan1() {
 
	  System.out.println("Batch Sedan Car - Test sedan 1");
 
  }
 
}