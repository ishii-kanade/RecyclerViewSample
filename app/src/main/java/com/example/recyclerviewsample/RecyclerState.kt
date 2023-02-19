package com.example.recyclerviewsample

class RecyclerState() {

    constructor(type: RecyclerType, text: String) : this() {
        this.type = type
        this.text = text
    }

    var type: RecyclerType = RecyclerType.BODY
    var text: String = ""
}

enum class RecyclerType(val int: Int) {
    HEADER(0),
    FOOTER(1),
    SECTION(2),
    BODY(3);

    companion object {
        fun fromInt(int: Int): RecyclerType {
            return values().firstOrNull { it.int == int } ?: BODY
        }
    }
}

data class DataOne(val text: String, val image: Int)
data class DataTwo(val text: String)

//sealed class RecyclerDataClass {
//    data class DataOne(val text: String, val image: Int) : RecyclerDataClass()
//    data class DataTwo(val text: String) : RecyclerDataClass()
//}