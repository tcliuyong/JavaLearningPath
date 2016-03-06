var map  = Map("scala" -> 27,"java"->5)
for ((k,v)<- map){
  println(k + v)
}
map += ("T"-> 10)
map -= "java"
map.getOrElse("abc" , 100)
for((k,v) <- map){
  println(k  + v)
}
val symbol = Array(1,2,3)
val counts = Array(2,56,34)
val tmp = symbol.zip(counts)
for((k,v) <- tmp){
  println(k + v)
}