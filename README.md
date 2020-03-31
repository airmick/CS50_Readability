## Readability_sys_in_java
### that computes the Coleman-Liau index of the text
> The Coleman-Liau index of a text is designed to output what (U.S.) grade level is needed to understand the text. The formula is:  
> index = 0.0588 * L - 0.296 * S - 15.8  
> Here, L is the average number of letters per 100 words in the text, and S is the average number of sentences per 100 words in the text.
#### 1. the program must prompt the user for a string of text  
##### 2. the program count the number of _letters, words, and sentences_ in the text. Assuming that a letter is any lowercase character from a to z or any uppercase character from A to Z, any sequence of characters separated by spaces should count as a word, and that any occurrence of a period, exclamation point, or question mark indicates the end of a sentence.  
###### 3. The program print the grade level computed by the Coleman-Liau formula, program should print as output "Grade X" where X is the grade level computed by the _Coleman-Liau formula_, rounded to the nearest integer.  

  
>source: https://cs50.harvard.edu/college/2019/fall/psets/2/readability/
