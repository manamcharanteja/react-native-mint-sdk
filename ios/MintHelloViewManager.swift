import Foundation

@objc(MintHelloViewManager)
class MintHelloViewManager: RCTViewManager {

    override func view() -> UIView! {
        return MintHelloView()
    }

    override static func requiresMainQueueSetup() -> Bool {
        return true
    }
}
