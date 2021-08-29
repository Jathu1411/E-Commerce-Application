package com.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
