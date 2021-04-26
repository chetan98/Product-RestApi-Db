package com.kavki.productdb.Controller;

import com.kavki.productdb.Entity.Product;
import com.kavki.productdb.Service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/get")
    public List<Product> findAllProducts(){
       return apiService.getProducts();
    }

    @GetMapping("/getbyid/{id}")
    public Product getProductById(@PathVariable int id){
        return apiService.getProductById(id);
    }

    @GetMapping("/getby/{name}")
    public Product getProductByName(@PathVariable String name){
        return apiService.getProductByName(name);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return apiService.addProduct(product);
    }

    @PostMapping("/adds")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return  apiService.addProducts(products);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return apiService.deleteProduct(id);
    }

    @PutMapping("/update")
    public  Product updateProduct(@RequestBody Product product){
        return  apiService.updateProduct(product);
    }
}
