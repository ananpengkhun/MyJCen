package com.example.customtextview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView

/**
 * Created by rafael238 on 9/27/17.
 */
class CustomTextView : TextView {
    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context)
    }


    private fun init(context: Context) {
        this.text  = "hello"
    }


}