package org.example

class PrizeShapeMedal: PrizeShape() {
    override fun get(): Shape = Shape("Round")
}
class PrizeShapeCup: PrizeShape() {
    override fun get(): Shape = Shape("Cup")
}