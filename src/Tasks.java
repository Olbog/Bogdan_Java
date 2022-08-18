import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Tasks {

    private static final String NAME = "Вячеслав";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task_1(sc);
        Task_2(sc);
        Task_3(sc);
        sc.close();
    }

    private static void Task_1(Scanner sc) {
        System.out.println("Task №1");
        System.out.println("Please, enter your number: ");
        int count = sc.nextInt();
        System.out.println((count > 7) ? "Привет" : "This number < or = 7, sorry");
    }

    private static void Task_2(Scanner sc) {
        System.out.println("\nTask №2");
        System.out.println("Please, enter the name: ");
        String name = sc.next();
        System.out.println(name.equals(NAME) ? "Привет, " + NAME : "Нет такого имени");
    }

    private static void Task_3(Scanner sc) {
        System.out.println("\nTask №3");
        System.out.println("Enter the numbers separated by a space : ");
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String value : str) {
            int num = Integer.parseInt(value);
            if (num % 3 == 0) {
                list.add(num);
            }
        }
        System.out.println("Numbers that are multiples of three: " + list);

    }
}
