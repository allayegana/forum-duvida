package br.com.alura.duvidas.dto;

import br.com.alura.duvidas.modelo.Topico;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();

    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public static Page<TopicoDto> converte(Page<Topico> topicos) {
       return  topicos.map(TopicoDto::new);


    }

}
