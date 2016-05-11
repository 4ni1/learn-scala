import scala.collection.mutable._
object Arrays{
	def main(args : Array[String]){
		val fixedIntArray = new Array[Int](20)
		val variableIntArray = new ArrayBuffer[Int]()

		variableIntArray.insert(0, 0)

		variableIntArray += 1

		variableIntArray ++= Array(2,3,4)

		variableIntArray.foreach(println)

		var arrayTimes2 = for(num <- variableIntArray) yield num * 2

		arrayTimes2.foreach(println)

		var arrayMod2 = for(num <- variableIntArray if num % 2 == 0) yield num 

		arrayMod2.foreach(println)
	}
}