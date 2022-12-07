package ec.edu.itsqmet.correccion.singleton;

import java.util.List;

import ec.edu.itsqmet.correccion.dto.BirdCategoryDTO;
import ec.edu.itsqmet.correccion.repository.IBirdCategoryRepository;

public class Singleton { 
	private static List<BirdCategoryDTO> birdCategoryDTOs;
	private Singleton() {
	}
	
	public static List<BirdCategoryDTO> getBirds(IBirdCategoryRepository birdCategoryRepository) {
		if (birdCategoryDTOs == null){
			birdCategoryDTOs = birdCategoryRepository.findAll(); 
		}
		return birdCategoryDTOs;
	}
}
