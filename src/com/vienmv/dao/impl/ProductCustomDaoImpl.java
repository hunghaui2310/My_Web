package com.vienmv.dao.impl;

import com.vienmv.dao.ProductCustomDao;
import com.vienmv.dto.ProductDTO;
import com.vienmv.helper.DataUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.ArrayList;
import com.vienmv.jdbc.JDBCConnection;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ProductCustomDaoImpl extends JDBCConnection implements ProductCustomDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<ProductDTO> getListProduct(ProductDTO productDTO) {
        HashMap mapParams = new HashMap();
        Long count = 0L;
        List<ProductDTO> lstData=null;
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("SELECT product.id, product.name, product.price, product.image, product.des , category.cate_name, category.cate_id " +
                "FROM product INNER JOIN category " +
                "ON product.cate_id = category.cate_id ");

        Query query = entityManager.createNativeQuery(sqlBuilder.toString());
        query.setFirstResult((productDTO.getPage()-1) * productDTO.getPageSize());
        query.setMaxResults(productDTO.getPageSize());
        mapParams.forEach((k,v)->{
            query.setParameter(k.toString(),v);
        });
        List<Object[]> lst = query.getResultList();
        if(!DataUtil.isNullOrEmpty(lst)){
            lstData = new ArrayList<>();
            for(Object[] obj : lst){
                ProductDTO data = new ProductDTO();
                data.setId(DataUtil.safeToInt(obj[0]));
                data.setName(DataUtil.safeToString(obj[1]));
                data.setPrice(DataUtil.safeToLong(obj[2]));
                data.setImage(DataUtil.safeToString(obj[3]));
                data.setDes(DataUtil.safeToString(obj[4]));
                data.setCateName(DataUtil.safeToString(obj[5]));
                data.setCateId(DataUtil.safeToInt(obj[6]));
                lstData.add(data);
            }
        }
        return lstData;
    }

    @Override
    public BigInteger countProduct(){
        HashMap mapParams = new HashMap();
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("select count(*) from Product");
        Query query = entityManager.createNativeQuery(sqlBuilder.toString());
        mapParams.forEach((k, v) -> {
            query.setParameter(k.toString(), v);
        });
        return (BigInteger) query.getSingleResult();
    }

}
