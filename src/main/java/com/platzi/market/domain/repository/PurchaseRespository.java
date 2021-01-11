package com.platzi.market.domain.repository;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.PurchaseItem;

import java.util.List;
import java.util.Optional;

public interface PurchaseRespository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
