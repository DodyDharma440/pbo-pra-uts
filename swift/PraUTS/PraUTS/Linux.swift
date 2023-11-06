//
//  Linux.swift
//  PraUTS
//
//  Created by Dodi Aditya on 06/11/23.
//

import Foundation

class Linux: OperatingSystem {
    private(set) var distro: String
    
    init(version: String, releaseDate: Date, language: String, distro: String, serialNumber: String) {
        self.distro = distro
        super.init(name: "Linux", version: version, releaseDate: releaseDate, developer: "Linus Torvalds", language: language, serialNumber: serialNumber)
    }
    
    convenience init(version: String, releaseDate: Date, developer: String, language: String, distro: String) {
        self.init(version: version, releaseDate: releaseDate, language: language, distro: distro, serialNumber: "")
    }
    
    override func printInfo() {
        super.printInfo()
        print("Distro          : \(distro)" )
    }
    
    func customize() {
        print("Customizing this Linux....");
    }
    
    func changeDistro(distro: String) {
        print("Changing distro to \(distro)");
        self.distro = distro;
    }
}
