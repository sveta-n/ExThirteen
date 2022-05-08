import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку слов через проблел: ");
        String str = scanner.nextLine();

        String[] subStr = str.split(" ");

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
            count++;
        }
        System.out.println(count);
    }
}