package vn.plusplus.k86.springbootexercise.dao;

import vn.plusplus.k86.springbootexercise.mapper.RowMapper;

import java.util.List;

public interface GenericDAO<T> {
    List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);

    void update(String sql, Object... parameters);


}
