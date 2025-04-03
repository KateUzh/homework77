public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int saving = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month += 1;
            total = total + saving;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
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
        int birthPerThousand = 17;
        int mortalityPerThousand = 8;
        for (int i = 0; i <= 10; i++) {
            populationY += populationY / 1000 * (birthPerThousand - mortalityPerThousand);
            System.out.println("Год " + i + ", численность населения составляет " + populationY);
        }
        System.out.println("\nЗадание 4");
        total = 15000;
        double percent = 7D / 100;
        for (int i = 1; total < 12_000_000; i++) {
            total += (int) (total * percent);
            System.out.println("Месяц " + i + ", накоплено " + total);
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