import java.util.Scanner;

public class Main {
	
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
			System.out.println(command + ": command not found");
		}
	}
}
