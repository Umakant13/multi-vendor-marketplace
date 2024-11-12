package com.zosh.service;

import com.zosh.dto.RevenueChart;

import java.util.List;
import java.util.Map;

public interface RevenueService {
    List<RevenueChart> getDailyRevenueForChart(int days, Long sellerId);
    List<RevenueChart> getMonthlyRevenueForChart(int months,Long sellerId);
    List<RevenueChart> getYearlyRevenueForChart(int years,Long sellerId);
    List<RevenueChart> getHourlyRevenueForChart(Long sellerId);
    List<RevenueChart> getRevenueChartByType(String type,Long sellerId);
}
