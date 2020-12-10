fun main() {


    print("1225441:")
    separateNumber(1225441)
    println("")
    println("3579:")
    separateNumber(3579)


}

fun separateNumber(number: Int) {
    println("")
    val numberString:String = number.toString()
    for (i in numberString.indices) {
        var stringNumber:String = numberString[i].toString()
//        println(stringNumber)
        val zeroCount = (numberString.length - 1) - i
//        print("tes zero Count $zeroCount : ")
        for (j in 0 until zeroCount) {
            stringNumber += "0"
        }
        println(stringNumber)
    }
}