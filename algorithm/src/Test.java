import java.util.Arrays;
import java.util.List;

/**
 * @author hht
 * @date 2020/4/13 15:11
 */
public class Test {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        for (String aa : strings) {
            System.out.println(aa);
        }


        int i = 0;
        while (i < strings.size()) {
            System.out.println(strings.get(i));
            i++;
        }
    }
}
