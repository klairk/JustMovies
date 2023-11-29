package com.justmovies.fragments

import android.app.Application
import com.justmovies.comman.PrefsManager

class ApplicationGlobal : Application() {

    companion object {

        lateinit var prefsManager: PrefsManager
        var sessionId: String = ""
//        var profile : Profile? = null
        var email : String = ""
        var password : String = ""

        private lateinit var instance: ApplicationGlobal

        @Synchronized
        fun getInstance(): ApplicationGlobal = instance

    }

    override fun onCreate() {
        super.onCreate()
        prefsManager = PrefsManager(this)
//        profile = Gson().fromJson(prefsManager.getProfile(), Profile::class.java)
        sessionId = prefsManager.getSessionId()

    }
}