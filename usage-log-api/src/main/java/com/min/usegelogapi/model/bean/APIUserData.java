package com.min.usegelogapi.model.bean;

import com.min.usegelogapi.model.tables.UserData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class APIUserData {
    private UserData userData;
}
