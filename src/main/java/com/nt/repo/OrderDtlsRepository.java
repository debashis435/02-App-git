package com.nt.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.OrderDetails;

public interface OrderDtlsRepository extends JpaRepository<OrderDetails, Serializable> {

}
