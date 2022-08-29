package com.oscngl.design.patterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Boolean inStock;
    private LocalDateTime date;

    public static class ProductBuilder {

        private Long id;
        private String name;
        private String description;
        private BigDecimal price;
        private Boolean inStock;
        private LocalDateTime date;

        public Product build() {
            return new Product(this);
        }

        public ProductBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public ProductBuilder inStock(Boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        public ProductBuilder date(LocalDateTime date) {
            this.date = date;
            return this;
        }

    }

    public Product() {

    }

    public Product(ProductBuilder productBuilder) {
        this.id = productBuilder.id;
        this.name = productBuilder.name;
        this.description = productBuilder.description;
        this.price = productBuilder.price;
        this.inStock = productBuilder.inStock;
        this.date = productBuilder.date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", date=" + date +
                '}';
    }
}
