public class Main {
    public static void main(String[] args) {
        // Задача 1;
        int age = 15;
        if (age >= 18) {
            System.out.println("Задача 1");
            System.out.println("Если возраст равен " + age + " , то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Задача 1");
            System.out.println("Если возраст равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задача 2
        // «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        // «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        // При выполнении каждого условия выведите в консоль: «На улице … градусов,
        // (вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».
        int temperature = 1;
        if (temperature < 5) {
            System.out.println("Задача 2");
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("Задача 2");
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        // Задача 3
        int speed = 50;
        if (speed < 60) {
            System.out.println("Задача 3");
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
        if (speed > 60) {
            System.out.println("Задача 3");
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф ");
        }
        // Задача 4
        int age4 = 21;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Задача 4");
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в детский сад");
        }
        if (age4 >= 7 && age4 <= 17) {
            System.out.println("Задача 4");
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в школу");
        }
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Задача 4");
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в университет");
        }
        if (age4 > 24) {
            System.out.println("Задача 4");
            System.out.println("Если возраст человека равен " + age4 + " , то ему пора ходить на работу ");
        }
        // Задача 5
        int age5 = 15;
        if (age5 < 5) {
            System.out.println("Задача 5");
            System.out.println("Если возраст ребенка равен " + age5 + " лет, то он не может кататься на аттракционе");
        }
        if (age5 > 5 && age5 < 14) {
            System.out.println("Задача 5");
            System.out.println("Если возраст ребенка равен" + age5 + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age5 > 14) {
            System.out.println("Задача 5");
            System.out.println("Если возраст ребенка равен " + age5 + " лет, то он то он может кататься без сопровождения взрослого");
        }
        // Задача 6
        // С помощью условного оператора и конструкции else напишите программу,
        // которая выводит в консоль сообщение о том, есть ли место в вагоне,
        // сидячее или стоячее, или вагон уже полностью забит.
        int people = 90;
        int сapacity = 102; // вместимость одного вагона поезда
        int seating = 60; // количество сидячих мест в вагоне
        if (people < сapacity  && people <= 60) {
            System.out.println("Задача 6");
            System.out.println("В вагоне есть сидячие места");
        }
        else if (people < сapacity  && people > 60) {
            System.out.println("Задача 6");
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Задача 6");
            System.out.println("Вагон забит");
        }
        // Задача 7
        int one = 7;
        int two = 2;
        int three = 3;
        // С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        // какое из трех чисел бо́льшее, и выводит результат в консоль.
        if (one > two && one > three){
            System.out.println("Задача 7");
            System.out.println("Чаибольшее число one, равное " + one);
        }
        else if (two > one && two > three){
            System.out.println("Задача 7");
            System.out.println("Чаибольшее число two, равное " + two);
        } else {
            System.out.println("Задача 7");
            System.out.println("Чаибольшее число three, равное " + three);
        }
    }
}

