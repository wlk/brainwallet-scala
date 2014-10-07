package com.wlangiewicz.brainwallet

class MainSpec extends UnitSpec {
  "Main" should "return public address for abc and \"public\"" in {
    val output = Main.processInput("abc", "public")
    output should be ("1NEwmNSC7w9nZeASngHCd43Bc5eC2FmXpn")
  }

  "Main" should "return private WIF for abc and \"private\"" in {
    val output = Main.processInput("abc", "private")
    output should be ("5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8")
  }

  "Main" should "return public address and private WIF for abc and \"both\"" in {
    val output = Main.processInput("abc", "both")
    output should be ("1NEwmNSC7w9nZeASngHCd43Bc5eC2FmXpn,5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8")
  }

  "Main" should "return error message for wrong input" in {
    val output = Main.processInput("abc", "incorrect")
    output should be ("Please specify: public, private or both")
  }


}
