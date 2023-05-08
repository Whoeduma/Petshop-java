
package petshop;

import classes.Animal;
import classes.Cachorro;
import classes.Peixe;

public class Teste {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 10.5);
        Peixe peixe = new Peixe("Enguia", 3.6, "agua doce");
        Cachorro cachorro = new Cachorro("Cachorro", 5.0 ,"Husky");
        
        
        System.out.println("Dados animal: \n" +animal.toString());
        System.out.println("Dados peixe: \n" + peixe.toString());
        System.out.println("Dados cachorro: \n" + cachorro.toString());
    }
    
}
