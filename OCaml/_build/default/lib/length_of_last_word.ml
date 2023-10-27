
let rec sum = function
  | [] -> 0
  | x :: xs -> x + sum xs

(* 
let rec last_item_of_string_list a [] = match
 | [] -> a
 | h :: t ->  

val split_on_char : char -> string -> string list*)
(*
    if c s at i is space, then return l
    else
      last_item_of_string_list s i-1 l+1
  *) 
let is_whitespace = fun c -> c <= ' ' || c == '\x7F'

let rec last_item_of_string_list s i l =
  if (i < 0) then
    l
  else if ( (is_whitespace (String.get s i)) && l == 0) then
    last_item_of_string_list s (i-1) l
  else if ( (is_whitespace (String.get s i)) ) then
    l
  else
    last_item_of_string_list s (i-1) (l+1)

let last_string_length s = last_item_of_string_list s ((String.length s)-1) 0



(* let last_string_length s = String.length s *)

(*https://cs3110.github.io/textbook/chapters/basics/functions.html*)
(*succ (square 3)*)