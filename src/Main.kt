import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a phrase:")
    val phrase = scanner.nextLine() // Use nextLine() to read the full phrase
    val words = phrase.split(Regex("[\\s+-]+")) // Store the result of split in a variable

    val acronym = StringBuilder()
    for (word in words) { // Iterate over words, not characters
        if (word.isNotEmpty() && word.any { it.isLetter() }) { // Check the word, not the phrase
            acronym.append(word.first { it.isLetter() }) // Get the first letter of the word
        }
    }
    println(acronym.toString().uppercase())
}