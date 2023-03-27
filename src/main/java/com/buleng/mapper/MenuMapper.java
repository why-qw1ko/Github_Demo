package com.buleng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buleng.domain.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long userid);
}
