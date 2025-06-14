package Iphone.program;

import Iphone.entities.MusicPlayer;
import Iphone.entities.Navegator;
import Iphone.entities.SmartPhone;

public class Iphone implements MusicPlayer, SmartPhone, Navegator {

    public void play() {
        System.out.println("Reproduzindo musica.");
    }
    public void pause(){
        System.out.println("musica pausada.");
    }
    public void selectMusic(String music){
        System.out.println("Selecionando música: " + music);
    }
    //phone
    public void connect(String number){
        System.out.println("Ligando para: " + number);
    }
    public void attend(){
        System.out.println("Atendendo ligação...");
    }
    public void startVoiceMail(){
        System.out.println("Iniciando");
    }
    //navegator
    public void showPage(String url){
        System.out.println("exibindo pagina: " + url);

    }
    public void addBrowserTab(){
        System.out.println("Novo aba adicionado!");
    }
    public void upDatePage(){
        System.out.println("pagina atualizada");
    }
}