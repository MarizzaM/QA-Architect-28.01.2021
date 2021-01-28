package com.company;

import lombok.ToString;

@ToString
public class SamsungMobile {
    public String color;
    public float size;
    public float current_os;
    public static float android_os_number = 4.4f;



    public SamsungMobile(String color, float size, float current_os) {
        this.color = color;
        this.size = size;
    }

    public void update (){
        current_os = android_os_number;
    }

    public static void newVersion (){
        android_os_number += 0.1;
    }

}
