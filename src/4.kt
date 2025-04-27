fun main() {
    val x1 = readln()
    val x2 = readln()
    val map1 = mutableMapOf(x1 to x2)
    while (true) {
        val x3 = readln()
        if (x3 == "stop"){
            break
        }
        val x4 = readln()
        map1.put(x3,x4)
    }
    for (i in map1) {
//        println("${map1[]} -> ${map1["id"]}\n")
        println(i)
    }

}