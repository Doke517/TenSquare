package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Daniel
 */
public interface LabelDao extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label> {
}
