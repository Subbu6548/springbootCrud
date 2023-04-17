package com.weareforyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weareforyou.entity.Details;

public interface WeareforyouRepo extends JpaRepository<Details, Long> {

}
