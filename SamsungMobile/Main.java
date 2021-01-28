package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(SamsungMobile.android_os_number);
        SamsungMobile.newVersion();
        System.out.println(SamsungMobile.android_os_number);

        SamsungMobile sm = new SamsungMobile("Black", 5.8f,4.3f);
        sm.newVersion();
        sm.update();
        System.out.println(sm);


    }

}
