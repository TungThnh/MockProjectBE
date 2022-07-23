package khangDT;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import vn.com.fsoft.tgdd.entity.Category;
import vn.com.fsoft.tgdd.entity.Product;
import vn.com.fsoft.tgdd.repository.CategoryRepo;
import vn.com.fsoft.tgdd.repository.ProductRepo;

@DataJpaTest
@AutoConfigureTestDatabase
public class ProductTest {

	@Autowired
	ProductRepo proRepo;
	
	@Autowired
	private CategoryRepo cateRepo;
	

}
