public class Main {

    public static void main(String[] args) {
        //Задача 1
        int humanAge = 24;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен " + humanAge + ", то он совершеннолетний.");
        }
        humanAge = 15;
        if (humanAge < 18) {
            System.out.println("Если возраст человека равен " + humanAge + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        //Задача 2
        int temperature = -1;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        temperature = 7;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        //Задача 3
        int carSpeed = 90;
        if (carSpeed > 60) {
            System.out.println("Если скорость машины составляет " + carSpeed + " то придется заплатить штраф.");
        }
        carSpeed = 55;
        if (carSpeed <= 60) {
            System.out.println("Если скорость машины составляет " + carSpeed + " то можно ездить спокойно.");
        }

        //Задача 4
        int personAge = 30;
        //int personAge = 5;
        //int personAge = 15;
        //int personAge = 21;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else {
            if (personAge >= 7 && personAge <= 17) {
                System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
            } else {
                if (personAge >= 18 && personAge <= 24) {
                    System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
                } else {
                    if (personAge > 24) {
                        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
                    }
                }
            }
        }

        //Задача 5
        //int childAge = 4;
        int childAge = 13;
        //int childAge = 15;
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else {
            if (childAge >= 5 && childAge < 14) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                if (childAge >= 14) {
                    System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
                }
            }
        }

        //Задача 6
        int trainFullness = 59;
        //int trainFullness = 85;
        //int trainFullness = 102;
        if (trainFullness <= 60){
            System.out.println("Если в вагоне " + trainFullness + " мест занято, то в вагоне еще есть сидячее место.");
        } else{
            if (trainFullness > 60 && trainFullness < 102){
                System.out.println("Если в вагоне " + trainFullness + " мест занято, то в вагоне еще есть стоячее место.");
            }else {
                System.out.println("Вагон уже полностью забит");
            }
        }

        //Задача 7
        int one = 15;
        int two = 48;
        int three = 35;
        if(one > two){
            if(one > three){
                System.out.println("Первое число (one) " + one + " большее.");
            } else {
                System.out.println("Третье число (three) " + three + " большее.");
            }
        } else {
            if(two > three){
                System.out.println("Второе число (two) " + two + " большее.");
            } else{
                System.out.println("Третье число (three) " + three + " большее.");
            }
        }
    }
}