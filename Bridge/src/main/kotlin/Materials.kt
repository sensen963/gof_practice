package org.example

class PrizeMaterialGold: PrizeMaterial() {
    override fun get(): Material = Material("Gold")
}
class PrizeMaterialSilver: PrizeMaterial() {
    override fun get(): Material = Material("Silver")
}
class PrizeMaterialBronze: PrizeMaterial() {
    override fun get(): Material = Material("Bronze")
}