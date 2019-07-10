package cn.how2j.springcloud.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.how2j.springcloud.pojo.Product;
import cn.how2j.springcloud.service.ProductService;
 
@Controller
public class ProductController {
 
	@Autowired ProductService productService;

	@Value("${version}")
	private String version;
	@Value("${author}")
	private String author;
	@Value("${encryptMethod}")
	private String encryptMethod;
	@Value("${encryptTimes}")
	private String encryptTimes;

	@RequestMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
    	m.addAttribute("ps", ps);
    	m.addAttribute("version",version);
    	m.addAttribute("author",author);
    	m.addAttribute("encryptMethod",encryptMethod);
    	m.addAttribute("encryptTimes",encryptTimes);
        return "products";
    }
}