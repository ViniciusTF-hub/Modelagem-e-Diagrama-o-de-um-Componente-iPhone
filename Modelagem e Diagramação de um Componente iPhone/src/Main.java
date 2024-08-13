public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iphone 2007", "iphone2007vscode");
        
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
        meuIphone.selecionarMusica("Old Town Road");
        
        meuIphone.fazerchamada("4004-8922");
        meuIphone.atenderChamada();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.dio.me");
        meuIphone.adicionarNovaAba("github.com");
        meuIphone.atualizarPagina();
    }
}
