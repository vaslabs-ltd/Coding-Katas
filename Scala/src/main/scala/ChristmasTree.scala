object ChristmasTree extends App {
  def draw(x: Int) = {
    if(x == 1) 
        "#"
    else if(x == 2)
        s"#\n#\n"
    else 
        ""
  }
}

// 1 i 2: apla kormo
// 3 *
//   #
//   #
// 4    *
//     ~~~
//      #
//      #
// 
// 
     