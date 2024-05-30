package org.local.grandbazar.controller;

import org.local.grandbazar.entity.Vendeur;
import org.local.grandbazar.service.VendeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vendeurs")
public class VendeurController {

  @Autowired
  private VendeurService vendeurService;

  @GetMapping
  public List<Vendeur> getAllVendeurs() {
    return vendeurService.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Vendeur> getVendeurById(@PathVariable Long id) {
    return vendeurService.findById(id)
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public Vendeur createVendeur(@RequestBody Vendeur vendeur) {
    return vendeurService.save(vendeur);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Vendeur> updateVendeur(@PathVariable Long id, @RequestBody Vendeur vendeurDetails) {
    return vendeurService.findById(id)
      .map(vendeur -> {
        vendeur.setNom(vendeurDetails.getNom());
        vendeur.setPrenom(vendeurDetails.getPrenom());
        return ResponseEntity.ok(vendeurService.save(vendeur));
      })
      .orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> deleteVendeur(@PathVariable Long id) {
    return vendeurService.findById(id)
      .map(vendeur -> {
        vendeurService.deleteById(id);
        return ResponseEntity.ok().build();
      })
      .orElse(ResponseEntity.notFound().build());
  }
}
