import kotlin.random.Random

fun main(args: Array<String>) {
    fun forTask(list: List<Int>) {
        var min = list[0]
        var max = list[0]
        var mult = 1
        for (item in list) {
            if (item < min) min = item
            else if (item > max) max = item
            mult *= item
        }
        println("for: $mult, $min, $max")
    }

    fun whileTask(list: List<Int>) {
        var min = list[0]
        var max = list[0]
        var mult = 1
        var i = 0
        while (i < list.size) {
            if (list[i] < min) min = list[i]
            else if (list[i] > max) max = list[i]
            mult *= list[i]
            i++
        }
        println("while: $mult, $min, $max")
    }

    fun reduceTask(list: List<Int>) {
        var mult = list.reduce { acc, i -> acc * i }
        var min = list.reduce { acc, i -> if (acc < i) acc else i }
        var max = list.reduce { acc, i -> if (acc > i) acc else i }
        println("reduce: $mult, $min, $max")
    }

    fun forEachTask(list: List<Int>) {}
    fun minMaxTask(list: List<Int>) {}
    var ran = Random
    var list = (1..10).map { ran.nextInt() % 10 }
    println("Массив: $list")
    forTask(list)
    whileTask(list)
    reduceTask(list)
    forEachTask(list)
    minMaxTask(list)
}
