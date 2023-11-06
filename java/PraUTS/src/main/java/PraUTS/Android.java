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
public class Android extends OperatingSystem {
    private String merk;
    
    public Android(String version, Date release_date, String language, String merk) {
        this(version, release_date, language, merk, null);
    }
    
    public Android(String version, Date release_date, String language, String merk, String serial_number) {
        super("Android", version, release_date, "Google", language, serial_number);
        this.merk = merk;
    }
    
    @Override
    public void printAdditionalInfo() {
        System.out.println("Merk            : " + merk);
    }
    
    public String getMerk() {
        return this.merk;
    }
    
    public void openGoogleAssistant() {
        System.out.println("OK Google!");
    }
}
