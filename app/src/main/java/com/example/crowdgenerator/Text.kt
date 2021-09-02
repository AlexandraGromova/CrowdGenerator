package com.example.crowdgenerator

class Text(var list: MutableList<Makeup>) {
    var finalText ="All makeup ${list.size} \n"
    fun preparation() {
       var i = 0
        while (i< list.size){
            var makeup = list[i]
            finalText +=" #${i+1} Makeup" +
                    " \n lips - ${makeup.lips}" +
                    "\n eyes - ${makeup.eyes} " +
                    "\n blush - ${makeup.blush} \n"
            i++
        }
    }
}