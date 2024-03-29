package br.com.alura.duvidas.form;

import br.com.alura.duvidas.modelo.Topico;
import br.com.alura.duvidas.repository.TopicoRepository;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class atualizaoTopicoForm {


    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String titulo;
    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico actulizar(Long id, TopicoRepository topicoRepository) {

         Topico topico = topicoRepository.getOne(id);
         topico.setTitulo(this.titulo);
         topico.setMensagem(this.mensagem);
        return topico;
    }
}

