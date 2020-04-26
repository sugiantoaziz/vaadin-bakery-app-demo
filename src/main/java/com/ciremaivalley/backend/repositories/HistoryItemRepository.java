package com.ciremaivalley.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciremaivalley.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
