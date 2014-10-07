package com.wlangiewicz.brainwallet

import scala.io.Source

object Main extends App {

  def processInput(input: String, option: String): String = {
    option match {
      case "public" => Brainwallet.getAddress(input)
      case "private" => Brainwallet.getWIF(input)
      case "both" => f"${Brainwallet.getAddress(input)},${Brainwallet.getWIF(input)}"
      case _ => "Please specify: public, private or both"
    }
  }

  def processInputFile(filePath: String) = {
    for(line <- Source.fromFile(filePath).getLines()){
      Console.println(BulkBrainwallet.getWIF(line))
    }
  }

  override def main(args: Array[String]): Unit ={
    if(args.length != 3){
      Console.println("USAGE: sbt \"run-main com.wlangiewicz.brainwallet.Main password|file <your brainwallet password> public|private|both\"")
    }
    else{
      args(0) match {
        case "password" => Console.println(processInput(args(1), args(2)))
        case "file" => processInputFile(args(1)) //at the moment 3rd argument is ignored in this case, we always will get private
      }
    }
  }
}
