package fast.part0.basic_kotlin

    /*
    람다
        1. 익명 함수
        2. 변수처럼 사용되서 함수의 argument, return이 될 수 있다
        3. 한번 사용되고, 재사용되지 않는 함수
     */
fun main() {
    val a = fun(){ println("hello") }
    val b: (Int) -> String = { "$it 입니다" }
    println(b(10))

        val d = { i : Int, j: Int -> i * j}

        val e: (Int, String, Boolean) -> String = { _, b, _ -> b}

        hello(10, b )
}

fun hello(a: Int, b: (Int) -> String): (Int) -> String {
    println("a: $a")
    println(b(20))
    return b
}