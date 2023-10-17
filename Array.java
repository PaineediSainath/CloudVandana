import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// By running this code every single time, it will give a shuffled code.
public class Array {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        Collections.shuffle(myList);
        Integer[] shuffledArray = myList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(shuffledArray));
    }
}
