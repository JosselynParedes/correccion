package ec.edu.itsqmet.correccion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.correccion.dto.BirdCategoryDTO;

public interface IBirdCategoryRepository extends JpaRepository<BirdCategoryDTO, Integer>{

}
