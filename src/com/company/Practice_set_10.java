package com.company;

import java.util.Scanner;

class circle{
    int radius;
    float area;
    public int getRadius() {
        return radius;
    }
    public void setRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextInt();
        this.radius = radius;
    }
    float area(){
        area = 2 * 3.14f * radius;
        return area;
    }
}
class cylinder extends circle{
    int height;
    float surface;
    public int getHeight() {
        return height;
    }
    public void setHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        height = sc.nextInt();
        this.height = height;
    }
    float surfaceArea(){
        surface= area * height;
        return surface;
    }
}
public class Practice_set_10 {
    public static void main(String[] args) {
        circle c = new cylinder();
        c.surfaceArea();
    }
}
