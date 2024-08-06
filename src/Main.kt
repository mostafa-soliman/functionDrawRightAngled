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
    println()
    isoscelesTriangle(5)
    println()
    pyramid(5)
    println()
    diamondShape(5)
    println()
    val str:String = "Kotlin is awesome"
    println(str.vowelsInString())
    println()
    val reverseStr:String = "Kotlin"
    println(reverseStr.reversStr())
    println()
    val filterDiget:String = "K0t1l1n 2s 4w3s0m3"
    println(filterDiget.filterDigits())
    println()
    val filterStr:String = "K0t1l1n 2s 4w3s0m3"
    println(filterStr.filterWord())
    println()
    val spiltStr:String = "Kotlin is a great language"
    println(spiltStr.splittingString())

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

//2: Drawing an Isosceles Triangle
// * Write a Kotlin program that draws an isosceles triangle of stars with a height of 5.

fun isoscelesTriangle(height : Int){
    for (i in 1..height){
        for (j in 1 .. height - i){
            print("  ")
        }
        for (k in 1 .. (2 * i - 1)){
            print("* ")
        }
        println()
    }
}

//3: Drawing a Pyramid
// * Write a Kotlin program that draws a pyramid of stars with a height of 5.

fun pyramid(height : Int){
    for (i in 1..height){
        for (j in 1 .. height - i){
            print(" ")
        }
        for (k in 1 .. (2 * i - 1)){
            print("*")
        }
        println()
    }
}

// 3-1: Drawing a Diamond Shape
// * Write a Kotlin program that draws a diamond shape of stars with a height of 5.
//   - The diamond shape should be centered and consist of stars with spaces around it to form the diamond pattern.

fun diamondShape(height : Int){
    for (i in 1..height) {
        for (j in 1..height) {
            if(i == j || i == height + 1 - j) {
                print("*")
            }else
            { print(" ") }
        }
        println()
    }

}


//* 4: Counting Vowels in a String
// * Write a Kotlin program that counts the number of vowels (a, e, i, o, u) in the string "Kotlin is awesome".
// *

fun String.vowelsInString():Int{
    val vowel = "aeoiu"
    return  this.count {it in vowel}
}

// * 5: Reversing a String
// * Write a Kotlin program that reverses the string "Kotlin".

fun String.reversStr() : String{
    return  this.reversed()
}

// * 6: Filtering Digits from a String
// * Write a Kotlin program that filters and prints only the digits from the string "K0t1l1n 2s 4w3s0m3".

fun String.filterDigits() : String{
    val regex = "[1-9]".toRegex()
    return this.filter { it.toString().matches(regex) }
}
fun String.filterWord() : String{
    val regex = "[a-zA-z]".toRegex()
    return this.filter { it.toString().matches(regex) }
}

// * 7: Splitting a String into Words
// * Write a Kotlin program that splits the string "Kotlin is a great language" into words and prints each word on a new line.
// *

fun String.splittingString() : Unit{
    val wordList = this.split(" " )

     wordList.forEach { println( it ) }
}






