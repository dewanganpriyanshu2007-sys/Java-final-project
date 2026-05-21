import java.util.*;
class ConverterEngine {
    double USD_TO_INR = 83.0;
    double EUR_TO_INR = 90.0;
    double GBP_TO_INR = 105.0;

    ConverterEngine() {
    }
    double convert(double amount, String currencyType) {
        switch (currencyType.toUpperCase()) {
            case "USD":
                return amount * USD_TO_INR;
            case "EUR":
                return amount * EUR_TO_INR;
            case "GBP":
                return amount * GBP_TO_INR;
            default:
                System.out.println("Error: Unsupported currency type '" + currencyType + "'");
                return 0.0;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Global Currency Converter ---");
        
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        
        System.out.print("Enter Currency Type(USD, EUR, GBP): ");
        String currency = sc.next();

        ConverterEngine c= new ConverterEngine();
        double result = c.convert(amount, currency);
        
        System.out.println("\nConverted Amount in INR: " + result);
    }
}