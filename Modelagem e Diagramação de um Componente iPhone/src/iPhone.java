public class iPhone  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
    private String numeroSerie;

    public iPhone(String modelo, String numeroSerie){
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }
    public void tocarMusica() {
        System.err.println("Reproduzindo música...");
    }
    public void pausarMusica(){
        System.out.println("Música pausada.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Musica selecionada: " + musica );
    }
    public void fazerchamada(String numero){
        System.out.println("Fazendo chamada para " + numero);
    }
    public void atenderChamada(){
        System.out.println("Chamada atendida.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba(String url){
        System.out.println("Nova aba aberta com a URL: " + url);
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada.");
    }
    @Override
    public void fazerChamada(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerChamada'");
    }
    }
    
    
