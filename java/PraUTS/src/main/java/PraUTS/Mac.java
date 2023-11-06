/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraUTS;

import java.util.Date;

/**
 *
 * @author dodiaditya
 */
public class Mac extends OperatingSystem {
    private int cycle_count;
    
    public Mac(String version, Date release_date, String language) {
        this(version, release_date, language, null);
    }
    
    public Mac(String version, Date release_date, String language, String serial_number) {
        super("MacOS", version, release_date, "Apple", language, serial_number);
        this.cycle_count = 0;
    }
    
    @Override
    public void printAdditionalInfo() {
        System.out.println("Cycle Count     : " +  cycle_count);
    }
    
    public void incrementCycleCount() {
        this.cycle_count += 1;
    }
    
    public int getCycleCount() {
        return this.cycle_count;
    }
    
    public void callSiri() {
        System.out.println("Hey Siri!");
    }
    
    public void openAppStore() {
        System.out.println("App Store opened.");
    }
    
    public void spotlightSearch() {
        System.out.println("Search anything");
    }
}
