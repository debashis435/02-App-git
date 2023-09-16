package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.OrderDetails;
import com.nt.repo.OrderDtlsRepository;

@SpringBootApplication
public class SbmsCustomGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbmsCustomGeneratorApplication.class, args);
		OrderDtlsRepository bean = ctx.getBean(OrderDtlsRepository.class);

		OrderDetails entity = new OrderDetails();
		entity.setOrderBy("Debashis");
		entity.setOrderPlacedDate(new Date());
		OrderDetails savedEntity = bean.save(entity);
		System.out.println(savedEntity);
		ctx.close();

	}

}
