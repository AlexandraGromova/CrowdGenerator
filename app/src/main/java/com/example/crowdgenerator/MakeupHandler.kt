package com.example.crowdgenerator

class MakeupHandler() {
    fun makeupListToString(list: MutableList<Makeup>) : String {
        var finalText ="All makeup ${list.size} \n"
       var i = 0
        while (i< list.size){
            var makeup = list[i]
            finalText +=" #${i+1} Makeup" +
                    " \n lips - ${makeup.lips}" +
                    "\n eyes - ${makeup.eyes} " +
                    "\n blush - ${makeup.blush} \n"
            i++
        }
        return finalText
    }
}