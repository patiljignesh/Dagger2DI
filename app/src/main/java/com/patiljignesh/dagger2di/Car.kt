package com.patiljignesh.dagger2di

import android.util.Log

class Car {

    private val TAG = "Car"

    private var engine = Engine()
    private var wheels = Wheels()

    constructor (engine: Engine, wheels: Wheels) {
        this.engine = engine
        this.wheels = wheels
    }

    fun drive(){
        Log.d(TAG,"Driving...")
    }
}