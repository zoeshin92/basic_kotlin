package fast.part0.basic_kotlin

/*
    Data class: 데이터를 담기 위한 클래스
        toString(), hasCode(), equals(), copy() 메서드를 자동으로 생성
        override하면 직접 구현한 코드를 사용
        1개 이상의 프로퍼티가 있어야 함
        데이터 클래스는 abstract, open, sealed, inner 를 붙일 수 없음
        상속이 불가능
    Sealed class: 추상 클래스로, 상속받은 자식클래스의 종류를 제한
        컴파일러가 sealed 클래스의 자식클래스가 어떤 것인지 앎
        when과 함께 쓰일 때 장점을
 */

fun main() {
    val person = Person("Felix", 23)
    val dog = Dog("Seungmin", 23)
    println("person: ${person.toString()}")
    println("dog: ${dog.toString()}")
    println("copy: ${dog.copy(age = 3).toString()}")

    val cat: Cat = BlueCat()
    val result = when(cat) {
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"
    }
    println("result: $result")
}

class Person(
    val name: String,
    val age: Int,
)

data class Dog(
    val name: String,
    val age: Int,
)

// sealed class: 추상클래스
sealed class Cat
class BlueCat: Cat()
class RedCat: Cat()
class GreenCat: Cat()