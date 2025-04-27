fun main() {
    var y=0
    val x1 = readln()
    val x2 = readln().toInt()
    val map1 = mutableMapOf(x1 to x2)
    while (true) {
        val x3 = readln()
        if (x3 == "stop"){
            break
        }
        val x4 = readln().toInt()
        map1.put(x3,x4)
    }
    val c = map1.values.toList()
    for (i in 0..<map1.size) {
        y+=c[i]
    }
    println("Jame Nomreha: $y")

}