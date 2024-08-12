import org.w3c.dom.ls.LSOutput;

import javax.security.auth.callback.CallbackHandler;

public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("Task 1");
        int age = 7;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ",  он не достиг совершеннолетия, нужно немного подождать");
        }

//Task 2
        System.out.println("    ");
        System.out.println("Task 2");
        int temperature = 13;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

//Task 3
        System.out.println("    ");
        System.out.println("Task 3");
        int speed = 61;
        if (speed > 60) { //при 60км/ч штрафа не будет
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно ");
        }

        //Task 4
        System.out.println("    ");
        System.out.println("Task 4");
        int Age = 6;
        if (Age >= 2 && Age < 7) {
            System.out.println("Если возраст человека равен " + Age + ", то ему нужно ходить в детский сад");
        } else if (Age >= 7 && Age < 17) {
            System.out.println("Если возраст человека равен " + Age + ", то ему нужно ходить в школу");
        } else if (Age >= 17 && Age <= 24) {
            System.out.println("Если возраст человека равен " + Age + ", то ему нужно ходить в университет");
        } else if (Age > 24) {
            System.out.println("Если возраст человека равен " + Age + ", то ему нужно ходить на работу");
        }

        //Task 5
        System.out.println("    ");
        System.out.println("Task 5");
        int childAge = 14;
        if (childAge < 5) {
            System.out.printf("Если возраст ребенка " + childAge + ", то он не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.printf("Если возраст ребенка " + childAge + ", то он может кататься на аттракционе в сопровождении взрослых");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка " + childAge + ", то он может кататься на аттракционе без сопровождения взрослых");
        }
//Task 6
        System.out.println("    ");
        System.out.println("Task 6");
        int allSeats = 102;
        int sit = 60;
        int stand = allSeats - sit;

        int freeSit;
        int freeStand;
        int occupySeats = 42;

        if (occupySeats <= sit) {
            freeSit = sit - occupySeats;
            System.out.println("Есть " + freeSit + " сидячих мест и " + stand + " стоячих мест");
        } else if (occupySeats > sit && occupySeats < allSeats) {
            freeStand = allSeats - occupySeats;
            System.out.println("Есть " + freeStand + " стоячих мест");
        } else {
            System.out.println("Мест нет");
        }
        //Task 7
        System.out.println("    ");
        System.out.println("Task 7");
        int one = 13;
        int two = 42;
        int tree = 12;

        if (one > two && one > tree) {
            System.out.println("Большее число " + one);
        } else if (two > one && two > tree) {
            System.out.println("Большее число " + two);
        } else {
            System.out.println("Большее число " + tree);
        }


    }
}