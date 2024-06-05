package org.local.grandbazar.service;

import org.local.grandbazar.entity.Article;
import org.local.grandbazar.repository.ArticleRepository;
import org.local.grandbazar.repository.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final SellerRepository sellerRepository;

    public ArticleService(ArticleRepository articleRepository, SellerRepository sellerRepository) {
        this.articleRepository = articleRepository;
        this.sellerRepository = sellerRepository;
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
}