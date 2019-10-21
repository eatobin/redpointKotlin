package redpointKotlin

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

private val rinSta: Player = Player("Ringo Starr", listOf(GiftPair("JohLen", "GeoHar")))
private val johLen: Player = Player("John Lennon", listOf(GiftPair("PauMcc", "RinSta")))
private val geoHar: Player = Player("George Harrison", listOf(GiftPair("RinSta", "PauMcc")))
private val pauMcc: Player = Player("Paul McCartney", listOf(GiftPair("GeoHar", "JohLen")))

private val players: Players = mapOf("RinSta" to rinSta, "JohLen" to johLen, "GeoHar" to geoHar, "PauMcc" to pauMcc)

private val roster: Roster = Roster("The Beatles", 2014, players)

class RosterTest : StringSpec({

    "rosterName should return \"The Beatles\"" {
        roster.rosterName.shouldBe("The Beatles")
    }

    "rosterYear should return 2014" {
        roster.rosterYear.shouldBe(2014)
    }

})
