# Задачи на Kotlin. Часть 1

В папке `taskCountSymbol` находится файл `countSymbolsString` с решением 1 задачи - Написать метод, который будет считать количество символов в строке. Метод принимает в себя строку и искомый символ (запуск происходит в этом же файле)

В папке `taskCheckInputAnyObject` находится файл `checkInputAnyObject` с решением 2 задачи - Написать метод, который может принимать в себя Any? и, исходя из того к какому типу принадлежит объект делает определенные действия (запуск происходит в этом же файле)

В папке `taskWithClassesAnimals` находится файлы с решением 3 задачи с классами и интрефейсами:

- interface Runnable
- interface Swimmable
- class Pet
- class Cat
- class Fish
- class Tiger
- class Lion
- class Jaguar
- class Salmon
- class Tuna
- class Shark

Создание и обращение к свойствам и методам классов происходит в файле `Main.kt` в папке `kotlin`

# Задачи на Kotlin. Часть 2
В папке `taskWithQueue` находится файл `Queue` с решением 1 задачи 2 части - Написать свою реализацию очереди (queue) (Пример использование содержится в том же файле в функции main)

В папке `taskWitnCalculator` находится файл `calculator` с решением 2 задачи 2 части - Необходимо реализовать:

- Функции высшего порядка для операций сложения, вычитания, умножения и деления
- Функцию которая принимает в качестве аргумента строковые символы "+", "-", "*", "/" и возвращает соответствующую функцию высшего порядка и выбрасывает исключение UnsupportedOperationException если аргумент неверен
- Функцию main которая вызывает метод calculator со всеми операциями

Пример использования находятся в том же файле `calculator`

В папке `taskUpdatelist` находится файл `updateList` с решением 3 задачи 2 части - Написать функцию, которая принимает в себя список с числами типа Double? (nullable), после чего:
- Делит на 2 элемент, если он нечетный, а если четный - возводит в квадрат ( проверка на четность/нечетность - без учета дробной части)
- Выкидывает все цифры больше 25
- Отбрасывает null
- Сортирует коллекцию по убыванию
- Отбрасывает все элементы коллекции кроме первых 10 (коллекция может быть и меньших размеров)
- Возвращает сумму элементов в оставшейся коллекции, после чего ее элементы нужно вывести в консоль с округлением до двух знаков после запятой

Пример использования находится в том же файле `updateList` в функции main