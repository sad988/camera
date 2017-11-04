package org.sad.camera.repositories;

import org.sad.camera.model.OrderPart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderPartRepository extends MongoRepository<OrderPart,String> {
}
