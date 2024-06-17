import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDuplicateWords {
    public static void main(String[] args) {
        // (?i)：這是一個內嵌標誌，表示接下來的匹配應該忽略大小寫
        // \\b：這是一個單詞邊界。它確保我們匹配的單詞是一個完整的單詞，而不是其他單詞的一部分。
        // (\\w+)：這是一個捕獲組，匹配一個或多個單詞字符（等同於 [a-zA-Z0-9_]）。+ 表示一個或多個該字符。這個組會匹配一個完整的單詞。
        // (\\s+\\1\\b)+：這是另一個捕獲組，用於匹配重複的單詞。\\s+ 匹配一個或多個空格，\\1 是一個反向引用，匹配與前面的第一個捕獲組（即 (\\w+)）相同的內容。\\b 再次確保我們匹配的是一個完整的單詞。最後的 + 表示這個組可以出現一次或多次，這意味著它可以匹配多個重複的單詞。
        // (?:\\s+\\1)+：這是一個非捕獲組，用於匹配重複的單詞。\\s+ 匹配一個或多個空格，\\1 是一個反向引用，匹配與前面的第一個捕獲組（即 (\\w+)）相同的內容。+ 表示這個組可以出現一次或多次，這意味著它可以匹配多個重複的單詞。
        String regex = "(?i)\\b(\\w+)\\b(?:\\s+\\1)+\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            while (m.find()) {
                // 把整個符合的 group 替換成第一個
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        in.close();
    }
}