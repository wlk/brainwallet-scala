package com.wlangiewicz.brainwallet

import org.bitcoinj.core.ECKey
import org.bitcoinj.params.MainNetParams


/**
 * Optimized version of Brainwallet for single-threaded use
 */
object BulkBrainwallet {
  val SHA256 = new SHA256()

  def getWIF(s: String): String = {
    new ECKey(SHA256.getHash(s), null).getPrivateKeyEncoded(MainNetParams.get).toString
  }

  def getWIF(inputs: List[String]): List[String] = {
    inputs.map {
      input => new ECKey(SHA256.getHash(input), null).getPrivateKeyEncoded(MainNetParams.get).toString
    }

  }
}
