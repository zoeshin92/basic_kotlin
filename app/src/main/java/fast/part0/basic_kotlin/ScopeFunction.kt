package fast.part0.basic_kotlin

/*
    범위 지정함수 Scope Function
    - 객체의 컨텍스트 내에서, 실행 가능한 코드 블럭을 만드는 함수.
    - 호출 시, 임시 범위가 생성되며, 이 범위 안에서는 이름 없이 객체에 접근 가능
    - 수신 객체(receiver): 확장 함수가 호출되는 대상이 되는 값(객체)
    - 수신 객체 지정 람다: 수신 객체를 명시하지 않고, 람다의 본문 안에서 해당 객체의 메서드를 호출할 수 있게 하는 것
        - 수신 객체 접근 방법: this, it
        - return 값: 수신객체, 마지막 행(lamda result)

    let: null 체크를 해야할 때, 지역 변수를 명시적으로 표현 해야할 때
    run: 객체를 초기화 하고 리턴 값이 있을 때
    apply: 객체 초기화
    also: 수신 객체를 명시적으로 사용하고 싶을 때, 로그를 남길 때
    with: 객체 초기화, 람다 리턴 값이 필요 없을 때
 */
fun main() {
    // let, run, apply, also
    // 1. let
    val a = 3
    a.let {}
    val user1 = User2("Zoe", 10, true)

    val age1 = user1.let { user -> user.age }
    println("age1: $age1")

    val user2: User2? = User2("Zoe", 20, false)
    val age2 = user2?.let { it.age }
    println("age2: $age2")

    /*
        2. run
        수신객체.run { this ->
            마지막 줄이 return
        }
     */
    val kid = User2("Kid1", 4, false)
    val kidAge1 = kid.run { age }
    println("KidAge1: $kidAge1")

    /*
        3. apply
        수신객체.apply {
            .....
        }
        리턴값은 수신객체
     */
    val female = User2("HaeYoon", 20, true, true)
    val femaleValue = female.apply {
        hasGlasses = false
    }
    println("femaleValue: ${femaleValue.hasGlasses}")

    /*
        4. also
        수신객체.also { it -> // local variable 설정 가능

        }
        return 값은 수신 객체 (자기 자신)
     */
    val male = User2("Felix", 23, false, true)
    val maleValue = male.also {
        println(it.name)
        println(it.hasGlasses)
    }

    /*
        5. with
        with(수신객체) {
            ...
            마지막줄이 return
        }
     */
    val result = with(male) {
        hasGlasses = false
        true
    }
    println("result: $result")
}

class User2 (
    val name: String,
    val age: Int,
    val gender: Boolean,
    var hasGlasses: Boolean = true,
)