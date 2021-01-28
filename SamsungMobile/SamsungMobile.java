package com.company;

import lombok.ToString;

@ToString
public class SamsungMobile {
    public String color;
    public float size;
    public float current_os;
    public static float android_os_number = 4.4f;



    public SamsungMobile(String color, float size) {
        this.color = color;
        this.size = size;
        this.current_os = android_os_number;
    }

    public void update (){
        current_os = android_os_number;
    }

    public static void newVersion (){
        android_os_number += 0.1;
    }

}
