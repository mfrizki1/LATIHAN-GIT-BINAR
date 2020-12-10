fun main() {
//    println("Hello World")
//    val a = 0
//    if(a == 1){
//        println("1")
//
//    }else{
//        println("abcs")
//
//    }
//    var baris = arrayListOf("1","2","3","4","5")
//    var kolom = arrayListOf("6","7","8","9","10")
//
//    for (i in 0 until baris.size){
//        println(i)
//        for(j in i..kolom.size){
//            print(j)
//        }
//    }

    print("1225441:")
    separateNumber(1225441)
    println("")
    println("3579:")
    separateNumber(3579)


}

fun separateNumber(number: Int) {
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