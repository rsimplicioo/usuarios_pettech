package br.com.rsimplicio.api.usuarios_pettech.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
public record UsuarioDTO(
        Long id,
        @NotBlank(message = "O nome não pode estar em branco.")
        String nome,
        @Email(message = "E-mail inválido.")
        String email,
        @CPF(message = "CPF inválido.")
        String cpf,
        LocalDate dataNascimento
) {
}
