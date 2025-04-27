fun main() {
    val x1 = readln().toInt()
    val arr1 = mutableSetOf(x1)
    for (i in 1..7){
        val b = readln().toInt()
        arr1.add(b)
    }
    println(arr1)
}