package com.dopveb.sales_records.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dopveb.sales_records.pojo.Record;


@Controller
public class SalesRecordsController {

    /* List<Record> records = Arrays.asList(
        new Record("Chair", new BigDecimal("20.99"), new BigDecimal("5.99")),
        new Record("Table", new BigDecimal("40.99"), new BigDecimal("8.99")),
        new Record("Couch", new BigDecimal("100.99"), new BigDecimal("105.99")),
        new Record("Fridge", new BigDecimal("200.99"), new BigDecimal("59.99")),
        new Record("Bed", new BigDecimal("150.99"), new BigDecimal("205.99"))
    ); */
    List<Record> records = Arrays.asList(
        createRecord("Chair", 20.99, 5.99),
        createRecord("Table", 40.99, 8.99),
        createRecord("Couch", 100.99, 105.99),
        createRecord("Fridge", 200.99, 59.99),
        createRecord("Bed", 150.99, 205.99)
    );

    private Record createRecord(String item, double revenue, double cost){
        return new Record(item, new BigDecimal(Double.toString(revenue)), new BigDecimal(Double.toString(cost)));
    }
    
    @GetMapping
    public String getSalesRecords(Model model) {
        model.addAttribute("records", records);
        return "records";
    }
}