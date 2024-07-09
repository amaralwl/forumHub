package com.example.forumHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopico(@NotBlank
                                  String titulo,
                                  @NotBlank
                                  String curso,
                                  @NotBlank
                                  String mensagem
                                  ) {
}
