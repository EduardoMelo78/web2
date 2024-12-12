package projeto.ifba.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.ifba.modelo.Pessoa;
import projeto.ifba.repositorios.RepositorioPessoa;

@RestController
@RequestMapping (value = "pessoa")
public class ControlePessoa {
	
	@Autowired
	RepositorioPessoa repo;
	
	@PostMapping           //METHOD:post, URL: localhosto:8080/pessoa, Body: Pessoa (JSON)
	public void inserir(@RequestBody Pessoa p) {
		repo.save(p);
		
		//save
	}
	
	@GetMapping
	public List<Pessoa> listar() {
		
		//findAll
		return repo.findAll();
	}
	
	@GetMapping("/{id}") 	//GET, localhost:8080/pessoa/ID
	public Optional<Pessoa> localizarPorId(@PathVariable ("id") int id) {
		
		//findAll
		return repo.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable ("id") int id) {
		repo.deleteById(id);
		return "usuario de id: "+ id +" deletado com sucesso";
	}
	
	
}
