package exercicios.aula3;

public class MainAnimal {

	public static void main(String[] args) {
		// Exercicio 2
		Cachorro cachorro = new Cachorro("Pitbull", "Au au");
		Animal animal = (Animal) cachorro;
				
				
//		Exercicio 3
		Animal animalExercicio3  = new Animal("Pastor Alemão", "Au au");
		if (animalExercicio3 instanceof Cachorro){
			Cachorro dog = (Cachorro) animalExercicio3;
		} else {
			System.out.println("O objeto não é um Cachorro.");
		}
	}

}
