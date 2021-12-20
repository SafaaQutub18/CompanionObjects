package com.safaa.companionobjects

class Backgrounds {
    companion object background{

        fun changeBackground(text:String):Int{
            if(text.lowercase() == "night")
                return Constant.night
            else if(text.lowercase() == "day")
                return Constant.day
            else
                return 0
        }
    }
}