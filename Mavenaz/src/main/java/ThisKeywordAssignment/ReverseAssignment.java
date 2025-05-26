package ThisKeywordAssignment;

public class ReverseAssignment {
    int number;

    ReverseAssignment() {
        System.out.println("Finding reverse");
    }

    ReverseAssignment(int number) {
        this();
        this.number = number;
    }

    public static void main(String[] args) {
        ReverseAssignment number = new ReverseAssignment(1234);
        number.display();
    }

    public void display() {
        int num = number;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse: " + reverse);
    }
}
