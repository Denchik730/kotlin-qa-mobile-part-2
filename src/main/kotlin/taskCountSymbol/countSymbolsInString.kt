package org.example.taskCountSymbol

fun main() {
    println(countDesiredSymbolInString("Молоко", 'о'));
    println(countDesiredSymbolInString("Молоко", 'а'));
}

fun countDesiredSymbolInString(transmittedString: String, desiredSymbol: Char) : String {
    var countSymbols = 0

    for (letterInString in transmittedString) {
        if (letterInString == desiredSymbol) {
            countSymbols++
        }
    }

    if (countSymbols != 0) {
        return "Количество символов '$desiredSymbol' в строке \"$transmittedString\" == $countSymbols"
    } else {
        return "Символ ‘$desiredSymbol’ в строке \"$transmittedString\" не найден"
    }

}