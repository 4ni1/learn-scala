object OOPs {
	def main(args : Array[String]){

		var dog = new Animal("Dog", "Bark")
		println(dog)

		var cat = new Animal("Cat", "Meow")
		println(s"${cat.getName} with id ${cat.id} says ${cat.getSound}")

		var cow = new Animal
		cow.setName("Cow")
		cow.setSound("Moo")
		println(cow)

		var spike = new Dog("Spike", "Bark", "Grrr")
		println(spike)

		var ware = new Wolf("Ware")
		println(ware.move)

	}

	class Animal(var name : String, var sound : String){
		
		val id = Animal.newIdNum

		def setName(name : String){
			this.name = name
		}

		def setSound(sound : String){
			this.sound = sound
		}

		def getName() : String = {this.name}
		def getSound() : String = {this.sound}

		def this(name : String){
			this(name, "No Sound")
		}

		def this(){
			this("No Name", "No Sound")
		}

		override def toString() : String = {
			return "The Animal %s with id %d has %s sound.".format(this.name, this.id, this.sound)
		}
	}

	object Animal{
		private var IdNum = 0
		private def newIdNum = { IdNum += 1; IdNum} 
	}

	class Dog(name : String, sound : String, growl : String) extends Animal(name, sound){
		
		def this(name : String, sound : String){
			this(name, sound, "No Growl")
		}

		def this(){
			this("No Name", "No Sound", "No Growl")
		}

		override def toString() : String = "%s, the dog with id %d says %s or %s".format(this.getName, this.id, this.getSound, this.growl)
	}


	abstract class Mammal(name : String) {
		val movespeed : Double

		def move : String
	}

	class Wolf(name : String) extends Mammal(name){
		val movespeed = 35.0

		def move = "Wolf with name %s has movespeed %.2f".format(this.name, this.movespeed)
	}
}