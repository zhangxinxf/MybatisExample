package com.zx.dao;

import java.util.List;

import com.zx.model.Classes;

public interface ClassesMapper {

   public Classes findById(Integer id);

   public List<Classes> findAll();
}
