import domain.Product;

void main() {
    Product product = new Product();

    product.setName("Celular");
    product.setSku("TSH-BLK");
    product.setPrice(new BigDecimal("1000"));
    product.setPrice(new BigDecimal("999"));

    Product product1 = new Product();

    product1.setName("Not");
    product1.setSku("TBL-ARE");
    product1.setPrice(new BigDecimal("2000"));
    product1.setPrice(new BigDecimal("2500"));


    Product product2 = new Product();

    product2.setName("PC Gamer Simples");
    product2.setSku("TES-AOK");
    product2.setPrice(new BigDecimal("3800"));
    product2.setPrice(new BigDecimal("3600"));

    System.out.println("Lista de Produto: \n" + product.toString() +
    "\n" + product1.toString() + "\n" + product2.toString());

}
