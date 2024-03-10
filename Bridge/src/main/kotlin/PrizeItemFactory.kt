package org.example

 class PrizeItemFactory {
     companion object{
        fun Create(): Map<String, PrizeItemInterface> {
            var materialGold = PrizeMaterialGold()
            var materialSilver = PrizeMaterialSilver()
            var materialBronze = PrizeMaterialBronze()
            var shapeMedal = PrizeShapeMedal()
            var shapeCup = PrizeShapeCup()
            return mapOf(
                "GoldMedal" to PrizeItem(materialGold, shapeMedal),
                "SilverMedal" to PrizeItem(materialSilver, shapeMedal),
                "BronzeMedal" to PrizeItem(materialBronze, shapeMedal),
                "GoldCup" to PrizeItem(materialGold, shapeCup),
                "SilverCup" to PrizeItem(materialSilver, shapeCup),
                "BronzeCup" to PrizeItem(materialBronze, shapeCup),
            )
        }
    }
 }
