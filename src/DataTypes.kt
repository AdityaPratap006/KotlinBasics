fun practice() {
    // val:- immutable variable
    // TODO: Add new functionality

    /*
    * This is
    * a multiline
    * comment
    * */

    // type String
    val myName = "Aditya"
    // type int 32 bit
    var myAge = 20

    print("Hello! I'm $myName and I'm $myAge years old.")

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 12
    val myShort: Short = 356
    val myInt: Int = 123123123
    val myLong: Long = 1_239_812_309_487_120_904

    // Floating Point Number TYPES: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Boolean
    val isSunny: Boolean = false
    val isCloudy: Boolean = true

    // Character
    val letterChar: Char = 'A'
    // type inference
    val digitChar = '1'

    // String
    val welcomeMessage: String = "Hello there!"
    var firstCharInStr = welcomeMessage[0]
    var lastCharInStr = welcomeMessage[welcomeMessage.length - 1]

    print("\nFirst Character $firstCharInStr, Last Character $lastCharInStr")
}

fun main() {
   practice()
}