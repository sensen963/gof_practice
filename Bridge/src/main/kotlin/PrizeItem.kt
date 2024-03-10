package org.example

abstract class PrizeMaterial{
    abstract fun get(): Material
}

abstract class PrizeShape{
    abstract fun get(): Shape
}

class PrizeItem (private var prizeMaterial: PrizeMaterial, private var prizeShape: PrizeShape): PrizeItemInterface{
    override fun getMaterial(): Material = prizeMaterial.get()
    override fun getShape(): Shape = prizeShape.get()
}