public class Main {
    public static void main(String[] args) {

        /**
         * Условный оператор if-else
         */
        boolean isRain = false;
        System.out.println("Надеть куртку");
        System.out.println("Надеть обувь");
        System.out.println("Взять сумку");
        if (isRain) {
            System.out.println("Взять зонт");
        }

        Long a = 1000L;
        Long b = 1000L;
        System.out.println(a.equals(b));

        String animal = "dog";
        if (animal.equals("cat")) {
            System.out.println("Мяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Хрю");
        }

        int floor = 1;
        double price = 3000;
        if (floor == 1 && price == 3000) {
            System.out.println("Подходит для аренды!");
        }

        // Тернарный оператор
        int abc = 6;
        System.out.println(abc > 0 ? "a положительное число" : "а неполжительное число");

        /**
         * Условный оператор switch
         */

        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль");
                break;
            case "bear":
                System.out.println("rrrr");
                break;
            default:
                System.out.println("Привет!");
        }

        /**
         * Циклы
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Выход из цикла
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++) {

            // проверка на четность
            if (i % 2 != 0) {
                // пропуск итерации
                continue;
            }
            System.out.println(i);
        }
        /** Homework
        * #1 if-else
         * 1.1 Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным
        */
        int chislo = 49;
        if (chislo % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        /**
         * 1.2 Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»
         */
        int pervoye = 41;
        int vtoroye = 44;
        if (pervoye > vtoroye) {
            System.out.println("Первое больше");
        } else if (pervoye < vtoroye) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны");
        }

        /**
         * 1.3 Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
         */
        int z = 0;
        if (z > 0) {
            System.out.println("Положительное");
        } else if (z < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Равно нулю");
        }

        /**
         * 1.4 Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен»
         */
        int age = 17;
        if (age >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        /**
         * 1.5 Дан цвет таблетки от Морфеуса. Если "красный" - "Вы пробудились". Если "синий" - "Бесконечный сон в матрице". Иначе - "Не ешь это!"
         */
        String pilulya = "красный";
        if (pilulya.equals("красный")) {
            System.out.println("Вы пробудились");
        } else if (pilulya.equals("синий")) {
            System.out.println("Бесконечный сон в матрице");
        } else {
            System.out.println("Не ешь это!");
        }


    }
}