package vn.com.fsoft.TGDD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vn.com.fsoft.TGDD.entity.Product;
import vn.com.fsoft.TGDD.repository.ProductRepo;

@SpringBootApplication
public class TgddBaApplication{
	

	public static void main(String[] args) {
		SpringApplication.run(TgddBaApplication.class, args);
	}

}
