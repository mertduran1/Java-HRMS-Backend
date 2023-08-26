package com.example.hrms.business.abstracts.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLocationTypes {
    private int id;
    private String locationTypeNames;
}
