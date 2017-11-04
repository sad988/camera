package org.sad.camera.repositories;

import org.sad.camera.model.UpdateProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UpdateProductRepository extends MongoRepository<UpdateProduct,String> {
}
