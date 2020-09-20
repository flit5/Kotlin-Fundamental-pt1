fun main() {
    val user = setUser("Arya","photography" ,16)
    println(user)
    printUser("Arya")
}
fun setUser(name: String, hobi: String, age: Int) = "My name is $name,I like $hobi and I'm $age years old"
fun printUser(name: String) {
}