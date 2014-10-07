package com.wlangiewicz.brainwallet

object Main extends App {

  def processInput(input: String, option: String): String = {
    option match {
      case "public" => Brainwallet.getAddress(input)
      case "private" => Brainwallet.getWIF(input)
      case "both" => f"${Brainwallet.getAddress(input)}\n${Brainwallet.getWIF(input)}"
      case _ => "Please specify: public, private or both"
    }
  }

  override def main(args: Array[String]): Unit ={
    if(args.length != 2){
      Console.println("USAGE: sbt \"run-main com.wlangiewicz.brainwallet.Main <your brainwallet password> public|private|both\"")
    }
    else{
      val output = processInput(args(0), args(1))
      Console.println(output)
    }
  }
}
