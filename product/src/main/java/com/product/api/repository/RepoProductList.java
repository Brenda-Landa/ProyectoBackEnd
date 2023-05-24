package com.product.api.repository;

import com.product.api.entity.DtoProductList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepoProductList extends JpaRepository<DtoProductList, Integer> {
    List<DtoProductList> findByStatus(Integer status);
}
