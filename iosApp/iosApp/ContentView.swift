import SwiftUI
import shared

struct ContentView: View {
    let tripsCall = GetTrips()
    @State var trips = "Loading..."
    
    func load() {
        tripsCall.getTrips { result, error in
            if let result = result {
                self.trips = result.description
            } else if let error = error {
                trips = "Error: \(error)"
            }
        }
    }
    
    var body: some View {
        Text(trips).onAppear{
            load()
        }
    }
}
