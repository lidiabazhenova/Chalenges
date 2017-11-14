package com.lidiabazhenova;

public class Main {

    public static void main(String[] args) {
        ITelephone lidiasPhone;
        lidiasPhone = new DeskPhone(554433);
        lidiasPhone.powerOn();
        lidiasPhone.callPhone(554433);
        lidiasPhone.answer();

        lidiasPhone = new MobilePhone(111111);
        lidiasPhone.powerOn();
        lidiasPhone.callPhone(111111);
        lidiasPhone.answer();


    }
}
