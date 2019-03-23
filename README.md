# WORD WRAP KATA

You write a class called Wrapper, that has a single static function named wrap that takes two arguments, a string, and a column number. The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number. You try to break lines at word boundaries (if it's not possible, just break word)

The limit will always be an integer greater or equal to one.
Input text will be the empty string or a string consisting of one or more words separated by single spaces. It will not contain any punctiation or other special characters.

Like a word processor, break the line by replacing the last space in a line with a newline.

Examples:
- ("test", 7) -> "test"
- ("a lot of words for a single line", 10) -> "a lot of--words for--a single--line"
- ("areallylongword", 6) -> "areall--ylongw--ord"