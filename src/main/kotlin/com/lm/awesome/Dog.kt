package com.lm.awesome

/** https://stepik.org/lesson/78044/step/6?unit=54901 */

fun printDogName(d: Dog) { // Функция принимает объект типа Dog
    println(d.name)
}

//обратить внимание на var
class Dog(/*var name: String*/) {

    //Полем класса называется переменная, принадлежащая классу
    //Свойством класса называется переменная, принадлежащая классу, которую можно
    //изменить извне
    val sex: Int = 0 //не изменяется
    val skin: String by lazy { "black" } //не изменяется
    var name: String = "Sharik" //можно изменить

    init {
        println("Создан объект класса Dog с именем $name")
    }

    fun printSelfName() {
        printDogName(this)
        // Мы передаем функции this, т. е. самого себя, текущий объект
    }

    fun helloDog() {
        name.plus(" приветливый")
    }

    //???
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }

}

fun main(args: Array<String>) {
    //var dog = Dog("Шарик")
    //print(dog.name)

    val dog = Dog()
    println(dog.sex)
    println(dog.skin)
    println(dog.name)

    dog.name = "Vasya"
    println(dog.name)
}

class Dog1 {
    var name1 = "Sharick"
    fun setName(name: String) {
        this.name1 = name
    }
}



