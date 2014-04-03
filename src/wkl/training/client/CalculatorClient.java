package wkl.training.client;

import wkl.training.ws.Calculator;
import wkl.training.ws.CalculatorImplService;
import wkl.training.ws.Exception_Exception;

public class CalculatorClient {

	public static void main(String[] args) {

		try {
			CalculatorImplService service = new CalculatorImplService();
			Calculator client = service.getCalculatorImplPort();
			System.out.println(client.calculate(5, 0, "div"));
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}

	}

}
