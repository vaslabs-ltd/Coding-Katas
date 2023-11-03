class LastWordLengthTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Empty String reports 0 Length") {
    assert(LastWordLength.lastWordLength("") === 0)
  }

  test("String with a single space  returns 0 Length") {
    assert(LastWordLength.lastWordLength("  ") === 0)
  }

  test("String with a single non blank character  returns 1 Length") {
    assert(LastWordLength.lastWordLength("a") === 1)
  }

  test("String with a multiple non blank character separated by space returns 1 Length") {
    assert(LastWordLength.lastWordLength("a b") === 1)
  }

  test("String with a multiple non blank characters and ending in spaces has last length") {
    assert(LastWordLength.lastWordLength("a b   ") === 1)
  }

  test("String has length 2") {
    assert(LastWordLength.lastWordLength("  a  bb   ") === 2)
  }
}
