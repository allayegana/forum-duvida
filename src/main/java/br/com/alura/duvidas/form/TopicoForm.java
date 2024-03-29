package br.com.alura.duvidas.form;

import br.com.alura.duvidas.modelo.Curso;
import br.com.alura.duvidas.modelo.Topico;
import br.com.alura.duvidas.repository.CursoRepository;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class TopicoForm {


    @NotNull @NotEmpty @Length(min = 5)
    private  String titulo;
    @NotNull @NotEmpty @Length(min = 10)
    private  String mensagem;
    @NotNull @NotEmpty
    private  String nomeCurso;


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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converte(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo,mensagem,curso);
    }
}
