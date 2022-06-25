package khangDT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import khangDT.entity.Category;

@Repository
public interface categoryRepo extends JpaRepository<Category, Integer>{

}
