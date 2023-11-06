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
public class Linux extends OperatingSystem {
    private String distro;
    
    public Linux(String version, Date release_date, String language, String distro) {
        this(version, release_date, language, distro, null);
    }
    
    public Linux(String version, Date release_date, String language, String distro, String serial_number) {
        super("Linux", version, release_date, "Linus Torvalds", language, serial_number);
        this.distro = distro;
    }
    
    @Override
    public void printAdditionalInfo() {
        System.out.println("Distro          : " + distro);
    }
    
    public void customize() {
        System.out.println("Customizing this Linux....");
    }
    
    public String getDistro() {
        return this.distro;
    }
    
    public void changeDistro(String distro) {
        System.out.println("Changing distro to " + distro);
        this.distro = distro;
    }
}
