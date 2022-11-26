import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        String str = "I love Java Lessons";
        System.out.println(str.charAt(0));
        System.out.println(str.contains("love"));
        System.out.println(str.replace('o','a'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(12,19));
        System.out.println(str.indexOf("l"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println(" hello "+ name);
        System.out.println("Firs letter of name is "+ name.charAt(0));

        double a = 59.976;
        int b = (int) a;
        System.out.println (b);

        int c = 475;
        char d = (char) c;
        System.out.println (d);















    }
}
