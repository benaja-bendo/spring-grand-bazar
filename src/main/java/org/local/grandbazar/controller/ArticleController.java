package org.local.grandbazar.controller;

import org.local.grandbazar.entity.Article;
import org.local.grandbazar.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id) {
        return articleService.getArticleById(id);
    }

    @PostMapping
    public Article saveArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable Long id, @RequestBody Article article) {
        return articleService.findById(id)
                .map(art -> {
                    art.setTitle(article.getTitle());
                    art.setContent(article.getContent());
                    art.setSold(article.isSold());
                    return articleService.saveArticle(art);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
    }
}