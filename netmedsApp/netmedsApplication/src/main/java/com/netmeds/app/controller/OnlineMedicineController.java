package com.netmeds.app.controller;

import com.netmeds.app.entity.Medicines;
import com.netmeds.app.repo.MedicineCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/netmeds")
public class OnlineMedicineController {



    @Autowired
    private MedicineCrudRepo medicineCrudRepo;


    @GetMapping("/exposeData")
    public List<Medicines> getAllMedicines(){
        System.out.println("getting all Medicine Info in our database ");
        return medicineCrudRepo.findAll();


    }

    @PostMapping("/addMedicines")
    public List<Medicines> addmedicines(@RequestBody List<Medicines> medicines){
        return medicineCrudRepo.saveAll(medicines);
    }

    @PutMapping("/updateMedicines")
    public Medicines updatemedicines(@RequestBody Medicines medicines){
        medicineCrudRepo.save(medicines);
        return medicines;

    }

    @DeleteMapping("/delete/{id}")
    public String deleteMedicines(@PathVariable int id){
        medicineCrudRepo.deleteById(id);
        return "deleted successfully";
    }
















}
