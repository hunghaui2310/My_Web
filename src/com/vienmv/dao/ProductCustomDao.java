package com.vienmv.dao;

import com.vienmv.dto.ProductDTO;

import java.math.BigInteger;
import java.util.List;

public interface ProductCustomDao {

    public List<ProductDTO> getListProduct(ProductDTO productDTO);

    public BigInteger countProduct();
}
