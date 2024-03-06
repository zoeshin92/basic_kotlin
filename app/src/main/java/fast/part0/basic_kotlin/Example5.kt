package fast.part0.basic_kotlin

fun main(){
    max(10, 3)
    isHoliday(3)
}

fun max(a: Int, b: Int) {
    val result = if(a > b) a else b
    println("max is: $result")
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: Any) {
    val result =
        when(val day = dayOfWeek) {
            "토", "일" -> if(day == "토") "토요일은 좋아" else "일요일 너무좋아"
            in 2..4 -> "숫자의 범위가 2부터 4 사이 입니다"
            in listOf<String>("월", "화",) -> "회사 가야지 ^_^"
            else -> "힘내자"
        }
    println("$dayOfWeek isHoliday: $result")
}