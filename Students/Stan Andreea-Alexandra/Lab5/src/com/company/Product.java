package com.company;


import java.util.Objects;

public class Product {

    protected String title;
    private Author author;
    private Double price;
    public static Product[] products=new Product[50];
    public static int nrOfProducts=0;

    public static final int ENTERTAINMENT=0;
    public static final int ELECTRONICS=1;
    public static final int TOYS=2;

    /* create some products of different types and add
     *   them to the same array*/
    public Product() {
        Product.products[Product.nrOfProducts]=this;
        nrOfProducts++;
    }

    public static void getType(int x)
    {
        if(x<0&&x>2)
            return;
        if(x==0){
            for(int i=0;i<nrOfProducts;i++){
                if(products[i] instanceof Entertainment)
                    System.out.println(products[i].getTitle());
            }
        }
        if(x==1){
            for(int i=0;i<nrOfProducts;i++){
                if(products[i] instanceof Electronics)
                    System.out.println(products[i].getTitle());
            }
        }
        if(x==2){
            for(int i=0;i<nrOfProducts;i++){
                if(products[i] instanceof Toys)
                    System.out.println(products[i].getTitle());
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return "default-product-description";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return title.equals(product.title) && author.equals(product.author) && price.equals(product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
