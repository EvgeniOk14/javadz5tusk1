import java.util.Scanner;

public class scanFile 
{
    public static int scanOperation()
    {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.println("Введите номер операции: ");
        int number = sc.nextInt();
        return number;
    }
    
    public static String scanFamily()
    {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.println("Введите фамилию: ");
        String family = sc.nextLine();
        return family;
    }

    public static String scanFone()
    {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.println("Введите телефон: ");
        String firstPhone = sc.nextLine();
        return firstPhone;
    }

    public static String scanExtraFone()
    {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.println("Введите добавочный телефон: ");
        String extraPhone = sc.nextLine();
        return extraPhone;
    }
}
