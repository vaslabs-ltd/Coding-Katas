import scala.annotation.tailrec
object LastWordLength {
  def lastWordLength(input: String): Int = 
    lastWordLengthSteps(input, input.length() - 1, 0)
    
    
//     {
//     val lastWhitespaceIndex = input.lastIndexOf(" ")
//     input.size - lastWhitespaceIndex
//   }
    // lastWordLengthSteps(input, input.length() - 1, 0)

  @tailrec
  private def lastWordLengthSteps(input: String, index: Int, count: Int): Int = 
    if (index < 0)
        count
    else if (input.charAt(index).isWhitespace && count > 0)
        count
    else if (input.charAt(index).isWhitespace)
        lastWordLengthSteps(input, index-1, count)
    else
        lastWordLengthSteps(input, index-1, count+1)
}