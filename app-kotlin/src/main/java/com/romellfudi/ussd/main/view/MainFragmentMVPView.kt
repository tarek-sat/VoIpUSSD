package com.romellfudi.ussd.main.view

import com.romellfudi.ussdlibrary.USSDApi

/**
 * @version 1.0
 * @autor Romell Domínguez
 * @date 2020-04-26
 */
interface MainFragmentMVPView {
    val ussdNumber: String
    fun setResult(data: String)
    fun appendResult(string: String)
    var ussdApi: USSDApi
    val hasAllowOverlay: Boolean
    fun showOverlay()
    fun showSplashOverlay()
    fun dismissOverlay()
}
