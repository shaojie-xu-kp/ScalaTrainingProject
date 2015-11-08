package it.shaojiexu.www.sort

object QuickSort {
  
  def main(args:Array[String]) {
    
    var a1 = Array(1,3,2,6,5,7,10,9,0,-1)
    
    for( x <- a1) {
      print(x)
      print(" ")
    }
    
    a1 = functionalStyleSort(a1)
    
    println("")
    
    for( x <- a1) {
      print(x)
      print(" ")
    }
    
  }
  
  def sort(xs: Array[Int]) {
    
    def swap(i: Int, j:Int) {
      val t = xs(i); xs(i) = xs(j); xs(j) = t;
      ()
    }
    
    def sort1(lowerIndex: Int, higherIndex:Int) {
      val pivot = xs((lowerIndex + higherIndex) / 2)
      var i = lowerIndex; var j = higherIndex
      while(i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if(i <= j) {
          swap(i,j)
          i += 1
          j -= 1
        }
      }
      if(lowerIndex < j) sort1(lowerIndex, j)
      if(i < higherIndex) sort1(i, higherIndex)
    }
    
    sort1(0, xs.length -1)
    
  }
  
  def functionalStyleSort(xs: Array[Int]) : Array[Int] = {
    
    if(xs.length <= 1) xs
    else {
      val pivot = xs(xs.length/2)
    	Array.concat(functionalStyleSort(xs.filter(pivot >)), 
    	                                 xs.filter(pivot ==), 
    	             functionalStyleSort(xs.filter(pivot <)))
    }
    
  }
  
}