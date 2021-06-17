import java.util.Scanner;

public class calcutalor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Age: ");
        int age = scanner.nextInt();

        if (age > 21 && age <= 30){
            int totalYears = 5_211_251;
            int peopleAlive = 97_855;
            int lifeExpectancy = totalYears/peopleAlive;
            System.out.println("You are expected to live for the next " + lifeExpectancy + " years");
            System.out.println("You are expected to die in the year " + (2021 + lifeExpectancy));
        }
        if (age > 31 && age <= 40){
            int totalYears = 3_290_379;
            int peopleAlive = 93_762;
            int lifeExpectancy = totalYears/peopleAlive;
            System.out.println("You are expected to live for the next " + lifeExpectancy + " years");
            System.out.println("You are expected to die in the year " + (2021 + lifeExpectancy));
        }

        if (age > 41 && age <= 50){
            int totalYears = 2_370_098;
            int peopleAlive = 89_867;
            int lifeExpectancy = totalYears/peopleAlive;
            System.out.println("You are expected to live for the next " + lifeExpectancy + " years");
            System.out.println("You are expected to die in the year " + (2021 + lifeExpectancy));
        }

        if (age == 51){
            int totalYears = 2_370_098;
            int peopleAlive = 89_301;
            int lifeExpectancy = totalYears/peopleAlive;
            System.out.println("You are expected to live for the next " + lifeExpectancy + " years");
            System.out.println("You are expected to die in the year " + (2021 + lifeExpectancy));
        }

        if (age > 51 && age <= 60){
            int totalYears = 1_508_080;
            int peopleAlive = 81_381;
            int lifeExpectancy = totalYears/peopleAlive;
            System.out.println("You are expected to live for the next " + lifeExpectancy + " years");
            System.out.println("You are expected to die the year " + (2021 + lifeExpectancy));
        }

        if (age > 61 && age <= 70){
            int totalYears = 772_498;
            int peopleAlive = 64_109;
            int lifeExpectancy = totalYears/peopleAlive;
            System.out.println("You are expected to live for the next " + lifeExpectancy + " years");
            System.out.println("You are expected to die in the year " + (2021 + lifeExpectancy));
        }




    }
}
