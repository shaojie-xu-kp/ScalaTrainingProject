package it.shaojiexu.www.traitExample

object DateCompanion {

  def main(args: Array[String]) {

    var date1 = new Date(2015, 9, 20)
    var date2 = new Date(2014, 9, 20)

    println(date1 == date2)
    println(date1 < date2)
    println(date1 <= date2)
    println(date1 > date2)
    println(date1 >= date2)

  }

}