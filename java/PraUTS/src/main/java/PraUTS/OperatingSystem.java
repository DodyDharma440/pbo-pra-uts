/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraUTS;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dodiaditya
 */
public class OperatingSystem {
    private String name;
    private String version;
    private Date release_date;
    private String developer;
    private String language;
    private String serial_number;
    private boolean isOn = false;
    
    public OperatingSystem(String name, String version, Date release_date, String developer, String language) {
        this.name = name;
        this.version = version;
        this.release_date = release_date;
        this.developer = developer;
        this.language = language;
        boot();
    }
    
    public OperatingSystem(String name, String version, Date release_date, String developer, String language, String serial_number) {
        this(name, version, release_date, developer, language);
        this.serial_number = serial_number;
    }
    
    public void printInfo() {
        System.out.println("OPERATING SYSTEM");
        System.out.println("Name            : " + this.name);
        System.out.println("Version         : " + this.version);
        System.out.println("Release         : " + this.getFormattedReleaseDate());
        System.out.println("Developer       : " + this.developer);
        System.out.println("Language        : " + this.language);
        System.out.println("Serial Number   : " + this.serial_number);
        
        printAdditionalInfo();
    }
    
    public void printAdditionalInfo() { }
    
    public void updateVersion(String version) {
        System.out.println("Updating version....");
        this.version = version;
    }
    
    public void shutdown() {
        if (this.isOn) {
            System.out.println("Logging off this system....");
            this.isOn = false;
        } else {
            System.out.println("This system is currently off.");
        }
    }
    
     public void boot() {
        if (!this.isOn) {
            System.out.println("Booting....");
            this.isOn = true;
        } else {
            System.out.println("This system is currently on.");
        }
    }
     
    public void restart() {
        if (this.isOn) {
            System.out.println("Restarting...");
            shutdown();
            try {
                Thread.sleep(3000);
                boot();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getVersion() {
        return this.version;
    }
    
    public Date getReleaseDate() {
        return this.release_date;
    }
    
    public String getFormattedReleaseDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        return dateFormat.format(this.release_date);
    }
    
    public String getDeveloper() {
        return this.developer;
    }
    
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String lang) {
        this.language = lang;
    }
    
    public String getSerialNumber() {
        return this.serial_number;
    }
    
    public String getBootStatus() {
        String msg = "This system is currently ";
        
        if (this.isOn) {
            msg += "ON";
        } else {
            msg += "OFF";
        }
        
        return msg;
    }
}
