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
public class Windows extends OperatingSystem {
    private String edition;
    private String directx_version;
    
    public Windows(String version, Date release_date, String language, String edition, String directx_version) {
        this(version, release_date, language, edition, directx_version, null);
    }
    
    public Windows(String version, Date release_date, String language, String edition, String directx_version, String serial_number) {
        super("Windows", version, release_date, "Microsoft", language, serial_number);
        this.edition = edition;
        this.directx_version = directx_version;
    }
    
    @Override
    public void printAdditionalInfo() {
        System.out.println("Edition         : " + "Windows " + edition);
        System.out.println("DirectX         : " + directx_version);
    }
    
    public void callCortana() {
        System.out.println("Hello Cortana!");
    }
    
    public void openPowerShell() {
        System.out.println("Windows PowerShell opened");
    }
    
    public void openMicrosoftStore() {
        System.out.println("Microsoft Store opened");
    }
    
    public String getEdition() {
        return this.edition;
    }
    
    public String getDirectXVersion() {
        return this.directx_version;
    }
    
    public void updateDirectX(String version) {
        System.out.println("Updating directX version to " + version + "...");
        this.directx_version = version;
    }
}
