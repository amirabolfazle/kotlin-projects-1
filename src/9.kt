fun main() {
    var c=0
    val y = readln().toInt()
    val arr1 = mutableListOf(y)
    for (i in 0..4){
        val x = readln().toInt()
            arr1.add(x)
    }
    println(arr1.sortedDescending())
}