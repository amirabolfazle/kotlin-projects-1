fun main() {
    val arr1 = intArrayOf(1,2,4,8)
    val x = readln().toInt()
    var i=0

        for (item in arr1){
            if (arr1[item]==x){
                println("bood!")
                break
            }
        }

}