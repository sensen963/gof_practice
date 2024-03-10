package org.example

abstract class PrizeMaterial{
    abstract fun Get(): Material
}

abstract class PrizeShape{
    abstract fun Get(): Shape
}

class PrizeItem (var prizeMaterial: PrizeMaterial, var prizeShape: PrizeShape): PrizeItemInterface{
    override fun GetMaterial(): Material = prizeMaterial.Get()
    override fun GetShape(): Shape = prizeShape.Get()
}