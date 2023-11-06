//
//  Android.swift
//  PraUTS
//
//  Created by Dodi Aditya on 06/11/23.
//

import Foundation

class Android: OperatingSystem {
    private(set) var merk: String
    
    init(version: String, releaseDate: Date, language: String, merk: String, serialNumber: String) {
        self.merk = merk
        super.init(name: "Android", version: version, releaseDate: releaseDate, developer: "Google", language: language, serialNumber: serialNumber)
    }
    
    convenience init(version: String, releaseDate: Date, developer: String, language: String, merk: String) {
        self.init(version: version, releaseDate: releaseDate, language: language, merk: merk, serialNumber: "")
    }
    
    override func printInfo() {
        super.printInfo()
        print("Merk            : \(merk)" )
    }
    
    func openGoogleAssistant() {
        print("OK Google!")
    }
}
