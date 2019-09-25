package com.vienmv.service;

import com.vienmv.dto.ProductDTO;

import java.math.BigInteger;
import java.util.List;

public interface ProductServiceCustom {

    public List<ProductDTO> getListProduct(ProductDTO productDTO);

    public BigInteger countProduct();
}
