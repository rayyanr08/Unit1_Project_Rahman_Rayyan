import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("\033[0;1m" + "Tip Calculator:");
        System.out.println();
        System.out.println();

        // Taking in all inputs required (bill, tip %, number of people)

        Scanner money = new Scanner(System.in);
        System.out.println("Please enter the bill: ");
        String bill = money.nextLine();

        // initializing tip value and converting it into a decimal for easier calculations
        Scanner tax = new Scanner(System.in);
        System.out.println("Please enter the tip percentage: ");
        String tip = tax.nextLine();
        Double tipDecimal = Double.parseDouble(tip) / 100;

        Scanner ppl = new Scanner(System.in);
        System.out.println("Please enter the number of people: ");
        String numOfPeople = ppl.nextLine();


        // Calculating values(Tip per person, total bill, total bill per person)
        double totalBill = Double.parseDouble(bill) * tipDecimal + Double.parseDouble(bill);
        double tipPerPerson = totalBill / int.Parseint(numOfPeople);
    }

    }
