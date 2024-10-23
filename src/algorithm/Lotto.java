package algorithm;
import java.util.HashSet;

// 새싹반 로또 번호 추첨기
public class Lotto {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6) {
            int num = (int) (Math.random() * 44) + 1;
            numbers.add(num);
        }

        System.out.println(numbers.stream().sorted().toList());
    }
}
