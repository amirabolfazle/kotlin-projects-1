fun main() {
    for (i in 1..20){
        if (i%2==0){
            if (i == 20) print("$i") else
            print("$i, ")
        }
        continue
    }
}