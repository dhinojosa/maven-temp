package com.vmware.asimov;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class EmployeeTest {
	@Test
	public void testCreationOfAnEmployee() {
	    Employee employee = new Employee();
	    employee.setFirstName("Ramkumar");
	    employee.setLastName("Srirengaram Gunasegharan");
		assertEquals(employee.getFirstName(), "Ramkumar");
		assertEquals(employee.getLastName(), "Srirengaram Gunasegharan");
	}
}
