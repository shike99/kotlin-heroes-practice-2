package practice1

import java.io.PrintWriter

val pw = PrintWriter(System.out)
fun main() {
    func()
    pw.flush()
}

fun func() {
    val args = readLine()!!.split(" ").map { it.toInt() }
    var n = args[0]
    val k = args[1]

    repeat(k) {
        if (n % 10 === 0) n /= 10 else n--
    }

    pw.println(n)
}

//fun func() {
//    val args = readLine()!!.split(" ")
//    if (args.size !== 2 || !args[0].matches(Regex("""\d+""")) || !args[1].matches(Regex("""\d+"""))) {
//        pw.println("argument error")
//        return
//    }
//
//    var subtractionTarget = args[0].toInt()
//    val subtractionNumber = args[1].toInt()
//
//    if (2 > subtractionTarget || subtractionTarget > Math.pow(10.toDouble(), 9.toDouble())) {
//        pw.println("argument 1 is incorrect number")
//        return
//    } else if (1 > subtractionNumber || subtractionNumber > 50) {
//        pw.println("argument 2 is incorrect number")
//        return
//    }
//
//    repeat(subtractionNumber) {
//        if (subtractionTarget.toString().last() === '0') subtractionTarget /= 10 else subtractionTarget--
//    }
//
//    pw.println(subtractionTarget)
//}
