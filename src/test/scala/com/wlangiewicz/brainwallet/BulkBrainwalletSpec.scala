package com.wlangiewicz.brainwallet

class BulkBrainwalletSpec extends UnitSpec {
  "BulkBrainwallet" should "generate WIF for \"abc\"" in {
    val output = BulkBrainwallet.getWIF("abc")
    output should be ("5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8")
  }

  "BulkBrainwallet" should "generate WIF for \"abc and cba\"" in {
    val output = BulkBrainwallet.getWIF(List("abc", "cba"))
    output should be (List("5KEQgeL4EwjuEAyPQBoaJYVrbt5kSUsrwXPkjzAQTPiNoUxxeS8", "5JeYukRxB6fJvcEgUKd67X7qRQGCFre6Lmja7bXdfmo54HUmMg2"))
  }



}
