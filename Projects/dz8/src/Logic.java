import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Logic {
    static int b = 1;

    public static void findSymbolOccurrence(String line, String symbol) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            String b = String.valueOf(line.toLowerCase().charAt(i));
            if (b.equals(symbol.toLowerCase())) {
                count++;
            }
        }
        System.out.printf("%s символов\n", count);
    }

    public static void findWordPosition(String source, String target) {
        System.out.println(source.indexOf(target));
    }

    public static void stringReverse(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        System.out.println(result);
    }

    public static void isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }

    public static void run() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        short riddledIndex = (short) (Math.random() * 25);
        String riddledWord = Arrays.asList(words).get(riddledIndex);
        System.out.printf("Компьютер загадал слово, напишите ваш ответ латинским алфавитом нижнего регистра\n %s", riddledWord.replaceAll(".", "#"));
        System.out.printf("              [%s Подсказка для теста]", riddledWord);
        String fakeRiddledWord = riddledWord.replaceAll(".", "#");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if (Objects.equals(answer, riddledWord)) {
            System.out.println("Ответ правильный!");
        } else {
            while (!Objects.equals(answer, riddledWord)) {
                doReplacement(riddledWord, answer,fakeRiddledWord);
                while (!Objects.equals(answer, riddledWord)) {
                    System.out.printf("\n Ещё одна попытка!\n");
                    answer = scan.nextLine();
                    doReplacement(riddledWord, answer,fakeRiddledWord);
                    if (Objects.equals(answer, riddledWord)) {
                        System.out.println("Ответ правильный!");
                        return;
                    }
                }
            }
        }
    }

    private static void doReplacement(String riddledWord, String answer, String fakeRiddledWord) {
        char[] riddledWordToArr = riddledWord.toCharArray();
        char[] answerToArr = answer.toCharArray();
        for (int i = 0; i < answer.length(); i++) {
            b++;
            String c1 = String.valueOf(riddledWordToArr[i]);
            String c2 = String.valueOf(answerToArr[i]);
            if (c1.equals(c2)) {
                StringBuilder str = new StringBuilder(fakeRiddledWord);
                str.setCharAt(i, c1.charAt(0));
                fakeRiddledWord = str.toString();
                System.out.println(fakeRiddledWord);
            }
        }
    }
}



