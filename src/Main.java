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
        /**
        * #2 Тернарный оператор
        * 2.1 Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое
        */
        int y = 0;
        System.out.println(y > 0 ? "Y положительное число" : y < 0 ? "Y отрицательное число" : "Y нулевое число");

        /**
         * 2.2 Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»
         */
        int d = 15;
        System.out.println(d % 3 == 0 && d % 5 ==0 ? "Кратно" : "Не кратно");

        /**
         * 2.3 Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.
         */
        int f = 11;
        System.out.println(f % 2 == 0 ? "Четное" : "Нечетное");

        /**
         * #3 switch
         * 3.1 Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»
         */
        int dayOfWeek = 7;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }

        /**
         * 3.2 Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)
         */
        int assessment = 0;
        switch (assessment) {
            case 1:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Приходи на пересдачу");

        }

        /**
         * #4 for
         * 4.1 Дан список чисел. Посчитайте сумму всех четных элементов
         */
        int [] spisok1 = {1, 2, 1, 2, 1, 2, 1};
        int summ1 = 0;
        for (int j = 1; j < spisok1.length; j = j + 2) {
            summ1 += spisok1[j];
        }
            System.out.println(summ1);

        /**
        * 4.2 Дан список чисел. Найдите максимальное значение
        */
        int [] spisok2 = {1, 2, 3, 4, 5, 10, 8, 1, 11};
        int maximum = 0;
        for (int k = 0; k < spisok2.length; k++) {
            if (spisok2[k] > maximum) {
                maximum = spisok2[k];
            }
        }
        System.out.println(maximum);

        /**
         * 4.3 Дано число n. Выведите таблицу умножения для n от 1 до 10
         */
        int n = 5;
        for (int l = 1; l < 11; l++) {
            System.out.printf("%s * %s = %s", n, l, n*l);
            System.out.println();
        }

        /**
         * 4.4 С помощью цикла for выведите числа от 10 до 1 в обратном порядке
         */
        int m = 10;
        for (int aa = 0; aa < 10; aa++) {
            System.out.print(m + " ");
            m -= 1;
        }
        System.out.println();

        /**
         * 4.5 Найдите количество четных чисел в диапазоне от 1 до 50
         */
        double number = 0;
        int amount = 0;
        for (int bb = 1; bb < 51; bb++) {
            number += 1;
            if (number % 2 == 0) {
                amount += 1;
            }
        }
        System.out.printf("Количество четных чисел: %s", amount);
        System.out.println();

        /**
         * #5 while
         * 5.1 Найдите наименьшее число больше 100, которое делится на 7
         */
        int cc = 100;
        while (cc % 7 != 0) {
            cc +=1;
        }
        System.out.println("Наименьшее число больше 100, которое делится на 7: " + cc);

        /**
         * 5.2 Дано число n. Вычислите его факториал через цикл while
         */
        int N = 3;
        int nn = 1;
        int fctr = 1;
        while (nn <= N) {
            fctr *= nn;
            nn ++;
        }
        System.out.printf("Факториал %s равен %s", N, fctr);
        System.out.println();

        /**
         * 5.3 Дано число. Определите, является ли оно простым
         */
        int X = 13;
        int mm = 1;
        int chek = 0;
        while (mm <= X) {
            if (X % mm == 0) {
                chek++;
            }
            mm++;
        }
        System.out.printf("Число %s простое? - %s", X, chek == 2);






    }
}