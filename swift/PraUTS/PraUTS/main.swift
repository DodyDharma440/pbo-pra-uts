//
//  main.swift
//  PraUTS
//
//  Created by Dodi Aditya on 06/11/23.
//

import Foundation

func makeDate(year: Int, month: Int, day: Int) -> Date {
    var components = DateComponents()
    components.year = year
    components.month = month
    components.day = day
    return Calendar.current.date(from: components) ?? .now
}

let macSonoma = Mac(version: "14.0 (Sonoma)", releaseDate: makeDate(year: 2023, month: 9, day: 26), language: "English", serialNumber: "FSHDJSHDJS")
macSonoma.incrementCycleCount()
macSonoma.callSiri()
macSonoma.printInfo()

