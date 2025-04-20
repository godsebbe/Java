package org.yourcompany.yourproject;

public class Exercise_9_8 {

        // fan speeds
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;
    
        // private data fields
        private int speed;
        private boolean on;
        private double radius;
        private String color;
    
        // default fan
        public Exercise_9_8() {
            this.speed = SLOW;
            this.on = false;
            this.radius = 5;
            this.color = "blue";
        }
    
        
        public int getSpeed() {
            return speed;
        }
    
        public boolean isOn() {
            return on;
        }
    
        public double getRadius() {
            return radius;
        }
    
        public String getColor() {
            return color;
        }
    
    
        public void setSpeed(int speed) {
            this.speed = speed;
        }
    
        public void setOn(boolean on) {
            this.on = on;
        }
    
        public void setRadius(double radius) {
            this.radius = radius;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        // toString to describe the fan
        @Override
        public String toString() {
            if (on) {
                return "Fan is on\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
            } else {
                return "Fan is off\nColor: " + color + "\nRadius: " + radius;
            }
        }

    
}
