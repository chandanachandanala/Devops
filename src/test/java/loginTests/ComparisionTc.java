package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisionTc {
  @Test
  public void compare() {
	  Assert.assertTrue(15>6);
  }
}
