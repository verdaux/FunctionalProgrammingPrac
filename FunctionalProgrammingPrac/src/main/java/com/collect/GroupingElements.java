package com.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingElements
{
    public static void main(String[] args)
    {
        List<Product> products = List.of(
                                            new Product("Laptop","Electronics"),
                                            new Product("Shirt","Clothing"),
                                            new Product("Phone","Electronics"),
                                            new Product("Jeans","Clothing")
                                            );

        Map<String,List<Product>> productGroup = products
                                                .stream()
                                                .collect(
                                                            Collectors
                                                                        .groupingBy(
                                                                                    Product::getCategory
                                                                                    )
                                                    )
                ;
        System.out.println(productGroup);
    }
}
