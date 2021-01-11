package com.WCS.CheckPoint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WCS.CheckPoint3.entities.Comments;

@Repository
public interface CommentsRepository  extends JpaRepository<Comments, Long>{

}
