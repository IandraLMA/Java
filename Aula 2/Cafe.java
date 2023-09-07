public class Cafe {
    String recipiente; 
    String cor;
    Integer quantidade;
    boolean leite;
    Boolean leiteK;
    boolean acucar;
    boolean canela;
    
    public Cafe (){
        recipiente ="xicara";

    }
    
    public void prepararExpresso(boolean leite, boolean canela, boolean acucar) {
        quantidade = 35;

        if(Boolean.TRUE.equals(this.leiteK)){

        }

        if (leite){
            cor= "caramelo";
        }else{
            cor="preto";
        }
        this.leite = leite;
        this.canela= canela;
        this.acucar=acucar;
        System.out.println("Preparando Expresso:");
    }

    public void prepararLongo(boolean leite, boolean canela, boolean acucar){
        quantidade = 250;
        if (leite){
            cor= "caramelo";
        }else{
            cor="preto";
        }
        this.leite = leite;
        this.canela= canela;
        this.acucar=acucar;
        System.out.println("Preparando Cafe longo:");
    }

    public void servirCafe(){
        System.out.println("Cafe pronto: " + quantidade + "ml" );
        System.out.println("Cor:"+ cor );
        if(canela){
            System.out.println("Com canela");
        }else{
            System.out.println("Sem canela");
        }
        if(leite){
            System.out.println("Você pediu com leite");
        }else{
            System.out.println("Cafe puro");
        }
        if(acucar){
            System.out.println("Com açucar");
        }else{
            System.out.println("Sem açucar");
        }

    }

}
