
open OUnit2
open Length_of_last_word

let tests = "test suite for length of string" >::: [
  "empty string" >:: (fun _ -> assert_equal 0 (last_string_length ""));
  "just spaces string" >:: (fun _ -> assert_equal 0 (last_string_length "  "));
  "single character string" >::(fun _ -> assert_equal 1 (last_string_length "a"));
  "single character string with space in front" >::(fun _ -> assert_equal 1 (last_string_length " a"));
  "characters separated by space" >::(fun _ -> assert_equal 1 (last_string_length "a b"));
  "words separated by space" >::(fun _ -> assert_equal 3 (last_string_length "a  b c   ddd "));
  "string that have space in the end" >::(fun _ -> assert_equal ~printer:string_of_int 1 (last_string_length "a b "));
  "string that have newline " >::(fun _ -> assert_equal ~printer:string_of_int 4 (last_string_length "a\n b hghg\n"));
  "string that have delete chars in the end" >::(fun _ -> assert_equal ~printer:string_of_int 4 (last_string_length "a\n b hghg\x7F"));

]

let _ = run_test_tt_main tests