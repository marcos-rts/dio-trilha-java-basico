public class SmartTv {
    
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        if (ligada==true) {
            volume++;
            System.out.println("aumentando volume para: " + volume);
        }
        else{
            System.out.println("TV desligada");
        }
        
    }
    
    public void diminuirVolume(){
        if (ligada==true) {
            volume--;
            System.out.println("diminuindo volume para: " + volume);
        }
        else{
            System.out.println("TV desligada");
        }
    }

    public void diminuirCanal(){
        if (ligada==true) {
            canal--;
            System.out.println("Canal: " + canal);
        }
        else{
            System.out.println("TV desligada");
        }
    }

    public void aumentarCanal(){
        if (ligada==true) {
            canal++;
            System.out.println("Canal: " + canal);
        }
        else{
            System.out.println("TV desligada");
        }
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
