import javax.swing.plaf.SliderUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        stepTracker.StepTracker();
        printMenu();

        int userInput = scanner.nextInt();
            while (userInput != 0) {
                System.out.println("Введена неверная команда!");
                // обработка разных случаев
                if (userInput == 1) {
                        System.out.println("За какой месяц хотите изменить кол-во шагов?");
                    int currencyMonth = scanner.nextInt();
                    System.out.println("За какой день хотите изменить кол-во шагов?");
                    int currencyDay = scanner.nextInt();
                    System.out.println("Сколько шагов вы прошли за этот день?");
                    int currencyDayStep = scanner.nextInt();

                    if (currencyDayStep >= 0) {
                        stepTracker.monthToData[currencyMonth].stepEdit(currencyDayStep, currencyDay);
                    }
                    else {
                        System.out.println("Введите корректное значение!");
                    }
                }
                if (userInput == 2) {
                    System.out.println("За какой месяц хотите получить статистику?");
                    int currencyMonth = scanner.nextInt();
                    stepTracker.monthToData[currencyMonth].numberOfSteps(currencyMonth);
                }
                if (userInput == 3) {
                    System.out.println("Какая ваша новая цель по шагам?");
                    int currencyGoal = scanner.nextInt();
                    if (currencyGoal >= 0) {
                        stepTracker.monthData.setGoal(currencyGoal);
                    }
                    else {
                        System.out.println("Введите корректное значение!");
                }
                }
                if (userInput == 4) {
                    System.out.println("Выход");
                    break;
                }
                printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
                userInput = scanner.nextInt(); // повторное считывание данных от пользователя
            }
            System.out.println("Программа завершена");
        }


    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выйти из приложения");

    }
} 