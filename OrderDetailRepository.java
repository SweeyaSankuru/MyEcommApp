package com.order.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.app.entity.OrderDetail;

@Repository

public interface OrderDataRepository extends JpaRepository<Address, Long>{

    @Query(value = "SELECT * FROM customer_template WHERE full_address=:fullAddress", nativeQuery = true)
    public List<Address> getByFullAddress(String fullAddress);
}

