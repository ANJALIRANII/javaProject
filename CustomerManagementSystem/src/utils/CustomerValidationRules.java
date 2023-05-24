package utils;

import java.time.LocalDate;
import java.util.Map;

import com.org.Customer;
import com.org.ServicePlan;

import custom_exception.CustomerHandlingException;

public class CustomerValidationRules {

	public static Customer vallidateAllInput(int id, String firstName, String lastName, String email, String password,
			double registrationAmount, String date, String plan, Map<Integer, Customer> customers)
			throws CustomerHandlingException {
		checkForDup(customers, id);
		LocalDate validDate = parseDate(date);
		ServicePlan validPlan = parsePlan(plan);
		return new Customer(id, firstName, lastName, email, password, registrationAmount, validDate, validPlan);
	}

	public static LocalDate parseDate(String dates) {
		LocalDate d1 = LocalDate.parse(dates);
		return d1;
	}

	public static ServicePlan parsePlan(String plans) {
		return ServicePlan.valueOf(plans.toUpperCase());
	}

	public static void checkForDup(Map<Integer, Customer> customers, int id) throws CustomerHandlingException {
		if (customers.containsKey(id))
			throw new CustomerHandlingException("duplicate...");
		System.out.println("no duplicate");
	}

}
