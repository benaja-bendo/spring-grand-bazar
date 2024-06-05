package org.local.grandbazar.repository;

import org.local.grandbazar.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
//    List<Article> findByVendeurId(Long vendeurId);
}