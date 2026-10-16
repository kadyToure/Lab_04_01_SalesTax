public class SalesTax
{
    void main() {
        {
            // pretend this is user input
            double purchasePrice = 35.30;
            // final makes it a constant
            final double SALES_TAX_RATE = 0.05;
            double saleTax = 0;
            double total = 0;

            saleTax = purchasePrice * SALES_TAX_RATE;
            total = saleTax + purchasePrice;

            // Java 1.8 System.out.println
            // Modern java 24+ IO.println

            IO.println("The sales tax on " + purchasePrice + " is " + saleTax );
            IO.println("The total cost is " + total );

        }
    }

}
