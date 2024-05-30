CREATE TABLE article (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  content TEXT NOT NULL,
  vendeur_id BIGINT NOT NULL,
  CONSTRAINT fk_article_vendeur FOREIGN KEY (vendeur_id) REFERENCES vendeur(id)
);