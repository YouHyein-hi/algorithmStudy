package kotlinn

import java.util.*
import kotlin.math.log

fun no_4673(args: Array<String>) = with(Scanner(System.`in`)) {

    var array = BooleanArray(10000)

    for(i : Int in 1 .. 10000){
        var n = selfnum(i)

        if(n <= 10000)
            array[i] = true
    }

    for(i : Int in 1 .. 10000){
        if(array[i] == false)
            println(i)
    }

}

fun selfnum(num : Int): Int {
    var sum = num
    var n = num

    while (n != 0){
        sum += num % 10
        n = num / 10
    }
    return sum
}