package com.peaksoft.gadgetarium.controller;

import com.peaksoft.gadgetarium.model.dto.request.BasketRequest;
import com.peaksoft.gadgetarium.model.dto.response.BasketSummaryResponse;
import com.peaksoft.gadgetarium.model.dto.response.ProductResponse;
import com.peaksoft.gadgetarium.service.BasketService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/basket")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BasketController {

    BasketService basketService;

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProductToBasket(@RequestBody BasketRequest request) {
        return basketService.addProductToBasket(request);
    }

    @GetMapping("/getAllProducts")
    public BasketSummaryResponse getProductsFromBasket(@RequestParam Long basketId) {
        return basketService.getProductsFromBasket(basketId);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity<String> deleteProductFromBasket(@PathVariable Long productId, @RequestParam Long basketId) {
        return basketService.deleteProductFromBasket(productId, basketId);
    }

    @GetMapping("/getProductById/{productId}")
    public ProductResponse getProductById(@PathVariable Long productId, @RequestParam Long basketId) {
        return basketService.getProductById(productId, basketId);
    }
}