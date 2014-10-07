package com.wlangiewicz.brainwallet

class BrainwalletGeneratorSpec extends UnitSpec {
  "Brainwallet" should "generate key for \"abc\"" in {
    val input = "abc"
    val output = Brainwallet.getWIF(input)
    output should be ("5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8")
  }

  "Brainwallet" should "generate key for \"bitcoin\"" in {
    val input = "bitcoin"
    val output = Brainwallet.getWIF(input)
    output should be ("5JdeQ39z8NUkNVvB37tt74Cu2WSNVj7qb9PdY651UoQnqyCm937")
  }

  "Brainwallet" should "generate key for long phrase" in {
    val input = "yard impulse luxury drive today throw farm pepper survey wreck glass federal"
    val output = Brainwallet.getWIF(input)
    output should be ("5KfrXsycsKx7EH8QCVPxSBmjRvMhjqPcMmrRaSQChN57nR8bv6Q")
  }

}
