package com.company;

class phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("turning on phone...");
    }
}
class smartphone extends phone {
    public void swagat() {
        System.out.println("Swagat hai ...");
    }

    public void on() {
        System.out.println("turning on smartphone..");
    }
}

    public class DynamicMethodDispatch {
        public static void main(String[] args) {

            phone obj = new smartphone();
            obj.on();
        }
    }

