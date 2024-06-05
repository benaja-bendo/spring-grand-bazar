CREATE TABLE article
(
    id      BIGINT       NOT NULL AUTO_INCREMENT,
    title   VARCHAR(255) NOT NULL,
    content VARCHAR(255) NOT NULL,
    sold    BOOLEAN      NOT NULL,
    seller_id BIGINT,
    PRIMARY KEY (id),
    CONSTRAINT FK_article_seller FOREIGN KEY (seller_id) REFERENCES seller (id)
);

