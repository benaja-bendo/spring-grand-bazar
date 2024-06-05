package org.local.grandbazar.repository;

import org.local.grandbazar.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
//    Optional<Seller> findByNom(String nom);
//
//    @Query("SELECT v FROM Seller v JOIN FETCH v.articles WHERE v.id = :id")
//    Optional<Seller> findByIdWithArticles(@Param("id") Long id);
//
//    @EntityGraph(attributePaths = {"articles"})
//    Optional<Seller> findById(Long id);
}
