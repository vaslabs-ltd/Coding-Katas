class ChristmasTreeTest extends org.scalatest.funsuite.AnyFunSuite {
  test("chrismas tree 0") {
    assert( ChristmasTree.draw(0) === "")
  }
  test("chrismas tree 1") {
    assert( ChristmasTree.draw(1) === "#")
  }
  test("chrismas tree 2") {
    println("""
               |#
               |#""".stripMargin)
    print(ChristmasTree.draw(2))
    val expectedString = """|#
                            |#
                            |""".stripMargin
    println(expectedString.getBytes().mkString(","))
    val actualString = ChristmasTree.draw(2)
    println(actualString.getBytes().mkString(","))

    assert( actualString === expectedString)
    
  }
}