package com.smoothstack.avalanche.lms.librarianmsvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.avalanche.lms.librarianmsvc.entity.Borrower;


@Repository
public interface BorrowerDAO extends JpaRepository<Borrower ,Long>{

}
