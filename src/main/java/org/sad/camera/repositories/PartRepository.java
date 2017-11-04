package org.sad.camera.repositories;

import org.sad.camera.model.Part;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartRepository extends MongoRepository<Part,String> {
}
