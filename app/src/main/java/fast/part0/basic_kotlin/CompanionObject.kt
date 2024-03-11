package fast.part0.basic_kotlin

import fast.part0.basic_kotlin.Book.Novel.NAME

/*
    Object: 클래스를 정의함과 동시에 객체를 생성
        싱글톤을 쉽게 만들 수 있는 키워드
        생성자 사용 불가
        프로퍼티, 메서드, 초기화 블록은 사용 가능
        다른 클래스나 인터페이스를 상속받을 수 있음
    Companion Object: 동반 객체
        클래스 내에 하나만 선언할 수 있음
        java의 static과 동일한 역할 -> Book.name
            static X -> Book().name - 생성자를 만들고 name 프로퍼티에 접근해야 함
 */

fun main(){
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.hello()
    NAME
}
object Counter: Hello() {
    init {
        println("Counter 초기화")
    }
    var count = 0
    fun countUp(){ count ++ }
}

open class Hello(){
    fun hello() = println("Hello")
}

class Book {
    companion object Novel {
        const val NAME = "NANE"
        fun create() = Book()
    }
}