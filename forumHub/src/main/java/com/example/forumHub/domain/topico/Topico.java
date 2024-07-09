package com.example.forumHub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private boolean status;
    private String autor;
    private String curso;

    public Topico(DadosCadastroTopico dados, String usuarioLogado) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = LocalDateTime.now();
        this.status = true;
        this.autor = usuarioLogado;
        this.curso = dados.curso();
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dados) {
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.curso() != null){
            this.curso = dados.curso();
        }
        if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
    }
}
