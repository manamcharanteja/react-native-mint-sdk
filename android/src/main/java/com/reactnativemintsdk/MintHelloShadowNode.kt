package com.reactnativemintsdk

import android.content.res.Resources
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.yoga.YogaMeasureFunction
import com.facebook.yoga.YogaMeasureMode
import com.facebook.yoga.YogaMeasureOutput
import com.facebook.yoga.YogaNode

class MintHelloShadowNode : LayoutShadowNode(), YogaMeasureFunction {

    init {
        setMeasureFunction(this)
    }

    override fun measure(
        node: YogaNode,
        width: Float,
        widthMode: YogaMeasureMode,
        height: Float,
        heightMode: YogaMeasureMode
    ): Long {
        val dm = Resources.getSystem().displayMetrics

        val measuredWidth = when (widthMode) {
            YogaMeasureMode.EXACTLY -> width
            YogaMeasureMode.AT_MOST -> width
            else -> dm.widthPixels.toFloat()
        }

        val measuredHeight = when (heightMode) {
            YogaMeasureMode.EXACTLY -> height
            YogaMeasureMode.AT_MOST -> height
            else -> dm.heightPixels.toFloat()
        }

        return YogaMeasureOutput.make(measuredWidth.toInt(), measuredHeight.toInt())
    }
}
