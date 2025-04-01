public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int saving = 15000;
        int total = 0;
        int c = 0;
        while (total < 2_459_000) {
            c += 1;
            total = total + saving;
            System.out.println("Месяц " + c + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nЗадание 2");
        int a = 1;
        while (a < 11) {
            System.out.print(a + " ");
            a += 1;
        }
        System.out.println("\n");
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println("\n\nЗадание 3");
        int populationY = 12_000_000;
        int birth = 17 * populationY / 1000;
        int mortality = 8 * populationY / 1000;
        for (int i = 1; i < 11; i += 1) {
            populationY = populationY + birth - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + populationY);
        }
        System.out.println("\nЗадание 4");
        total = 15000;
        for (int i = 0; total < 12_000_000; i++) {
            System.out.println("Месяц " + i + ", накоплено " + total);
            total = total + total / 100 * 7;
        }
        System.out.println("\nЗадание 5");
        total = 15000;
        for (int i = 0; total < 12_000_000; i++) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", накоплено " + total);
            }
            total = total + total / 100 * 7;
        }
        System.out.println("\nЗадание 6");
        int periodInYear = 9;
        int periodInMonth = periodInYear * 12;
        total = 15000;
        for (int i = 0; i < periodInMonth; i++) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", накоплено " + total);
            }
            total = total + total / 100 * 7;
        }
        System.out.println("\nЗадание 7");
        int firstFriday = 3;
        for (int i = 0; i + firstFriday <= 31; i += 7) {
            int currentDate = firstFriday + i;
            System.out.println("Сегодня пятница, " + currentDate + "-е число. Необходимо подготовить отчёт");
        }
        System.out.println("\nЗадание 8");
        int currentDate = 2025;
        int startRange = currentDate - 200;
        int finishRange = currentDate + 100;
        for (int i = 0; i < finishRange; i += 79) {
            if (i > startRange) {
                System.out.println(i);
            }
        }
    }
}