package com.lee.blog.blogcodingrepo.mapper;

import com.lee.blog.blogcodingmodel.model.FireZqyj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ZqyjRepository extends JpaRepository<FireZqyj, String> {
    @Override
    Optional<FireZqyj> findById(String s);
}
