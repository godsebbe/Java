package org.yourcompany.yourproject;


public class TestFan {
    public static void main(String[] args) {
        Exercise_9_8 fan1 = new Exercise_9_8();
        fan1.setSpeed(Exercise_9_8.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Exercise_9_8 fan2 = new Exercise_9_8();
        fan2.setSpeed(Exercise_9_8.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println();
        System.out.println(fan2.toString());
    }
}

