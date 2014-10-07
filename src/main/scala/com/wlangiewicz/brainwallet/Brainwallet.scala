package com.wlangiewicz.brainwallet

import java.security.MessageDigest

import org.bitcoinj.core.ECKey
import org.bitcoinj.params.MainNetParams


object Brainwallet {
  def getWIF(s: String): String = {
    val md: MessageDigest  = MessageDigest.getInstance("SHA-256")
    md.update(s.getBytes("UTF-8"))
    val hash = md.digest()
    new ECKey(hash, null).getPrivateKeyEncoded(MainNetParams.get).toString
  }

}
