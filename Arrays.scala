import scala.collection.mutable._
object Arrays{
	def main(args : Array[String]){
		val fixedIntArray = new Array[Int](20)
		val variableIntArray = new ArrayBuffer[Int]()

		variableIntArray.insert(0, 0)

		variableIntArray += 1

		variableIntArray ++= Array(2,3,4)

		// variableIntArray.foreach(println)

		var arrayTimes2 = for(num <- variableIntArray) yield num * 2

		// arrayTimes2.foreach(println)

		var arrayMod2 = for(num <- variableIntArray if num % 2 == 0) yield num 

		// arrayMod2.foreach(println)

		variableIntArray.insert(1, 9, 8, 7)

		// variableIntArray.foreach(println)

		variableIntArray.remove(1, 2)

		// variableIntArray.foreach(println)

		for(j <- 0 to (fixedIntArray.length - 1)){
			fixedIntArray(j) = j
		}
		// fixedIntArray.foreach(println)

		println("max : " + fixedIntArray.max)
		println("sum : " + fixedIntArray.sum)
		println("min : " + fixedIntArray.min)

		var sortedNum = fixedIntArray.sortWith(_ > _)

		// sortedNum.foreach(println)

		println(sortedNum.deep.mkString(", "))

	}
}