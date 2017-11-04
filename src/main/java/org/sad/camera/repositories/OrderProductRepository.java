package org.sad.camera.repositories;

import org.sad.camera.model.OrderProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderProductRepository extends MongoRepository<OrderProduct,String> {
}
