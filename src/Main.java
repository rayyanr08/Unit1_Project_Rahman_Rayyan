import java.util.Scanner;
import java.text.DecimalFormat;
// using scanner to take input and decimalformat to convert numbers to the nearest cent

public class Main {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("\033[0;1m" + "Tip Calculator:");
        System.out.println();
        System.out.println();

        // Taking in all inputs required (bill, tip %, number of people)

        Scanner money = new Scanner(System.in);
        System.out.println("Please enter the bill: ");
        String billAmount = money.nextLine();

        // initializing tip value and converting it into a decimal for easier calculations
        Scanner scannerTax = new Scanner(System.in);
        System.out.println("Please enter the tip percentage: ");
        String tipPercentage = scannerTax.nextLine();
        double tipDecimal = Double.parseDouble(tipPercentage) / 100;
        double totalTip = Double.parseDouble(billAmount) * tipDecimal;

        // Initializing number of people
        Scanner scannerPpl = new Scanner(System.in);
        System.out.println("Please enter the number of people: ");
        String numOfPeople = scannerPpl.nextLine();
        System.out.println();


        // Calculating values(Tip per person, total bill, total bill per person)
        double totalBill = Double.parseDouble(billAmount) * tipDecimal + Double.parseDouble(billAmount);
        double tipPerPerson = totalTip / Integer.parseInt(numOfPeople);

        // Outputting everything and formatting every value as a decimal so it rounds to the nearest cent
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Your total bill including tip is: $" + df.format(totalBill));
        System.out.println("Your total tip amount is: $" + df.format(totalTip));
        System.out.println("--------------------------");
        System.out.println("The total tip per person is: $" + df.format(tipPerPerson));
        System.out.println("Your total per person including tip is: $" + df.format(totalBill/Integer.parseInt(numOfPeople)));




    }

    }
