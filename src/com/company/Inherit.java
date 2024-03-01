package com.company;

class animal{
    String living;
    String social;

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getLiving() {
        return living;
    }

    public void setLiving(String living) {
        this.living = living;
    }
}
class dog extends animal{
    String domestic;

    public String getDomestic() {
        return domestic;
    }

    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }
}
public class Inherit {
    public static void main(String[] args) {
        dog d = new dog();
        d.setLiving("yes it's living");
        System.out.println(d.getLiving());
        d.setDomestic("happy");
        System.out.println(d.getDomestic());
    }
}
