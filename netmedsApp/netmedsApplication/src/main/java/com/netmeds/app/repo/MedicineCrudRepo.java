package com.netmeds.app.repo;

import com.netmeds.app.entity.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineCrudRepo extends JpaRepository<Medicines, Integer> {
}
