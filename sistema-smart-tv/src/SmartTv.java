public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (ligada) {
            if (volume < 100) {
                volume++;
                System.out.println("Aumentando volume para: " + volume);
            } else {
                System.out.println("Volume já está no máximo.");
            }
        } else {
            System.out.println("TV desligada");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            if (volume > 0) {
                volume--;
                System.out.println("Diminuindo volume para: " + volume);
            } else {
                System.out.println("Volume já está no mínimo.");
            }
        } else {
            System.out.println("TV desligada");
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("TV desligada");
        }
    }

    public void diminuirCanal() {
        if (ligada) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal: " + canal);
            } else {
                System.out.println("Você já está no canal mínimo.");
            }
        } else {
            System.out.println("TV desligada");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            if (novoCanal >= 1 && novoCanal <= 100) {
                canal = novoCanal;
                System.out.println("Mudando para o canal: " + canal);
            } else {
                System.out.println("Canal inválido.");
            }
        } else {
            System.out.println("TV desligada");
        }
    }
}