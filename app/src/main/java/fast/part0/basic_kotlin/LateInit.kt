package fast.part0.basic_kotlin

/*
    lateinit, var: 변수 타입을 지정해주어야 함. primitive 타입은 사용할 수 없음 (Int X -> Integer O)
    lazy, val -> 선언과 동시에 초기화를 해야 함. 호출 시점에서 초기화가 이루어짐
 */

lateinit var text: String
val test: Int by lazy {
    println("초기화 중")
    100
}
fun main() {
    println("main function")
    println("init value: $test")
    println("second value: $test")
}
