package it.shaojiexu.www.caseclass

/**
  * Created by shaojiexu on 6/5/17.
  */
case class Message(sender: String, recipient: String, body: String)

object MessageCompanion {

  def main(args: Array[String]): Unit = {
    val message1 = Message("shaojie.xu.0920@gmail.com", "junyi.dou@gamil.com", "Come va?")
    val message2 = Message("shaojie.xu.0920@gmail.com", "junyi.dou@gamil.com", "Come va?")
    println(compare(message1, message2))
    println(copy(message1))
  }

  def compare(message1 : Message, message2 : Message) : Boolean = {
    message1 == message2
  }

  def copy(message : Message) : Message = {
    val messageCopy = message.copy(sender = message.recipient, recipient = "claire@bourgogne.fr", body = "i am a clone")
    messageCopy
  }

}