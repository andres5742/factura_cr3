package com.andres.sprigtboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.andres.sprigtboot.di.factura.springboot_difactura.models.Item;
import com.andres.sprigtboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties",encoding = "UTF-8" )
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("camara sony", 800);
        Product p2 = new Product("bicicleta Bianchi 26", 1500);
        return Arrays.asList(new Item(p1, 2),new Item(p2, 3));

        // return items;
    }

    @Bean("default")
    // @Primary
    List<Item> itemsInvoiceOfficce() {
        Product p1 = new Product("teclado mecanico", 300);
        Product p2 = new Product("pantalla 24 pulgadas", 1000);
        Product p3 = new Product("impresora asus", 800);
        Product p4= new Product("escitorio  oficina", 500);
        return Arrays.asList(new Item(p1, 2),new Item(p2, 3),new Item(p3, 1),new Item(p4, 2));

        // return items;
    }

}