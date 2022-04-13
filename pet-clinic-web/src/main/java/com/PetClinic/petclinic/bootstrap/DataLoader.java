package com.PetClinic.petclinic.bootstrap;

import com.petClinic.petclinic.map.model.Owner;
import com.petClinic.petclinic.map.model.Vet;
import com.petClinic.petclinic.map.service.OwnerService;
import com.petClinic.petclinic.map.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Fiona2");
        owner3.setLastName("Glenanne2");
        ownerService.save(owner3);



        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");



            // your code goes here
            HashSet<Owner> h = (HashSet<Owner>) ownerService.findAll();


        for (Owner cada:h) {
            System.out.println(cada.getFirstName());
        }



    }
}
