package com.zosh.service;

import com.zosh.model.HomeCategory;

import java.util.List;

public interface HomeCategoryService {
    HomeCategory createCategory(HomeCategory categories);
    List<HomeCategory> createCategories(List<HomeCategory> categories);
    List<HomeCategory> getAllCategories();
    HomeCategory updateCategory(HomeCategory categories,Long id) throws Exception;
}
