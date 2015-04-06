import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
// begin Main
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		int key = 0;

		System.out.println("Enter 1 for 12.2");
		System.out.println("Enter 2 for 12.3");
		System.out.println("Enter 3 for 12.14");
		key = input.nextInt();
		switch (key) { // begin switch
		case 1:
			do { // begin do while
				try {
					System.out.println("Enter two integers.");
					int num1 = input.nextInt();
					int num2 = input.nextInt();

					int result = Math.math(num1, num2);
					System.out.println(num1 + " + " + num2 + " is " + result);
					continueInput = false;
				} catch (InputMismatchException ex) {
					System.out
							.println("Error. Input mismatch exception. \rTry again.");
					input.nextLine();
				} //end catch
			} while (continueInput); // end do while
			break;

		case 2:

			int array[] = new int[100];
			Random number = new Random();

			for (int i = 0; i < array.length; i++) {
				array[i] = number.nextInt(100) + 1;
			} // end for
			boolean continueInput1 = true;
			do {
				try {
					System.out.println("Enter the index:");
					int arrayKey = input.nextInt();
					System.out.println("The number in index " + arrayKey
							+ " is ..." + array[arrayKey]);
					continueInput1 = false;
					System.out.println("Program ends.");
				}// end of try
				catch (IndexOutOfBoundsException ex) {
					System.out.println("Try again.(Index is out of bounds)");
					System.out.println("Program continues...");
					input.nextLine();
				}// end of catch
			}// end of do
			while (continueInput1);
			break;

		case 3:
			boolean continueInput2 = true;
			do { // begin do
				System.out.println("The following data is in scores.txt.");
				java.io.File file = new java.io.File(
						"C:\\Users\\Will\\Desktop\\eclipseworkspace\\ExceptionHandling\\scores.txt");
				Scanner input1 = new Scanner(file);
				while (input1.hasNext()) {
					String firstName = input1.next();
					String mi = input1.next();
					String lastName = input1.next();
					int score = input1.nextInt();
					System.out.println(firstName + " " + mi + " " + lastName
							+ " " + score);
				} // end while
				int total = 0, count = 0, average = 0;
				// runs infinitely.. why?
				while (input.hasNext()) {
					int num = input.nextInt();
					total += num;
					count++;
				}// end of while
				average = total / count;
				System.out.println("The sum of the " + count + " scores is: "
						+ total);
				System.out.println("The average of the " + count
						+ " scores is: " + average);
				input1.close();
				continueInput2 = false;
			}// end do while
			while (continueInput2);

			break;
		} // end switch
	}
} // end main
