fun main(args: Array<String>) {
    println("안녕하세요, Shoppi에 오신 것을 환영합니다!")
    println("쇼핑을 계속 하시러면 이름을 입력해주세요 :)")

    val name = readlnOrNull()
    println("""
        감사합니다. 반갑습니다, $name 님
        원하시는 카테고리를 선택해주세요.
        ***============================***
    """.trimIndent())
}