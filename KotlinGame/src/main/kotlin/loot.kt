enum class LootType {
    POTION, ARMOR, RING
}

class Loot(val name: String, val Loottype: LootType, val value: Double){

    override fun toString(): String {
        return "$name is $Loottype and is worth $value."
    }

}