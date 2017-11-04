package org.sad.camera.repositories;

import org.sad.camera.model.PartType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartTypeRepository extends MongoRepository<PartType,String> {
}
