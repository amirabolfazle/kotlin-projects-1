fun main() {
    print("inter a number: ")
    val x1 = readln().toInt()
    val arr1 = mutableListOf(x1)
    print("inter a number: ")
    val x2 = readln().toInt()
    arr1.add(x2)
    print("inter a number: ")
    val x3 = readln().toInt()
    arr1.add(x3)
    print("inter a number: ")
    val x4 = readln().toInt()
    arr1.add(x4)
    print("inter a number: ")
    val x5 = readln().toInt()
    arr1.add(x5)
    var res = 0
    for (i in arr1){
        res+=arr1[i]
    }
    println("Resault: $res")
}