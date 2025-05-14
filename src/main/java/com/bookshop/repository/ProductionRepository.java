package com.bookshop.repository;

import com.bookshop.model.ProductionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ProductionModel> getAllProduction() {
        String sql = "select * from PRODUCTION";
        List<ProductionModel> response = jdbcTemplate.query(sql, new Object[] {}, new RowMapper<ProductionModel>() {

            @Override
            public ProductionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                ProductionModel productionModel = new ProductionModel();
                productionModel.setId(rs.getInt("id"));
                productionModel.setTitle(rs.getString("title"));
                productionModel.setDescription(rs.getString("description"));
                productionModel.setAuthor(rs.getString("author"));
                productionModel.setPrice(rs.getInt("price"));

                return productionModel;
            }
        });

        return response;
    }


    public ProductionModel getProductionById(int id) {
        String sql = "select * from PRODUCTION where id = ?";
        ProductionModel response = jdbcTemplate.queryForObject(sql, new Object[] {id}, new RowMapper<ProductionModel>() {
            @Override
            public ProductionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                ProductionModel productionModel = new ProductionModel();
                productionModel.setId(rs.getInt("id"));
                productionModel.setTitle(rs.getString("title"));
                productionModel.setDescription(rs.getString("description"));
                productionModel.setAuthor(rs.getString("author"));
                productionModel.setPrice(rs.getInt("price"));

                return productionModel;
            }
        });

        return response;
    }

}
