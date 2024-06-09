public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.aumentarCanal();


        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
        smartTv.diminuirVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.mudarCanal(32);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

    }
}
