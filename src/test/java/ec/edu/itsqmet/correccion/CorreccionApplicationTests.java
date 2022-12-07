package ec.edu.itsqmet.correccion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.correccion.dto.BirdCategoryDTO;
import ec.edu.itsqmet.correccion.repository.IBirdCategoryRepository;

@SpringBootTest
class CorreccionApplicationTests {
	@Autowired
	private IBirdCategoryRepository birdCategoryRepository;

	@Test
	void contextLoads() {
		birdCategoryRepository.findAll();
		for (BirdCategoryDTO iterable_element : birdCategoryRepository.findAll()) {
			System.out.println("ID:" + iterable_element.getId() + ", TYPE:" + iterable_element.getName());
		}
	}

}
