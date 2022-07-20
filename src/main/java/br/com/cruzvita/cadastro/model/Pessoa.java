package br.com.cruzvita.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.cruzvita.cadastro.dto.PessoaDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "pessoa")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
	
	public Pessoa(PessoaDto pessoaDto) {
		this.identificador = pessoaDto.getIdentificador();
		this.nome = pessoaDto.getNome();
		this.tipoIdentificador = pessoaDto.getTipoIdentificador();
	}

	@Id
	@Column(name = "identificador")
	private String identificador;
	@Column(name = "nome")
	private String nome;
	@Column(name = "tipo_identificador")
	private String tipoIdentificador;
}
