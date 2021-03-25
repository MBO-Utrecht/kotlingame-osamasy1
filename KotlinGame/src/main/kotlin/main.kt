fun main(args: Array<String>) {
    val fists = Weapon("Fists", 10 )
    val osama = Player("Osama", 4, 1, 0)

    osama.show()

    val baksteen = Weapon( "Baksteen" , 20)

    println(osama.weapon.name)

    osama.weapon = baksteen

  //  println(osama.weapon.name)
 //   println(osama.weapon.damageInflicted)

  //  osama.weapon= Weapon("Dikke Doekoe", 4 )

    val kaan = Player("kaan", 2, 1, 10, )
    val wokpan = Weapon("Wokpan", 18 )


   //println(kaan.weapon.name)
  //  println(kaan.weapon.damageInflicted)
    kaan.weapon = wokpan
    osama.weapon = kaan.weapon

    osama.show()

    val redPotion = Loot("Red potion", LootType.POTION, 7.50)
    osama.inventory.add(redPotion)
    osama.showInventory()

  println(osama.toString())

   //println(osama.weapon.name)
}