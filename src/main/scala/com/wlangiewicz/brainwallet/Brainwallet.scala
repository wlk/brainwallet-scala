package com.wlangiewicz.brainwallet

import java.security.MessageDigest

import org.bitcoinj.core.ECKey
import org.bitcoinj.params.MainNetParams


object Brainwallet {
  def getAddress(s: String) = {
    val SHA256 = new SHA256()
    new ECKey(SHA256.getHash(s), null).toAddress(MainNetParams.get).toString
  }

  def getWIF(s: String): String = {
    val SHA256 = new SHA256()
    new ECKey(SHA256.getHash(s), null).getPrivateKeyEncoded(MainNetParams.get).toString
  }
}

class SHA256(){
  val md: MessageDigest  = MessageDigest.getInstance("SHA-256")

  def getHash(s: String) ={
    md.update(s.getBytes("UTF-8"))
    md.digest()
  }
}
