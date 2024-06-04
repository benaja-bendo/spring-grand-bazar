package org.local.grandbazar.service;

import org.local.grandbazar.entity.Vendeur;
import org.local.grandbazar.repository.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendeurService {
    @Autowired
    private VendeurRepository vendeurRepository;

    public List<Vendeur> findAll() {
        return vendeurRepository.findAll();
    }

    public Optional<Vendeur> findById(Long id) {
        return vendeurRepository.findById(id);
    }

    public Vendeur save(Vendeur article) {
        return vendeurRepository.save(article);
    }

    public void deleteById(Long id) {
        vendeurRepository.deleteById(id);
    }
}
