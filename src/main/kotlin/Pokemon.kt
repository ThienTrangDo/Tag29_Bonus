open class Pokemon(name: String,
                   level: Int,
                   trefferpunkte: Int,
                   schadenswert: Double = 0.5*level,
                   typ: String,
                   isKo: Boolean = false) {

    var trefferpunkte = 10
    var isKo : Boolean = false

    fun looseTP(lost: Int){
        var loose: Int = trefferpunkte - lost

        if (lost >= trefferpunkte){
            println("Das Pokemon wurde besiegt.")
            isKo = true
        }
    }

    open fun attack (pok: Pokemon){}

}
