package retotecnico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Challenge1 {

    public static void main(String[] args) {
        int S = 5; // Valor de S obtenido del hash MD5
        List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = invertAndFilterList(inputNumbers, S);
        System.out.println(result);
    }

    private static List<Integer> invertAndFilterList(List<Integer> numbers, int s) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int number : numbers) {
            StringBuilder filteredNumberStr = new StringBuilder();
            for (char c : String.valueOf(number).toCharArray()) {
                int digit = Character.getNumericValue(c);
                if (digit < s) {
                    filteredNumberStr.append(c);
                }
            }
            if (filteredNumberStr.length() > 0) {
                filteredNumbers.add(Integer.parseInt(filteredNumberStr.toString()));
            }
        }
        Collections.reverse(filteredNumbers);
        return filteredNumbers;
    }
}