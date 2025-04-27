fun main() {
    var c=0
    val y = readln().toInt()
    val arr1 = mutableListOf(y)
    for (i in 0..6){
        val x = readln().toInt()
            arr1.add(x)
    }
    for (item in arr1){
        if (arr1[item]%2!=0){
            c+=1
        }
    }
    println("tedad $c adad fard yaft shod!")
}