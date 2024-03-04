fun main() {
    var dataIterator = ReverseArrayDataStructure("Bob", "Alice", "Mike", "Cathy").getIterator()
    while(dataIterator.hasNext()){
        println(dataIterator.next())
    }
}