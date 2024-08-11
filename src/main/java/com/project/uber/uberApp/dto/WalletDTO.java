package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.entities.User;
import com.project.uber.uberApp.entities.WalletTransaction;
import lombok.Data;

import java.util.List;

@Data
public class WalletDTO {

    private Long id;
    private User user;
    private Double balance;
    private List<WalletTransaction> transactions;
}
