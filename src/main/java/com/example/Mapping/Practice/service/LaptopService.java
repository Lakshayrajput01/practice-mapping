package com.example.Mapping.Practice.service;

import com.example.Mapping.Practice.model.Laptop;
import com.example.Mapping.Practice.repositories.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo iLaptopRepo;

    public String addLaptop(Laptop laptop) {
        Laptop isAdded = iLaptopRepo.save(laptop);

        if(isAdded != null){
            return "Added laptop successfully..!!!";
        }
        return "failed to add..!!!";
    }

    public List<Laptop> getAllLaptops() {
        return iLaptopRepo.findAll();
    }

    public List<Laptop> getLaptopsBasedOnPriceRange(Integer minPrice, Integer maxPrice) {
        return iLaptopRepo.findByPriceBetween(minPrice,maxPrice);
    }

    public void removeLaptopByName(String name) {
        iLaptopRepo.deleteByName(name);
    }

    public String updatePriceBasedOnBrand(Integer price, String brand) {

        Laptop laptop = iLaptopRepo.findByBrand(brand);

        if(laptop == null){
            return "brand is not Available.";
        }
        laptop.setPrice(price);
        iLaptopRepo.save(laptop);
        return "updated price for "+brand;
    }
}
