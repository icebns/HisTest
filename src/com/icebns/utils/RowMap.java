package com.icebns.utils;

import java.sql.ResultSet;

public interface RowMap<T> {
    public T rowMapping(ResultSet rs);
}
