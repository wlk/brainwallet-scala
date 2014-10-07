package com.wlangiewicz.brainwallet

object Main extends App {
  override def main(args: Array[String]): Unit ={
    if(args.length == 0){
      Console.println("USAGE: sbt \"run-main com.wlangiewicz.brainwallet.Main <your brainwallet password>\"")
    }
    else{
      val input = args(0)
      val output = Brainwallet.getWIF(input)
      Console.println(output)
    }

  }

}
