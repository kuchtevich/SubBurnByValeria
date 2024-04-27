import java.util.Scanner;

public class SUbBurnByValeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SubScription subScription = new SubScription();

        System.out.println("Добро пожаловать в салон SunBurn_by_Valeria");
        System.out.println("Выберите в меню, что Вы хотите сделать?");

        printMenu();
        int command = scanner.nextInt();

        if (command==1 ) {
            System.out.println("На какое количество посещений хотите приобрети абонимент?");
            System.out.println("1- 3 посещения"); //скидка 5%
            System.out.println("2- 5 посещения"); //скидка 10%
            System.out.println("3- 10 посещения"); //скидка 15%
            int number = scanner.nextInt();
            subScription.calculateSubScription(number);
        }
    }

    static void printMenu(){
        System.out.println("1- Выбрать услугу.");
        System.out.println("2 - Купить абонимент.");
        System.out.println(" 3- Приобрести дополнительный уход для тела.");
    }
}