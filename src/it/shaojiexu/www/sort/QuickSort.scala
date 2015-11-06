package it.shaojiexu.www.sort

object QuickSort {
  
  def main(args:Array[String]) {
    
    var a1 = Array(1,3,2,6,5,7)
    
    for( x <- a1) {
      print(x)
      print(" ")
    }
    
    sort(a1)
    
    println("")
    
    for( x <- a1) {
      print(x)
      print(" ")
    }
    
  }
  
  def sort(xs: Array[Int]) {
    
    def swap(i: Int, j:Int) {
      val t = xs(i); xs(i) = xs(j); xs(j) = t;
    }
    
    def sort1(l: Int, r:Int) {
      val pivot = xs((l + r) / 2)
      var i = l; var j = r
      while(i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if(i <= j) {
          swap(i,j)
          i += 1
          j -= 1
        }
      }
      if(l < j) sort1(l, j)
      if(i < r) sort1(i, r)
    }
    
    sort1(0, xs.length -1)
    
  }
  
  
  
}