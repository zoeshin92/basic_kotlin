package fast.part0.basic_kotlin

/*
    확장함수 Extension Function: 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
 */
fun main() {
    val test = Test()
    test.hello()
    test.hi()
}

fun Test.hi() = println("HI")

class Test() {
    fun hello() = println("Hello")
    fun bye() = println("Bye")
}