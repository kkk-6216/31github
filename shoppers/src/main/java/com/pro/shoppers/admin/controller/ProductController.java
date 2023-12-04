
public class ProductController {

    public ProductController() {}

    public String getAllProducts(Model model) {
        model.add("products", null);
        return "products/all_products";
    }
}
