import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNum = rand.nextInt(100); // generates number between 0 and 99

        System.out.println("Random number: " + randomNum);
    }
}
