package fast.part0.basic_kotlin

fun main(){
    cast("cast")
    cast(10)

    println(smartcast("SmartCASE"))
    println(smartcast(5))
    println(smartcast(true))

    println(check("HELLO"))
    println(check(3))
    println(check(false))}

fun smartcast(a: Any): Int {
    return if(a is String) {
        a.length
    }else if (a is Int){
        a.dec()
    }else {
        -1
    }
}
fun cast(a: Any) {
    val result = (a as? String) ?: "실패"
    println(result)
}
fun check(a: Any): String{
    return when (a) {
        is String -> {
            "문자열"
        }

        is Int -> {
            "숫자"
        }

        else -> {
            "unknown"
        }
    }
}