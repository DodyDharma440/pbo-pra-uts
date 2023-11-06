//
//  OperatingSystem.swift
//  PraUTS
//
//  Created by Dodi Aditya on 06/11/23.
//

import Foundation

class OperatingSystem {
    private(set) var name: String
    private(set) var version: String
    private(set) var releaseDate: Date
    private(set) var developer: String
    private(set) var language: String
    private(set) var serialNumber: String
    private var isOn: Bool
    
    init(name: String, version: String, releaseDate: Date, developer: String, language: String, serialNumber: String) {
        self.name = name
        self.version = version
        self.releaseDate = releaseDate
        self.developer = developer
        self.language = language
        self.serialNumber = serialNumber
        
        self.isOn = true
    }
    
    convenience init(name: String, version: String, releaseDate: Date, developer: String, language: String) {
        self.init(name: name, version: version, releaseDate: releaseDate, developer: developer, language: language, serialNumber: "")
    }
    
    func printInfo() {
        print("OPERATING SYSTEM")
        print("Name            : \(name)");
        print("Version         : \(version)");
        print("Release         : \(getFormattedReleaseDate())");
        print("Developer       : \(developer)");
        print("Language        : \(language)");
        print("Serial Number   : \(serialNumber)");
    }
    
    func boot() {
        if !isOn {
            print("Booting")
            self.isOn = true
        } else {
            print("System is already ON.")
        }
    }
    
    func shutdown() {
        if (isOn) {
            print("Logging off this system....");
            isOn = false;
        } else {
            print("This system is currently OFF.");
        }
    }
    
    func restart() {
        if (isOn) {
            print("Restarting...")
            shutdown()
            DispatchQueue.main.asyncAfter(deadline: .now() + 3) {
                self.boot()
            }
        }
    }
    
    func getFormattedReleaseDate() -> String {
        releaseDate.formatted(date: .long, time: .omitted)
    }
    
    func setLanguage(language: String) {
        self.language = language
    }
    
    func getBootStatus() -> String {
        "This system is currently \(isOn ? "ON" : "OFF")"
    }
}
