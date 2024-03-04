class ReverseArrayDataStructure<T>(vararg args: T) {
    private var arr: Array<T> = args as Array<T>
    fun getIterator(): Iterator<T> = ReverseArrayDataIterator<T>(arr)
}

internal class ReverseArrayDataIterator<T>(ts : Array<T>) : Iterator<T> {
    private var arr: Array<T> = ts
    private var index: Int = ts.size - 1
    override fun next(): T = arr[index--]

    override fun hasNext(): Boolean = index >= 0
}