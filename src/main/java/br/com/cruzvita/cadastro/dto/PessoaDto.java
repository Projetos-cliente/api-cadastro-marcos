package br.com.cruzvita.cadastro.dto;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto {
		private String identificador;
		private String nome;
		private String tipoIdentificador;
}
