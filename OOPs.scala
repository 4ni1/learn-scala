object OOPs {
	def main(args : Array[String]){

		var dog = new Animal
		println(dog)
	}

	class Animal(var name : String, var sound : String){
	
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
			return "The Animal %s has %s sound.".format(this.name, this.sound)
		}
	}
}