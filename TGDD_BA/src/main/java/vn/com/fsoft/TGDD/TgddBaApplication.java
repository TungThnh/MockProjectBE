package vn.com.fsoft.TGDD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.com.fsoft.TGDD.entity.Account;
import vn.com.fsoft.TGDD.entity.Product;
import vn.com.fsoft.TGDD.repository.AccountRepo;
import vn.com.fsoft.TGDD.repository.ProductRepo;

import java.util.List;

@SpringBootApplication
public class TgddBaApplication{

	public static void main(String[] args) {
		SpringApplication.run(TgddBaApplication.class, args);
	}

}
