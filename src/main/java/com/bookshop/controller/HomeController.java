package com.bookshop.controller;

import com.bookshop.model.ProductionModel;
import com.bookshop.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductionService productionService;

    @RequestMapping("/home")
    public String home(Model model) {
        List<ProductionModel> allProduction = productionService.getAllProduction();
        model.addAttribute("allProduction", allProduction);
        return "home";
    }

    @RequestMapping("/production/{idProduction}")
    public String productionDetails(@PathVariable int idProduction, Model model) {
        ProductionModel production = productionService.getProductionById(idProduction);
        if (production == null) {
            model.addAttribute("error", "Không tìm thấy sản phẩm");
        } else {
            model.addAttribute("production", production);
        }

        return "productionDetail";
    }

}
