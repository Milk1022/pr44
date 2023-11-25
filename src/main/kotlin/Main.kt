import java.util.*

fun main() {
    // Запрос ввода данных у пользователя
    val scanner = Scanner(System.`in`)
    print("Введите два числа и символ операции (ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ): ")

    try {
        // Считывание введенных данных
        val number1 = scanner.nextDouble()
        val number2 = scanner.nextDouble()
        val operation = scanner.next()

        // Выполнение операции и вывод результата
        val result = when (operation) {
            "+" -> number1 + number2
            "-" -> number1 - number2
            "*" -> number1 * number2
            "/" -> {
                if (number2 != 0.0) {
                    number1 / number2
                } else {
                    "Ошибка: деление на ноль"
                }
            }
            else -> "Ошибка: недопустимая операция"
        }

        println("Результат: $result")
    } catch (e: InputMismatchException) {
        println("Ошибка: введены некорректные данные")
    } finally {
        // Закрываем Scanner
        scanner.close()
    }
}