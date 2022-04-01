package com.project1.repo;

import com.project1.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepo extends JpaRepository<Mobile, Long> {
}
