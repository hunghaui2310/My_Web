package com.vienmv.service.impl;

import com.vienmv.dao.ProductCustomDao;
import com.vienmv.dto.ProductDTO;
import com.vienmv.service.ProductServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class ProductServiceCustomImpl implements ProductServiceCustom {

    @Autowired
    private ProductCustomDao productCustomDao;

    @Override
    public List<ProductDTO> getListProduct(ProductDTO productDTO) {
        return productCustomDao.getListProduct(productDTO);
    }

    @Override
    public BigInteger countProduct() {
        return productCustomDao.countProduct();
    }
}
