package com.zosh.service;

import com.zosh.model.Home;
import com.zosh.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
