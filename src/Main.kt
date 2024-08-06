//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/***************
 * Kotlin Programming Task
 * 1: Drawing a Right-Angled Triangle
 * Write a Kotlin program that draws a right-angled triangle of stars with a height of 5.
 *
 * 2: Drawing an Isosceles Triangle
 * Write a Kotlin program that draws an isosceles triangle of stars with a height of 5.
 *
 * 3: Drawing a Pyramid
 * Write a Kotlin program that draws a pyramid of stars with a height of 5.
 *
 * 4: Counting Vowels in a String
 * Write a Kotlin program that counts the number of vowels (a, e, i, o, u) in the string "Kotlin is awesome".
 *
 * 5: Reversing a String
 * Write a Kotlin program that reverses the string "Kotlin".
 *
 * 6: Filtering Digits from a String
 * Write a Kotlin program that filters and prints only the digits from the string "K0t1l1n 2s 4w3s0m3".
 *
 * 7: Splitting a String into Words
 * Write a Kotlin program that splits the string "Kotlin is a great language" into words and prints each word on a new line.
 *
 * 8: Counting Words in a String
 * Write a Kotlin program that counts the number of words in the string "Kotlin is a great language".
 *
 * 9: Removing Spaces from a String
 * Write a Kotlin program that removes all spaces from the string "Kotlin is fun" and prints the result.*******************/

fun main() {
//1: Drawing a Right-Angled Triangle
    drawRightAngled(5)

}

//1:fun Drawing a Right-Angled Triangle
// * Write a Kotlin program that draws a right-angled triangle of stars with a height of 5.
fun drawRightAngled(height : Int){
    for (i in 0..height){
        for (j in 0 .. i){
            print("* ")
        }
        println()
    }
}