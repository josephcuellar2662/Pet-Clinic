package com.springframework.petclinic.bootstrap;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.VetService;
import com.springframework.petclinic.services.map.OwnserServiceMap;
import com.springframework.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;


public class DataLoader implements CommandLineRunner {

    private final OwnerService ownserService;
    private final VetService vetService;

    public DataLoader() {
        this.ownserService = new OwnserServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Phelps");

        ownserService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Oger");

        ownserService.save(owner2);

        System.out.println("Loaded owners... ");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Allison");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Jesse");
        vet1.setLastName("Martinez");

        vetService.save(vet2);

        System.out.println("Loaded vets... ");

    }
}
