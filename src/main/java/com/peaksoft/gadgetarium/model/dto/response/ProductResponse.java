package com.peaksoft.gadgetarium.model.dto.response;
import com.peaksoft.gadgetarium.model.entities.Brand;
import com.peaksoft.gadgetarium.model.entities.SubCategory;
import com.peaksoft.gadgetarium.model.enums.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponse {
    Long id;
    String productName;
    ProductStatus productStatus;
    OperationMemory operationMemory;
    OperationSystem operationSystem;
    SubCategory subCategory;
    Brand brand;
    LocalDate createDate;
    Memory memory;
    Color color;
    String operationSystemNum;
    String dateOfRelease;
    String processor;
    String guarantee;
    String screen;
    String simCard;
    Double rating;
    int discount;
    int weight;
    int price;
}
