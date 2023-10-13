package com.pluralsight;


public class DiceRollApplication {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int sum;

        int count2=0, count4=0, count6=0, count7=0;

        for (int i =1; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.printf("Roll %d: %d - %d roll1 - roll2 Sum: %d\n", i, roll1,roll2, sum);

            switch(sum) {
                case 2:
                    count2++;
                    break;
                case 4:
                    count4++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
            }
        }

        System.out.println("\nCounters:");
        System.out.println("Sum of 2: " + count2);
        System.out.println("Sum of 4: " + count4);
        System.out.println("Sum of 6: " + count6);
        System.out.println("Sum of 7: " + count7);
    }
}