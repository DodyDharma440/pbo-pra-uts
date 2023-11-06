//
//  Mac.swift
//  PraUTS
//
//  Created by Dodi Aditya on 06/11/23.
//

import Foundation

class Mac: OperatingSystem {
    private(set) var cycleCount: Int
    
    init(version: String, releaseDate: Date, language: String, serialNumber: String) {
        self.cycleCount = 0
        super.init(name: "MacOS", version: version, releaseDate: releaseDate, developer: "Apple", language: language, serialNumber: serialNumber)
    }
    
    convenience init(version: String, releaseDate: Date, language: String) {
        self.init(version: version, releaseDate: releaseDate, language: language, serialNumber: "")
    }
    
    override func printInfo() {
        super.printInfo()
        print("Cycle Count     : \(cycleCount)" )
    }
    
    func callSiri() {
        print("Hey Siri!")
    }
    
    func openAppStore() {
        print("App Store opened")
    }
    
    func spotlightSearch() {
        print("Search anything...")
    }
    
    func incrementCycleCount() {
        cycleCount += 1
    }
}
