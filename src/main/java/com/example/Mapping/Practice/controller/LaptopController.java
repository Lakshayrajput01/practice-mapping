package com.example.Mapping.Practice.controller;

import com.example.Mapping.Practice.model.Laptop;
import com.example.Mapping.Practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping()
    public String addLaptop(@RequestBody Laptop laptop) {
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("/all")
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("byPrice/{minPrice}-{maxPrice}")
    public List<Laptop> getLaptopsBasedOnPriceRange(@PathVariable Integer minPrice,@PathVariable Integer maxPrice) {
        return laptopService.getLaptopsBasedOnPriceRange(minPrice,maxPrice);
    }

    @DeleteMapping("/byName/{name}")
    public void removeLaptopByName(@PathVariable String name) {
        laptopService.removeLaptopByName(name);
    }

    @PutMapping("/byPrice/{price}/Brand/{brand}")
    public String updatePriceBasedOnBrand(@PathVariable Integer price,@PathVariable String brand) {
        return laptopService.updatePriceBasedOnBrand(price,brand);
    }
}
