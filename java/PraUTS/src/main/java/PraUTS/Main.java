/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraUTS;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author dodiaditya
 */
public class Main {
    public static void main(String[] args) {
        // WINDOWS
        Windows windows10 = new Windows("10.0.0",  new GregorianCalendar(2015, Calendar.JULY, 29).getTime(), "English", "10 Home", "12.0");
        windows10.callCortana();
        windows10.printInfo();
        
        // MAC
        Mac macSonoma = new Mac("14.0 (Sonoma)", new GregorianCalendar(2023, Calendar.SEPTEMBER, 23).getTime(), "English", "FXKSJDKSJD");
        macSonoma.callSiri();
        macSonoma.restart();
        macSonoma.incrementCycleCount();
        macSonoma.printInfo();
        
        // LINUX
        Linux ubuntu = new Linux("22.04.3", new GregorianCalendar(2023, Calendar.AUGUST, 10).getTime(), "English", "Ubuntu", "ABCD");
        ubuntu.customize();
        ubuntu.printInfo();
        
        // ANDROID
        Android tiramisu = new Android("13", new GregorianCalendar(2022, Calendar.FEBRUARY, 10).getTime(), "English", "Xiaomi", "SKDKSDLS");
        tiramisu.printInfo();
    }
}
