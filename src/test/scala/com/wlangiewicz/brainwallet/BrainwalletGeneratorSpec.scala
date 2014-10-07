package com.wlangiewicz.brainwallet

class BrainwalletGeneratorSpec extends UnitSpec {
  "Brainwallet" should "generate WIF for \"abc\"" in {
    val output = Brainwallet.getWIF("abc")
    output should be ("5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8")
  }

  "Brainwallet" should "generate WIF for \"bitcoin\"" in {
    val output = Brainwallet.getWIF("bitcoin")
    output should be ("5JdeQ39z8NUkNVvB37tt74Cu2WSNVj7qb9PdY651UoQnqyCm937")
  }

  "Brainwallet" should "generate WIF for long phrase" in {
    val input = "yard impulse luxury drive today throw farm pepper survey wreck glass federal"
    val output = Brainwallet.getWIF(input)
    output should be ("5KfrXsycsKx7EH8QCVPxSBmjRvMhjqPcMmrRaSQChN57nR8bv6Q")
  }

  "Brainwallet" should "generate address for \"abc\"" in {
    val output = Brainwallet.getAddress("abc")
    output should be ("1NEwmNSC7w9nZeASngHCd43Bc5eC2FmXpn")
  }

  "Brainwallet" should "generate address for long phrase" in {
    val input = "yard impulse luxury drive today throw farm pepper survey wreck glass federal"
    val output = Brainwallet.getAddress(input)
    output should be ("1Cf8wvA9qbHjPxGkkRSRDSZbhprk92Cfwf")
  }

}
