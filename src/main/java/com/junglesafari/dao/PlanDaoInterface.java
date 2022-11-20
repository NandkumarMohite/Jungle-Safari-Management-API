package com.junglesafari.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junglesafari.model.Plan;

@Repository
public interface PlanDaoInterface  extends JpaRepository<Plan, Integer>{

}