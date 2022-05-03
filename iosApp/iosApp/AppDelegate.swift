import SwiftUI
import shared
import Foundation

class AppDelegate: NSObject, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
        TripMateDIKt.doInitKoin { Koin_coreKoinApplication in}
        return true
    }
}
