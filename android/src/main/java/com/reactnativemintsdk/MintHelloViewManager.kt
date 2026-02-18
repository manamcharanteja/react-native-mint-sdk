package com.reactnativemintsdk

import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.mint.sdk.MintHelloView

class MintHelloViewManager : SimpleViewManager<MintHelloView>() {

    override fun getName(): String = "MintHelloView"

    override fun createViewInstance(reactContext: ThemedReactContext): MintHelloView {
        return MintHelloView(reactContext)
    }

    override fun getShadowNodeClass(): Class<out LayoutShadowNode> {
        return MintHelloShadowNode::class.java
    }

    override fun createShadowNodeInstance(): LayoutShadowNode {
        return MintHelloShadowNode()
    }
}
