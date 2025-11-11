import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mshl.util.Evaluator;

public class Main {
	
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	private static Integer exitStatus=0;
	
	public static void main(String[] args) throws Exception {
		// TODO: Uncomment the code below to pass the first stage
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("$ ");
			String command = scanner.nextLine();
			if(command.contains("exit")) {
				String[] values = command.split(" ");
				exitStatus = Integer.parseInt(values[1]);
				break;
			}
			
			try {
				Evaluator.eval(command);
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		
		scanner.close();
	}
	
}
