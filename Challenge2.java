package retotecnico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Challenge2 {

    public static void main(String[] args) {
        int S = 5; // Valor de S obtenido del hash MD5
        List<Integer> inputArray = List.of(1, 2, 3, 5, 6, 8, 9);
        List<Integer> result = sortedSquaredArray(inputArray, S);
        System.out.println(result);
    }

    private static List<Integer> sortedSquaredArray(List<Integer> numbers, int s) {
        int sSquared = s * s;
        List<Integer> squaredNumbers = new ArrayList<>();
        for (int number : numbers) {
            int squared = number * number;
            if (squared <= sSquared) {
                squaredNumbers.add(squared);
            }
        }
        Collections.sort(squaredNumbers);
        return squaredNumbers;
    }
}
