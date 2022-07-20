package br.com.cruzvita.cadastro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.cruzvita.cadastro.dto.PessoaDto;
import br.com.cruzvita.cadastro.enums.TipoIdentificador;
import br.com.cruzvita.cadastro.exceptions.IdentificadorInvalidoException;
import br.com.cruzvita.cadastro.model.Pessoa;
import br.com.cruzvita.cadastro.validator.PessoaValidator;

@RunWith(MockitoJUnitRunner.class)
public class PessoaValidatorTests {
	
	private PessoaDto pessoa;
	
	@InjectMocks
	private PessoaValidator validator;
	
	@Before
	public void init() {
	criaPessoa();
	
	}

	@Test
	public void deveRetornarExceptionCpfMaiorQueTrezeDigitos() {
	pessoa.setIdentificador("323546567587687693213187");
	Assert.assertThrows(IdentificadorInvalidoException.class, () -> validator.validaCampos(pessoa));
	}
	
	@Test
	public void deveRetornarExceptionCpfMenorQueOnzeDigitos() {
	pessoa.setIdentificador("098975333");
	Assert.assertThrows(IdentificadorInvalidoException.class, () -> validator.validaCampos(pessoa));
	}
	
	private void criaPessoa() {
		this.pessoa = new PessoaDto("111342566734312", "Julio Teste", TipoIdentificador.CPF.toString());
	}
}
