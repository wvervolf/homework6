public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("задание 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
            System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 5");
        for (int i = 1904; i<=2096; i = i + 4){
            System.out.println(i + " Год является високосным");
        }
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задание 8;9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            total = total + total/100;
            System.out.println("Месяц " + i + " Сумма накоплений " + total + " рублей");
        }
        System.out.println("Задание 10");
        int mnojitel = 2;
        for (int i = 1; i <= 10; i = i+1){
            System.out.println("2 * " + i + " = " + (i * mnojitel));
        }
    }
}