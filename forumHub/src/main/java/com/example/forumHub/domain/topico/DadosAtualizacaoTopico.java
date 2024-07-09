package com.example.forumHub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(String titulo,
                                     String curso,
                                     String mensagem) {
}
