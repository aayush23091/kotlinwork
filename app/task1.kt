package com.example.firstapplication

fun main(args: Array<String>) {
    var age = arrayOf(1, 2, 3)
    println(age)
    println("The first Person age is " + age[0])
    println("The second Person age is " + age[1])
    println("The third Person age is " + age[2])
    println("*****************************")
    var name = arrayOf("ram", "shyam", "Hari")
    name[1] = "Aayush"
    println("The first Person name is " + name[0])
    println("The second Person name is " + name[1])
    println(name.size)

    var Name = arrayListOf<String> ("Nabin", "rajesh","shiv")
    Name.add ("aryan")
    Name. add (4, "Syowam")
    Name. remove ( "shiv")
    Name.removeAt (0)
    println (Name)
}

package com.example.firstapplication

fun main(){
// Immutable List
    val lst = listOf("mango", "orange", "banana")
    println("Mutable list")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()
// Mutable List
    val mutableLst = mutableListOf("mango", "orange", "banana")
    mutableLst.add("grapes")
    println("Immutable list")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
//for set
        val numbers = setOf(1, 2, 3, 4)
        for (elements in numbers) {
            println(elements)
        }
        val numbersBackwards = setOf(4, 3, 2, 1)
        println("The sets are equal: ${numbers == numbersBackwards}")
//for map
        val countriesCapitals = mapOf(
            "Nepal" to "Kathmandu",
            "China" to "Beijing",
            "India" to "New Delhi")
        println ("All keys : ${countriesCapitals.keys}")
        println("All values : ${countriesCapitals.values}")
        println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
    }
}

package com.example.firstapplication

fun main() {
    var num1: Double = 12.6
    var num2: Double = 5.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")
//Assignment operator
    var x:Int = 31
    var y:Int = 13
    var Z:Int = 2
    Z = x+y
    println("Z = x + y = $Z")
    Z +=x
    println("Z += x = $Z")
    Z -=x
    println("Z -= x = $Z")
    Z *= x
    println("Z *= x = $Z")
    Z /= x
    println("Z /= x = $Z")
    Z %= x
    println("Z %= x = $Z")
//Bodmas
    var output:Int = 13+12*2
    println ("output = "+output)
    output = (13+12) * 2
    println ("output = "+output)
    var X:Int = 15;
    var Y:Int = 12;
    var z:Int = 50;
    var sum:Int = 0;
    sum = X +--Y+--z
    print("x+ --y + --z ::: $sum")
}


