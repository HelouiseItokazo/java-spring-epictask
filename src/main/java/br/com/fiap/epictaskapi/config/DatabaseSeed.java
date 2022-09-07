package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.repository.TaskRepository;


@Configuration
public class DatabaseSeed implements CommandLineRunner {

	@Autowired
	public TaskRepository taskRepository;

	@Override
	public void run(String... args) throws Exception {

		taskRepository.saveAll(List.of(new Task("Modelar o BD", "Modelar as tabelas do banco de dados"),
				new Task("Protipar telas", "Modelar as tabelas do banco de dados"),
				new Task("Bug", "Modelar as tabelas do banco de dados"),
				new Task("Deploy", "Modelar as tabelas do banco de dados"),
				new Task("Login", "Modelar as tabelas do banco de dados"),
				new Task("Outro Bug", "Modelar as tabelas do banco de dados"),
				new Task("Logout", "Modelar as tabelas do banco de dados"),
				new Task("Cadastro de cliente", "Modelar as tabelas do banco de dados"),
				new Task("Consulta de cliente", "Modelar as tabelas do banco de dados")));

	}

}
