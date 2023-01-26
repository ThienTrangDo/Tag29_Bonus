class Feuer(name: String,
            level: Int,
            trefferpunkte: Int,
            schadenswert: Double,
            typ: String = "Feuer",
            isKo:Boolean=false): Pokemon(name, level, trefferpunkte, schadenswert, typ, isKo) {

    override fun attack(pok: Pokemon) {

    }
}
