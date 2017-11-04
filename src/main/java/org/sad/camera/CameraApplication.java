package org.sad.camera;

import org.sad.camera.model.*;
import org.sad.camera.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CameraApplication {

//	private final ManufacturerRepository manufacturerRepository;
//	private final OrderRepository orderRepository;
//	private final OrderPartRepository orderPartRepository;
//	private final OrderProductRepository orderProductRepository;
//	private final PartRepository partRepository;
//	private final PartTypeRepository partTypeRepository;
//	private final ProductRepository productRepository;
//	private final UpdateProductRepository updateProductRepository;
//	private final UserRepository userRepository;
//
//	@Autowired
//	public CameraApplication(ManufacturerRepository manufacturerRepository, OrderRepository orderRepository, OrderPartRepository orderPartRepository, OrderProductRepository orderProductRepository, PartRepository partRepository, PartTypeRepository partTypeRepository, ProductRepository productRepository, UpdateProductRepository updateProductRepository, UserRepository userRepository) {
//		this.manufacturerRepository = manufacturerRepository;
//		this.orderRepository = orderRepository;
//		this.orderPartRepository = orderPartRepository;
//		this.orderProductRepository = orderProductRepository;
//		this.partRepository = partRepository;
//		this.partTypeRepository = partTypeRepository;
//		this.productRepository = productRepository;
//		this.updateProductRepository = updateProductRepository;
//		this.userRepository = userRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(CameraApplication.class, args);
	}

//	@Override
//	public void run(String... strings) throws Exception {
//		// create test record
//		manufacturerRepository.save(new Manufacturer(1,"Canon","/images/canon.jpg"));
//		orderRepository.save(new Order(1,"Nguyen Phi Long","philong.nguyen@hotmail.com","Ha Noi","0965561088"));
//		orderPartRepository.save(new OrderPart(1,1,1));
//		orderProductRepository.save(new OrderProduct(1,1,1));
//		partRepository.save(new Part(1,1,"Ong Kinh","24 Thang",50,"/images/ongkinh.jpg","Ong Kinh nhin xuyen quan ao"));
//		partTypeRepository.save(new PartType(1,"Lends"));
//		productRepository.save(new Product(1,1,"Canon Mx120","tron doi",5000,30,"May anh do choi","/images/canon/mx120.jpg","hu cau","/images/full/canon/mx120.jpg","9001"));
//		updateProductRepository.save(new UpdateProduct(1,new Date()));
//		userRepository.save(new User(1,"admin","admin","nguyễn phi long","philong.nguyen@hotmail.com","Hà Nội","10"));
//	}
}
