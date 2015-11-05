package it.shaojiexu.www.Tree

object Sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(13); 

  val x = 6;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); 
  
  val y = 2;System.out.println("""y  : Int = """ + $show(y ));$skip(31); 
  def decrease(i: Int) = i - 1;System.out.println("""decrease: (i: Int)Int""");$skip(14); val res$1 = 
  decrease(y);System.out.println("""res1: Int = """ + $show(res$1))}

}
