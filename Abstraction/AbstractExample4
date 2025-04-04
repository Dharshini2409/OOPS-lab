abstract class Bank {
    abstract double getInterestRate(); // Abstract method

    void showBankName() {
        System.out.println("Welcome to the Bank");
    }
}

// Subclass 1
class SBI extends Bank {
    double getInterestRate() {
        return 5.5;
    }
}

// Subclass 2
class HDFC extends Bank {
    double getInterestRate() {
        return 6.0;
    }
}
// Main class
public class AbstractExample4 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.showBankName();
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");

        b2.showBankName();
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
    }
}
