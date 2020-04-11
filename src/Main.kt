// https://www.hackerrank.com/challenges/taum-and-bday/problem

fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
    val priceNoConversion = b.toLong() * bc.toLong() + w.toLong() * wc.toLong()
    val priceBtoW = b.toLong() * bc.toLong() + w.toLong() * (bc.toLong() + z.toLong())
    val priceWtoB = b.toLong() * (wc.toLong() + z.toLong()) + w.toLong() * wc.toLong()

    return listOf(priceNoConversion, priceBtoW, priceWtoB).min()!!
}

fun main() {
    println(taumBday(10, 10, 1, 1, 1))
    println(taumBday(5, 9, 2, 3, 4))
}