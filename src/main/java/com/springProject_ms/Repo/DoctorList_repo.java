package com.springProject_ms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProject_ms.Model.DoctorList;


@Repository
public interface DoctorList_repo extends JpaRepository<DoctorList, Integer>{

}

