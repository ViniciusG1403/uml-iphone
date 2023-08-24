import java.util.List;

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(Musica musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class Musica {
    // Defina atributos e métodos relevantes para a classe Musica
}

class Aba {
    // Defina atributos e métodos relevantes para a classe Aba
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private Aba abaAtiva;
    private List<Musica> listaMusicas;
    private String numeroLigacao;

    public void tocar() {
        // Implementação da reprodução de música
    }

    public void pausar() {
        // Implementação de pausar a reprodução de música
    }

    public void selecionarMusica(Musica musica) {
        // Implementação para selecionar uma música da lista
    }

    public void ligar(String numero) {
        // Implementação para iniciar uma chamada
    }

    public void atender() {
        // Implementação para atender uma chamada
    }

    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
    }

    public void exibirPagina(String url) {
        // Implementação para exibir uma página na internet
    }

    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba no navegador
    }

    public void atualizarPagina() {
        // Implementação para atualizar a página exibida
    }
}

public class iphone {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        meuiPhone.tocar();
        meuiPhone.ligar("123456789");
        meuiPhone.exibirPagina("https://www.example.com");
    }
}