package com.example.recyclerviewsample

class RecyclerState() {

    constructor(
        type: RecyclerType,
        dataHeader: DataHeader? = null,
        dataBody: DataBody? = null,
        dataBody2: DataBody2? = null
    ) : this() {
        this.type = type
        this.dataHeader = dataHeader
        this.dataBody = dataBody
        this.dataBody2 = dataBody2
    }

    var type: RecyclerType = RecyclerType.BODY
    var text: String = ""
    var dataHeader: DataHeader? = DataHeader("")
    var dataBody: DataBody? = DataBody(text = "Sample", image = 0)
    var dataBody2: DataBody2? = DataBody2(text = "")
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

data class DataHeader(val text: String)
data class DataBody(val text: String, val image: Int)
data class DataBody2(val text: String)