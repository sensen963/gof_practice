package org.example

fun main() {
    var items = PrizeItemFactory.Create()
    items.forEach({item -> println("${item.key} is Material: ${item.value.getMaterial().material}, Shape: ${item.value.getShape().shape}.")})
}