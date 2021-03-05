package com.springframework.petclinic.service.map;

import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.service.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
