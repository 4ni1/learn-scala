object Functions{
	def main(args : Array[String]){
		def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
			return num1 + num2
		}

		def getS() : Unit = {
			println("Hello, How are you")
		}

		def getSumArray(nums : Int*) : Int = {
			var sum : Int = 0
			for (num <- nums){
				sum += num
			}
			sum
		}

		println("5 + 4 = " + getSum(5,4))
		println("4 + 5 = " + getSum(num2=5, num1=4))
		getS
		println("sum of array : " + getSumArray(1,2,3,4,5,6))

	}
}