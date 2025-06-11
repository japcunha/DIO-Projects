package Iphone.program;

public class Program {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.selectMusic("A lua me traiu - Calypso");
        meuIphone.play();
        meuIphone.pause();

        meuIphone.connect("1234-4567");
        meuIphone.attend();
        meuIphone.startVoiceMail();

        meuIphone.showPage("https://www.showdaspoderosas.com.br");
        meuIphone.addBrowserTab();
        meuIphone.upDatePage();
    }
}
