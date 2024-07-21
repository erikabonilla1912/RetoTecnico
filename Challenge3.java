package retotecnico;
import java.util.Arrays;

public class Challenge3 {

    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        int result = minimumChange(coins);
        System.out.println(result);
    }

    private static int minimumChange(int[] coins) {
        Arrays.sort(coins);
        int currentChangeCreated = 0;
        for (int coin : coins) {
            if (coin > currentChangeCreated + 1) {
                return currentChangeCreated + 1;
            }
            currentChangeCreated += coin;
        }
        return currentChangeCreated + 1;
    }
}