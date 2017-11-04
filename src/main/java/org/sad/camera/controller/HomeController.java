package org.sad.camera.controller;

import org.sad.camera.repositories.ManufacturerRepository;
import org.sad.camera.repositories.PartRepository;
import org.sad.camera.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

    private final ProductRepository productRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final PartRepository partRepository;

    @Autowired
    public HomeController(ProductRepository productRepository, ManufacturerRepository manufacturerRepository, PartRepository partRepository) {
        this.productRepository = productRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.partRepository = partRepository;
    }


    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("brand","Sad");
        model.put("product", productRepository.findAll());
        model.put("manufacturer", manufacturerRepository.findAll());
        model.put("part", partRepository.findAll());
        return "home";
    }
}
