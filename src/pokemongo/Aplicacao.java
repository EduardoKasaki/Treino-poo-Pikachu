
package pokemongo;


public class Aplicacao {

    public static void main(String[] args) {
        Pokemon poke = new Pokemon("Pokemon", "Eletrico", 35);
        
        
        String a[] = new String[5];
        a[0] = "Cabeçada";  
        a[1] = "Chute";   
        a[2] = "Soco";   
        a[3] = "Choque";   
        a[4] = "Chico"; 
        
        
        poke.setAtaques(a);
        poke.setForca(34);
        poke.nomeTipoForca();
        poke.imprimeAtaques();
        poke.posAtaque("choque");
        poke.nomeAtaque(1);
    }
    
}
