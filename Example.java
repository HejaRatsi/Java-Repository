package labs.one.parta;   //création du package


public class Main {



	public static void main(String[] args){

		//affiche la liste numérotée des arguments de la ligne de commande
		int size = args.length;
		System.out.println("Voici la liste numérotée des arguments de la ligne de commande");
		for(int i = 1; i <= size; i++){
			System.out.println(i + args[i-1]);
		}

	}
}
