package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.CustomerValidationRules.*;
import com.org.Customer;
import com.org.ServicePlan;

public class TestCustomer {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Customer> map = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.add customer 2.display customer name 0.exit");
				System.out.println("choose any one :");
				try {
					switch (sc.nextInt()) {
					case 1:
//						private int id;
//						private String firstName;
//						private String lastName;
//						private String email;
//						private String password;
//						private double registrationAmount;
//						private LocalDate date;
//						private ServicePlan plan;
						System.out.println(
								"enter customer details : id firstName lastname email password registrationamount date plan");
						Customer validateinput = vallidateAllInput(sc.nextInt(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextDouble(), sc.next(), sc.next(), map);
						map.put(validateinput.getId(), validateinput);
						System.out.println(" customer added");
						break;

					case 2:
						System.out.println("display customer details");
						map.forEach((k, v) -> System.out.println(v));
						break;
					case 0:
						exit = true;
						System.out.println("thank you for visiting");
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
