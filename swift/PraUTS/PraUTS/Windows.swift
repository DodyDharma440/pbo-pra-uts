//
//  Windows.swift
//  PraUTS
//
//  Created by Dodi Aditya on 06/11/23.
//

import Foundation

class Windows: OperatingSystem {
    private(set) var edition: String
    private(set) var directXVersion: String
    
    init(version: String, releaseDate: Date, language: String, edition: String, directXVersion: String, serialNumber: String) {
        self.edition = edition
        self.directXVersion = directXVersion
        super.init(name: "Windows", version: version, releaseDate: releaseDate, developer: "Microsoft", language: language, serialNumber: serialNumber)
    }
    
    convenience init(version: String, releaseDate: Date, developer: String, language: String, edition: String, directXVersion: String) {
        self.init(version: version, releaseDate: releaseDate, language: language, edition: edition, directXVersion: directXVersion, serialNumber: "")
    }
    
    override func printInfo() {
        super.printInfo()
        print("Edition         : Windows \(edition)" )
        print("DirectX Version : \(directXVersion)" )
    }
    
    func callCortana() {
        print("Hello Cortana!");
    }
    
    func openPowerShell() {
        print("Windows PowerShell opened");
    }
    
    func openMicrosoftStore() {
        print("Microsoft Store opened");
    }
    
    func updateDirectX(version: String) {
        print("Updating directX version to \(version)...");
        self.directXVersion = version;
    }
}
