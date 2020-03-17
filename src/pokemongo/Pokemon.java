
package pokemongo;

public class Pokemon {
    public String nome;    
    public String tipo;
    public int level;    
    private int forca;
    private String ataques[] = new String [5];

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
    }
    

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String[] getAtaques() {
        return ataques;
    }

    public void setAtaques(String[] ataques) {
        this.ataques = ataques;
    }
    
    
    public void imprimeAtaques ( ){
        
        for (int i = 0; i < ataques.length; i++){
            System.out.println("Tipo Ataque:" + ataques[i]);
            
        }
    }
       
    
    public void nomeTipoForca(){        
        System.out.println("Nome:"+nome);
        System.out.println("Força:"+forca);
        System.out.println("Tipo:"+tipo);
    }
    
    
    public int posAtaque(String umAtaque){ 
         int r = -1;
         for (int i = 0; i < ataques.length; i++){
             if (umAtaque == ataques[ i ]){
                 r = i;
             }             
         } 
         return r;          
    }
    
    public void nomeAtaque (int p){
        
        System.out.println("Nome de Ataque:"+ataques[p]);
        
    }
    
    
}