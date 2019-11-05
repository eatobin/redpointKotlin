package redpointKotlin

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import redpointKotlin.GiftHistory.addYear
import redpointKotlin.GiftHistory.getGiftPair

val giftHistory: GiftHistoryT = mutableListOf(GiftPair("JohLen", "GeoHar"))

class GiftHistoryTest : StringSpec({
    "A GiftHistory should add a new year" {
        addYear(giftHistory, "NewBee").shouldBe(
            mutableListOf(
                GiftPair("JohLen", "GeoHar"),
                GiftPair("NewBee", "NewBee")
            )
        )
    }

    "A GiftHistory should return a giftPair" {
        getGiftPair(giftHistory, 0).shouldBe(GiftPair("JohLen", "GeoHar"))
    }

//    "A GiftPair should return its giver" {
//        giftPair.giver.shouldBe("GeoHar")
//    }
//
//    "A GiftPair should return an updated givEeEr" {
//        setGivEeEr(giftPair, "NewBee", "ee").shouldBe(GiftPair("NewBee", "GeoHar"))
//        setGivEeEr(giftPair, "NewBee", "er").shouldBe(GiftPair("JohLen", "NewBee"))
//    }
})
